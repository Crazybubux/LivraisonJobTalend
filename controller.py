from shutil import copyfile

from PyQt5.QtCore import QUrl

from file_ini import file_ini
import glob
import operator
import os
import shutil
from ssh import ssh
from sftp import sftp
import ntpath
import zipfile
from ThreadWithReturnValue import ThreadWithReturnValue
from tkinter import *

# -*- coding: utf-8 -*-

class controller():
    def __init__(self, logs = [], display_strings = [], log_line_id=0):
        # pass
        self.logs = logs
        self.display_strings = display_strings
        self.log_line_id = log_line_id

    def init_log_file(self):
        f = open('log.txt', 'w')

    def append_logs(self, log):
        with open('log.txt', 'a') as log_file:
            log_file.write(log+'\n')
        self.logs.append(log)
        self.log_line_id+=1

    def get_logs(self):
        return self.logs

    def get_display_string(self, string_name):
        matchings = [s for s in self.display_strings if string_name in s]
        return matchings

    def get_current_directory(self):
        return os.getcwd()

    def load_ini_file_section(self, ini_filename, section):
        current_directory = self.get_current_directory()
        try:
            os.chdir(current_directory + '\\LivraisonJobTalend')
        except Exception as e:
            pass
        ini_file = file_ini(ini_filename)
        config = ini_file.read_ini_file()
        users_list = ini_file.read_options(config, section)
        return users_list

    def copy_to_clipboard(self, string):
        r = Tk()
        r.withdraw()
        r.clipboard_clear()
        r.clipboard_append(string)
        r.update()
        r.destroy()

    def create_directory(self, dirName):
        try:
            if not os.path.exists(dirName):
                os.makedirs(dirName)
        except Exception as e:
            raise e

    def delete_file(self, path, pattern):
        file = glob.glob(path+"\\"+pattern)[0]
        if len(file) > 0 :
            os.remove(file)

    def file_or_folder_exists(self, path, pattern):
        file = glob.glob(path+"\\"+pattern)
        # print('pattern : %s' % pattern)
        # print('file or folder : %s' % file)
        # print('filepath : %s %s' % (file, path))
        file_exists = False
        try:
            if not file[0] == '':
                file_exists = True
            # print('file[0] : %s' % file[0])
            # print('file[1] : %s' % file[1])
            # print('Pas d\'erreur.')
        except IndexError as ie:
            print('Erreur %s pour %s %s' % (ie, file, path))
        return file_exists

    def path_leaf(self, path):
        head, tail = ntpath.split(path)
        return tail or ntpath.basename(head)

    def get_filename(self, path, pattern):
        try:
            list_of_files = glob.glob(path+"\\"+pattern)
            filename = self.path_leaf(list_of_files[0])
            return filename
        except IndexError as ie:
            print('Le fichier n\'a pas été trouvé.')

    def extract_regexp(self, string, regexp, index):
        result_list = []
        try:
            for match in re.findall(regexp, string):
                result_list.append(match)
        except AttributeError as ae:
            print(ae)
        return result_list[index]

    def transco_from_ini_file(self, domaine):
        transcos = self.load_ini_file_section('config.ini', 'transcos')
        for transco in transcos:
            if domaine == transco[1].upper():
                domaine = transco[2].upper()
                break
        return domaine

    def split_over(self, string, split_string, index_to_extract):
        hash_word = string.split(split_string)
        result = operator.itemgetter(index_to_extract)(hash_word)
        return result

    def extract_zip_file(self, filepath, destination_path):
        with zipfile.ZipFile(filepath, 'r') as zip_ref:
            zip_ref.extractall(destination_path)

    def generate_mantis_message(self, build_path, version, user):
        self.display_strings.append(['MESSAGE_MANTIS', 'Bonjour,'])
        self.display_strings.append(['MESSAGE_MANTIS', ''])
        self.display_strings.append(['MESSAGE_MANTIS', 'Le livrable est disponible en version '+version+' à l\'emplacement suivant :'])
        self.display_strings.append(['MESSAGE_MANTIS', build_path])
        self.display_strings.append(['MESSAGE_MANTIS', ''])
        self.display_strings.append(['MESSAGE_MANTIS', 'La documentation a été livrée.'])
        self.display_strings.append(['MESSAGE_MANTIS', ''])
        self.display_strings.append(['MESSAGE_MANTIS', 'Le job a également été déployé sur la recette.'])
        self.display_strings.append(['MESSAGE_MANTIS', ''])
        self.display_strings.append(['MESSAGE_MANTIS', 'Cordialement,'])
        self.display_strings.append(['MESSAGE_MANTIS', user])

    def controls_before_execution(self, jobname, mantis_number, build_folder_path, doc_folder_path, build_destination, doc_destination, pattern):
        error_list = []
        flag=True
        if jobname == "":
            self.display_strings.append(['JOBNAME_ABSENT', "Le nom du job n'a pas été renseigné."])
            flag=False
        if mantis_number == "":
            self.display_strings.append(['ARCHIVE_DOC_ABSENTE', "Le numéro de mantis n'a pas été renseigné."])
            flag=False
        if not self.file_or_folder_exists(build_folder_path, pattern):
            self.display_strings.append(['ARCHIVE_DOC_ABSENTE', "Aucun fichier build zip n'est présent."])
            flag=False
        if not self.file_or_folder_exists(doc_folder_path, pattern):
            self.display_strings.append(['ARCHIVE_DOC_ABSENTE', 'L\'archive .zip de la documentation n\'est pas présente.'])
            self.append_logs('%s KO Le zip de la documentation est absent du dossier %s.' % (self.log_line_id, doc_folder_path))
            flag=False
        if self.file_or_folder_exists(build_destination, pattern):
            self.display_strings.append(['BUILD_EXISTE', 'Le build existe déjà.'])
            self.append_logs('%s KO Le build est absent du dossier %s.' % (self.log_line_id, doc_folder_path))
            flag=False
        if self.file_or_folder_exists(doc_destination, jobname+'*'):
            self.display_strings.append(['DOC_EXISTE', 'La documentation existe déjà.'])
            flag=False
        ini_file = file_ini('config.ini')
        if not file_ini.exists(ini_file):
            error_list.append("Le fichier config.ini est introuvable.")
            flag=False
        return flag, error_list

    def run(self, jobname, mantis_number, user):
        self.init_log_file()
        self.append_logs('%s. Début de la livraison.' % self.log_line_id)
        pattern = jobname + '*.zip'
        domaine = self.extract_regexp(jobname, '^\w{3}_(\w{3})', 0)
        domaine = self.transco_from_ini_file(domaine)

        current_directory = self.get_current_directory()
        build_filename = self.get_filename(current_directory, pattern)
        version = self.extract_regexp(build_filename, '(\d\.\d+)', 0)

        source_build_file = current_directory + '\\' + build_filename
        target_build_jobname_folder_path = '\\\\pw1920inf024\\Livrable_Talend\\FLUX\\LIV\\' + domaine + '\\' + jobname
        target_build_mantis_folder_path = '\\\\pw1920inf024\\Livrable_Talend\\FLUX\\LIV\\' + domaine + '\\' + jobname + '\\Mantis_00' + mantis_number
        target_build_build_folder_path = '\\\\pw1920inf024\\Livrable_Talend\\FLUX\\LIV\\' + domaine + '\\' + jobname + '\\Mantis_00' + mantis_number + '\\Build_du_job'

        source_doc_folder_path = current_directory + '\\DOC'
        source_doc_file = current_directory + '\\DOC\\' + build_filename
        target_doc_folder_path = '\\\\pw1920inf024\\DOC_Talend\\'
        target_doc_jobname_folder_path = '\\\\pw1920inf024\\DOC_Talend\\' + jobname + '\\'
        target_doc_buildname_folder_path = '\\\\pw1920inf024\\DOC_Talend\\' + jobname + '\\' + jobname + '_' + version
        target_build_filename = target_build_build_folder_path+'\\'+os.path.basename(os.path.normpath(source_build_file))

        # Ajout des chaînes de caractères déstinées à l'affichage
        self.display_strings.append(['BUILD_DESTINATION', '<a href=\"file:'+target_build_build_folder_path+'\">Ouvrir le dossier</a>'])
        self.display_strings.append(['DOC_DESTINATION', '<a href=\"file:'+target_doc_jobname_folder_path+'\">Ouvrir le dossier</a>'])
        self.display_strings.append(['LIEN_DU_MANTIS', '<a href=\"http://mantis/mantis_prd/view.php?id='+mantis_number+'\">'+'http://mantis/mantis_prd/view.php?id='+mantis_number+'</a>'])
        # Ajout des chaînes de caractères déstinées à l'affichage

        flag_controls, error_list = self.controls_before_execution(jobname, mantis_number, current_directory, source_doc_folder_path, target_build_filename, target_doc_jobname_folder_path, pattern)
        print('flag_controls : %s' % flag_controls)
        if flag_controls:

            self.append_logs('%s. OK Contrôles OK' % self.log_line_id)
            # Liste des contrôles :
            # Le nom du flux a été renseigné.
            # Le numéro de mantis a été renseigné.
            # Le fichier build jobname + *.zip est bien présent.
            # Le fichier doc jobname + *.zip est bien présent.
            # Le fichier build jobname + *.zip n'existe pas déjà en cible.
            # Le fichier doc jobname + *.zip n'existe pas déjà en cible.
            if not self.file_or_folder_exists(target_build_jobname_folder_path, ''):
                self.create_directory(target_build_jobname_folder_path)
                self.append_logs('%s. OK Dossier %s créé.' % (self.log_line_id, target_build_jobname_folder_path))
            else:
                self.append_logs('%s. OK Dossier %s déjà existant.' % (self.log_line_id, target_build_jobname_folder_path))
            if not self.file_or_folder_exists(target_build_mantis_folder_path, ''):
                self.create_directory(target_build_mantis_folder_path)
                self.append_logs('%s. OK Dossier %s créé.' % (self.log_line_id, target_build_mantis_folder_path))
            else:
                self.append_logs('%s. OK Dossier %s déjà existant.' % (self.log_line_id, target_build_mantis_folder_path))
            if not self.file_or_folder_exists(target_build_build_folder_path, ''):
                self.create_directory(target_build_build_folder_path)
                self.append_logs('%s. OK Dossier %s créé.' % (self.log_line_id, target_build_build_folder_path))
            else:
                self.append_logs('%s. OK Dossier %s déjà existant.' % (self.log_line_id, target_build_build_folder_path))
            if not self.file_or_folder_exists(target_doc_folder_path, ''):
                self.create_directory(target_doc_folder_path)
                self.append_logs('%s OK Dossier %s créé.' % (self.log_line_id, target_doc_folder_path))
            if not self.file_or_folder_exists(target_doc_jobname_folder_path, ''):
                self.create_directory(target_doc_jobname_folder_path)
                self.append_logs('%s OK Dossier %s créé.' % (self.log_line_id, target_doc_jobname_folder_path))

            # Lecture du fichier config.ini
            sftp_params = self.load_ini_file_section('config.ini', 'sftp')
            # Extraction du zip dans le dossier cible
            self.extract_zip_file(source_doc_file, target_doc_buildname_folder_path)
            self.append_logs('%s OK Contenu de l\'archive %s déplacé dans %s.' % (self.log_line_id, source_doc_file, target_doc_buildname_folder_path))
            # TODO SFTP
            sftp_params = self.load_ini_file_section('config.ini', 'sftp')

            file_mask = sftp_params[1]
            target_file_path = sftp_params[2]
            ftp_address = sftp_params[3]
            ftp_username = sftp_params[4]
            ftp_password = sftp_params[5]
            list_strings = sftp_params[6]
            search = sftp_params[7]
            wait_in_seconds = sftp_params[8]
            connexion_sftp_talend_rec = self.sftp_connection(ftp_address, ftp_username, ftp_password, target_file_path)
            self.sftp_put(connexion_sftp_talend_rec, source_build_file)
            # TODO SFTP
            # On génère le message à destination de mantis.
            self.generate_mantis_message(target_build_build_folder_path, version, user)

            # sftp_connection = sftp.connection(ftp_address, ftp_username, ftp_password, target_file_path)
                # control.delete_file(source_build_folder_path, pattern)
            # TODO SSH
            #
            connexion_ssh_talend_rec = self.ssh_connection(ftp_address, ftp_username, ftp_password)
            shell_cmd_installation = 'livraison_talend.sh /tmp/%s OF' % source_build_file
            self.ssh_run_shell_command(connexion_ssh_talend_rec, "cd /tmp")
            self.ssh_run_shell_command(connexion_ssh_talend_rec, shell_cmd_installation)
            # TODO
            # Déplacement du build dans le dossier cible
            print('Déplacement du fichier %s : \n vers : %s' % (source_build_file, target_build_build_folder_path))
            # shutil.move(source_build_file, target_build_build_folder_path)
            # TODO CopyToClipboard
            #
            # TODO OpenURL
            # os.startfile("http://mantis/mantis_prd/view.php?id="+self.getMantisNumber())
            #
            # TODO Create "Application" ServiceNow
        else:
            # error_list.append('%s KO Le livrable %s existe déjà.' % (self.log_line_id, source_build_file))
            error_list.append('%s KO Un des prérequis n''est pas respecté.' % (self.log_line_id))

        # if len(error_list) != 0:
        #     print('================ERRORS==================')
        #     for error in error_list:
        #         self.append_logs('%s' % (self.log_line_id, error))
        #         print('Erreur : %s' % error)
        #     print('================ERRORS==================')
        self.append_logs('99. Fin de la livraison.')
        return self.logs

if __name__ == "__main__":
    jobname = 'IDG_TES_DEC_ODS_OMNICANAL'
    mantis_number = '20000'
    user = 'Guillaume'
    control = controller()
    thread_delivery = ThreadWithReturnValue(target=control.run, args=(jobname, mantis_number, user))
    thread_delivery.start()
    # logs, display_strings = thread_delivery.join()
    # logs = thread_delivery.join()
    # for log in logs:
    #     print('Log : %s' % log)
    # for string in control.display_strings:
    #     print('string : %s' % string)