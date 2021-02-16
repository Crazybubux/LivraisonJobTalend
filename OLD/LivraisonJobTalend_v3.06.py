# cd C:\JobsTalend\LIVRAISON_JOB
# python -m PyQt5.uic.pyuic -x LivraisonJobTalend_v3.04.ui -o LivraisonJobTalend_v3.04.py
#
# python LivraisonJobTalend_v3.05.py


#*********************************************************
#               LivraisonJobTalend
#*********************************************************
# Developpeur  : Guillaume BUNEL
# Version      : 3.06
# Modification :
# Reprise de la version 3.05
# Livraison SFTP + commande livraison.sh talend
# Modification de la fonction "__init__".
#*********************************************************
# Developpeur  : Guillaume BUNEL
# Version      : 3.05
# Modification : Implémentation d'un fichier de config
# pour la liste déroulante des utilisateurs.
# Refonte de la fonction "read_ini_file"
# Modification de la fonction "__init__".
#*********************************************************
# Developpeur  : Guillaume BUNEL
# Version      : 3.04
# Modification : Migration Python 2.7 vers 3.7
#                  Changement cible documentation pour
#                 GDrive
#*********************************************************

# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'LivraisonJobTalend_v3.05.ui'
#
# Created by: PyQt5 UI code generator 5.13.0
#
# WARNING! All changes made in this file will be lost!


from importlib import reload

import paramiko
from PyQt5 import QtCore, QtGui, QtWidgets
from shutil import copyfile
from tkinter import *
import configparser
import glob
import operator
import os
import os.path
import pysftp
import re
import shutil
import sys
import warnings
import zipfile
import sys

from PyQt5.QtCore import QUrl

from ThreadWithReturnValue import ThreadWithReturnValue

sys.setrecursionlimit(10000)
reload(sys)

try:
    _fromUtf8 = QtCore.QString.fromUtf8
except AttributeError:
    def _fromUtf8(s):
        return s

try:
    _encoding = QtGui.QAppl8
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig, _encoding)
except AttributeError:
    def _translate(context, text, disambig):
        return QtGui.QApplication.translate(context, text, disambig)

class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(429, 520)
        Dialog.setWindowFlags(Dialog.windowFlags()|QtCore.Qt.WindowMinimizeButtonHint|QtCore.Qt.WindowSystemMenuHint)
        self.EmplacementLivraisonLabel = QtWidgets.QLabel(Dialog)
        self.EmplacementLivraisonLabel.setGeometry(QtCore.QRect(10, 160, 411, 20))
        self.EmplacementLivraisonLabel.setObjectName("EmplacementLivraisonLabel")
        self.EmplacementLivraisonDisplay = QtWidgets.QLabel(Dialog)
        self.EmplacementLivraisonDisplay.setGeometry(QtCore.QRect(10, 190, 411, 20))
        self.EmplacementLivraisonDisplay.setText("")
        self.EmplacementLivraisonDisplay.setObjectName("EmplacementLivraisonDisplay")
        self.EmplacementDocumentationLabel = QtWidgets.QLabel(Dialog)
        self.EmplacementDocumentationLabel.setGeometry(QtCore.QRect(10, 220, 411, 20))
        self.EmplacementDocumentationLabel.setObjectName("EmplacementDocumentationLabel")
        self.EmplacementDocumentationDisplay = QtWidgets.QLabel(Dialog)
        self.EmplacementDocumentationDisplay.setGeometry(QtCore.QRect(10, 250, 411, 20))
        self.EmplacementDocumentationDisplay.setText("")
        self.EmplacementDocumentationDisplay.setObjectName("EmplacementDocumentationDisplay")
        self.LienMantisLabel = QtWidgets.QLabel(Dialog)
        self.LienMantisLabel.setGeometry(QtCore.QRect(10, 280, 411, 20))
        self.LienMantisLabel.setObjectName("LienMantisLabel")
        self.LienMantisDisplay = QtWidgets.QLabel(Dialog)
        self.LienMantisDisplay.setGeometry(QtCore.QRect(10, 310, 411, 20))
        self.LienMantisDisplay.setText("")
        self.LienMantisDisplay.setObjectName("LienMantisDisplay")
        self.label_7 = QtWidgets.QLabel(Dialog)
        self.label_7.setGeometry(QtCore.QRect(10, 40, 411, 20))
        self.label_7.setObjectName("label_7")
        self.label_8 = QtWidgets.QLabel(Dialog)
        self.label_8.setGeometry(QtCore.QRect(10, 80, 411, 20))
        self.label_8.setObjectName("label_8")
        self.pushButton = QtWidgets.QPushButton(Dialog)
        self.pushButton.setGeometry(QtCore.QRect(10, 130, 411, 23))
        self.pushButton.setObjectName("pushButton")
        self.MessageMantisLabel = QtWidgets.QLabel(Dialog)
        self.MessageMantisLabel.setGeometry(QtCore.QRect(10, 340, 411, 20))
        self.MessageMantisLabel.setObjectName("MessageMantisLabel")
        self.mantisMessageDisplay = QtWidgets.QTextBrowser(Dialog)
        self.mantisMessageDisplay.setGeometry(QtCore.QRect(10, 360, 411, 151))
        self.mantisMessageDisplay.setObjectName("mantisMessageDisplay")
        self.ConsoleLabel = QtWidgets.QLabel(Dialog)
        self.ConsoleLabel.setGeometry(QtCore.QRect(10, 520, 411, 20))
        self.ConsoleLabel.setObjectName("ConsoleLabel")
        self.lineEdit = QtWidgets.QLineEdit(Dialog)
        self.lineEdit.setGeometry(QtCore.QRect(10, 60, 411, 20))
        self.lineEdit.setObjectName("lineEdit")
        self.lineEdit_2 = QtWidgets.QLineEdit(Dialog)
        self.lineEdit_2.setGeometry(QtCore.QRect(10, 100, 411, 20))
        self.lineEdit_2.setObjectName("lineEdit_2")
        # TEST
        self.lineEdit.setText("IDG_TES_DEC_ODS_OMNICANAL")
        self.lineEdit_2.setText("20000")
        # TEST
        self.trigramBox = QtWidgets.QComboBox(Dialog)
        self.trigramBox.setGeometry(QtCore.QRect(10, 10, 411, 22))
        self.trigramBox.setObjectName("trigramBox")
        self.textBrowser = QtWidgets.QTextBrowser(Dialog)
        self.textBrowser.setGeometry(QtCore.QRect(10, 540, 411, 241))
        self.textBrowser.setObjectName("textBrowser")

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

        # thread_delivery = ThreadWithReturnValue(target=control.run, args=(jobname, mantis_number, user))
        # thread_delivery.start()
        try:
            self.pushButton.clicked.connect(lambda:self.run())
            # thread_delivery = ThreadWithReturnValue(target=self.run)
            # self.pushButton.clicked.connect(lambda: thread_delivery.start())
        except Exception as e:
            self.log("Error : "+e)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Livraison Job Talend v3.06"))
        Dialog.setWindowIcon(QtGui.QIcon('icon.png'))
        self.EmplacementLivraisonLabel.setText(_translate("Dialog", "Dossier du livrable :"))
        self.EmplacementDocumentationLabel.setText(_translate("Dialog", "Dossier de la documentation :"))
        self.LienMantisLabel.setText(_translate("Dialog", "Lien vers le mantis :"))
        self.label_7.setText(_translate("Dialog", "Nom du job à livrer"))
        self.label_8.setText(_translate("Dialog", "Numéro du mantis"))
        self.pushButton.setText(_translate("Dialog", "Livrer"))
        self.MessageMantisLabel.setText(_translate("Dialog", "Message Mantis :"))
        self.ConsoleLabel.setText(_translate("Dialog", "Console :"))

        if self.file_exists('config.ini'):
            listUsers = self.read_ini_file('config.ini', 'users')
            for user in listUsers :
                self.trigramBox.addItem("")
                self.trigramBox.setItemText(listUsers.index(user), _translate("Dialog", user))

    def sftp_connection(self, ftp_address, ftp_username, ftp_password, ftp_folder):
        # Définition de la connexion au serveur SFTP
        # Les paramètres sont récupérés depuis le fichier de configuration
        # params.ini.
        global cnopts
        cnopts = pysftp.CnOpts()
        cnopts.hostkeys = None
        try:
            sftp = pysftp.Connection(host=ftp_address, username=ftp_username, password=ftp_password, cnopts=cnopts)
            if sftp:
                self.log('Connection to %s successfull.' % ftp_address)
            sftp.chdir(ftp_folder)
        except Exception as e:
            self.log('Connection to %s failed.' % ftp_address)
        return sftp

    def sftp_put(self, sftp, local_file_path):
        try:
            # Envoi du fichier "localFilePath" vers le serveur SFTP "sftp"
            sftp.put(local_file_path)
            self.log('File "%s" sent.' % local_file_path)
        except Exception as e:
            self.log('File sending %s failed.' % ftp_address)


    def read_ini_file(self, filepath, section):
        listUsers = []
        parser = configparser.ConfigParser()
        config = parser.read(filepath)
        sections = parser.sections()
        for section in sections:
            for option in parser[section]:
                listUsers.append(parser.get(section, option))
        return listUsers

    def checkForFiles(self):
        rootDir=os.path.dirname(os.path.realpath(__file__))
        list_of_files = glob.glob(str(rootDir)+"\\*.zip")
        if len(list_of_files) > 0 :
            return 1
        else : return 0

    def deleteOldBuildFiles(self):
        rootDir=os.path.dirname(os.path.realpath(__file__))
        list_of_files = glob.glob(str(rootDir)+"\\*.zip")
        if len(list_of_files) > 0 :
            for file in list_of_files:
                os.remove(file)
        self.log("Les fichiers .zip du dossier source ont été supprimées.")

    def deleteOldDocFiles(self):
        rootDir=os.path.dirname(os.path.realpath(__file__))+"\\DOC"
        list_of_files = glob.glob(str(rootDir)+"\\*.zip")
        if len(list_of_files) > 0 :
            for file in list_of_files:
                os.remove(file)
        self.log("Les fichiers .zip du dossier source ont été supprimées.")

    def getFullPathAndBuildFileName(self, jobName):
        rootDir=os.path.dirname(os.path.realpath(__file__))
        self.log("Dossier actuel : "+rootDir)
        for subDir, dirs, files in os.walk(rootDir):
            for file in files:
                if jobName in file :
                    fullPathAndBuildFileName = os.path.join(subDir, file)
                    global buildFileName
                    buildFileName = file
                    self.log("Le build suivant va être déplacé : "+fullPathAndBuildFileName)
                    return fullPathAndBuildFileName

    def getFullPathAndDocumentationFileName(self, jobName):
        rootDir=os.path.dirname(os.path.realpath(__file__))+"\\DOC"
        self.log("Dossier actuel : "+rootDir)
        for subDir, dirs, files in os.walk(rootDir):
            for file in files:
                if jobName in file :
                    fullPathAndDocumentationFileName = os.path.join(subDir, file)
                    global documentationfileName
                    documentationfileName = file
                    self.log("La documentation suivante va être déplacée : "+fullPathAndDocumentationFileName)
                    return fullPathAndDocumentationFileName

    def getDomaine(self, jobName):
        splitCharacter="_"
        jobNameWithExtension = ""
        hashWords = jobName.split("_")
        domaine = self.transcodificationDomaine(operator.itemgetter(1)(hashWords))
        self.log("Domaine : "+domaine)
        return domaine

    def transcodificationDomaine(self, domaine):
        if domaine == "CPA":
            domaine = "COMPTA"
        elif domaine == "DOU":
            domaine = "DOUANE"
        elif domaine == 'LOG':
            domaine = 'LOGISTIQUE'
        return domaine

    def createDirectory(self, dirName):
        try:
            if not os.path.exists(dirName):
                os.makedirs(dirName)
        except Exception as e:
            # raise e
            self.log('Error in createDirectory : '+e)

    def getJobName(self):
        if str(self.lineEdit.text()) != None :
            jobName = str(self.lineEdit.text())
        return jobName

    def checkJobName(self, jobName):
        if jobName == None or jobName == "":
            return 0
        else :
            return 1

    def getJobVersion(self, jobName):
        try:
            jobVersion = re.search('((.?)*)([0-9]\\.[0-9]*)', str.replace(buildFileName, ".zip", "")).group(3)
        except AttributeError as ae:
            self.log(ae)
        return jobVersion

    def getMantisNumber(self):
        mantisNumber = ""
        mantisNumber = str(self.lineEdit_2.text())
        return mantisNumber

    def checkMantisNumber(self, mantisNumber):
        if mantisNumber == None or mantisNumber == "":
            self.log("Le numero de mantis n'a pas été saisi.")
            return 0
        else :
            return 1

    def init_log_file(self):
        print('init_log_file()')
        try:
            print('Création du fichier de log')
            log_file = open('log.txt', 'w')
            log_file.write('Début de la log.')
            log_file.close()
            print('Fermeture du fichier de log.')
        except Exception as e:
            print('Could not create log file. : ')
            print('Error in init_log_file() : '+e)
        # except Exception as e:
        #     print('Could not create log file. : '+e)

    def log(self, message):
        try:
            # self.textBrowser.append(message)
            # if os.access('log.txt', os.W_OK):
            log_file = open('log.txt', 'a')
            log_file.write(message+'\n')
            log_file.close()
        except:
            self.log('Error in log() : ')
        # except Exception as e:
        #     self.log('Error in log() : '+e)


    def fillMantisMessage(self):
        self.log("fillMantisMessage")
        self.mantisMessageDisplay.append("Bonjour,")
        self.mantisMessageDisplay.append("")
        self.mantisMessageDisplay.append("Le livrable est disponible en version "+self.getJobVersion(self.getJobName)+" à l'emplacement suivant :")
        self.mantisMessageDisplay.append(buildTarget+"\\Build_du_job")
        self.mantisMessageDisplay.append("")
        self.mantisMessageDisplay.append("La documentation a été livrée.")
        self.mantisMessageDisplay.append("")
        self.mantisMessageDisplay.append("Le job a également été déployé sur la recette.")
        self.mantisMessageDisplay.append("")
        self.mantisMessageDisplay.append("Cordialement,")
        self.mantisMessageDisplay.append(self.trigramBox.currentText())

    def controlsBeforeExecution(self):
        self.log("controlsBeforeExecution")
        if self.checkJobName(self.getJobName()) == False:
            self.mantisMessageDisplay.append("Le nom du job n'a pas été renseigné.")
            self.log("Le nom du job n'a pas été renseigné.")
        if self.checkMantisNumber(self.getMantisNumber()) == False:
            self.mantisMessageDisplay.append("Le numéro de mantis n'a pas été renseigné.")
            self.log("Le numéro de mantis n'a pas été renseigné.")
        if self.checkForFiles() == False:
            self.mantisMessageDisplay.append("Aucun fichier .zip n'est présent.")
            self.log("Aucun fichier .zip n'est présent.")
        if not self.file_exists('config.ini'):
            self.mantisMessageDisplay.append("Le fichier config.ini n\'existe pas.")
            self.log("Le fichier config.ini est introuvable.")
        if not self.file_exists('params.ini'):
            self.mantisMessageDisplay.append("Le fichier params.ini n\'existe pas.")
            self.log("Le fichier params.ini est introuvable.")
        if self.checkJobName(self.getJobName()) and self.checkMantisNumber(self.getMantisNumber()) and self.checkForFiles() and self.file_exists('params.ini') and self.file_exists('config.ini'):
            self.log('Controls OK.')
            return 1
        else:
            return 0

    def reset(self):
        self.log("reset")
        self.textBrowser.clear()
        self.EmplacementLivraisonLabel.setText("Dossier du livrable :")
        self.EmplacementLivraisonLabel.setStyleSheet('color: dark')
        self.EmplacementDocumentationLabel.setText("Dossier de la documentation :")
        self.EmplacementDocumentationLabel.setStyleSheet('color: dark')
        self.EmplacementLivraisonDisplay.clear()
        self.EmplacementDocumentationDisplay.clear()
        self.LienMantisDisplay.clear()
        self.mantisMessageDisplay.clear()
        self.textBrowser.clear()
        self.log("Note :")
        self.log("L'exécutable doit se trouver dans le répertoire des jobs buildés.")
        self.log("La documentation doit se trouver dans le dossier /BUILD/DOC.")
        self.log("Le job renseigné ne doit pas comporter le numéro de version.")
        self.log("Le numéro de Mantis ne doit pas comporter les 00.")
        self.log("")

    def copyToClipboard(self, string):
        r = Tk()
        r.withdraw()
        r.clipboard_clear()
        r.clipboard_append(string)
        r.update()
        r.destroy()

    def read_ini_file_sftp(self, filepath):
        global ftp_address
        global ftp_username
        global ftp_password
        global file_mask
        global target_file_path
        global list_strings
        global search
        global wait_in_seconds

        self.log("read_ini_file_sftp")
        print("read_ini_file_sftp")
        # Lecture des paramètres ini du fichier params.ini
        try:
            config = configparser.ConfigParser()
            config.read(filepath)
            ftp_address = config.get('DEFAULT', 'ftp_address')
            ftp_username = config.get('DEFAULT', 'ftp_username')
            ftp_password = config.get('DEFAULT', 'ftp_password')
            file_mask = config.get('DEFAULT', 'file_mask')
            target_file_path = config.get('DEFAULT', 'target_file_path')
            list_strings = config.get('DEFAULT', 'list_strings')
            search = config.get('DEFAULT', 'search')
            wait_in_seconds = config.get('DEFAULT', 'wait_in_seconds')
        except Exception as e:
            self.log('Error in read_ini_file_sftp() : '+e)

    def file_exists(self, filepath):
        if os.path.exists(filepath):
            print('Le fichier %s existe.' % filepath)
            return 1
        else:
            print('Le fichier %s est introuvable.' % filepath)
            return 0

    def init(self):
        print('init()')
        warnings.filterwarnings(action='ignore', module='.*paramiko.*')
        self.init_log_file()

    def ssh_connection(self, server, username, password):
        try:
            ssh = paramiko.SSHClient()
            ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
            ssh.connect(server, port=22, username=username, password=password)
            self.log('La connexion SSH a réussi.')
        except paramiko.AuthenticationException:
            self.log("Authentication failed when connecting to %s" % server)
            sys.exit(1)
        return ssh

    def ssh_run_shell_command(self, ssh, cmd_to_execute):
        global ssh_stdin
        global ssh_stdout
        global ssh_stderr
        try:
            self.log('Commande SSH exécutée : '+cmd_to_execute)
            ssh_stdin, ssh_stdout, ssh_stderr = ssh.exec_command(cmd_to_execute)
            self.log('L\'exécution de la commande SSH a réussi.')
        except Exception as e:
            self.log('L\'exécution de la commande SSH a échoué.')
            self.log('Exception : '+e)
        return

    def run(self):
        try:
            self.reset()
            self.init()
            if self.controlsBeforeExecution():
                working_file = self.getFullPathAndBuildFileName(self.getJobName())
                answer = 'y'
                self.read_ini_file_sftp("params.ini")
                connexion_sftp_talend_rec = self.sftp_connection(ftp_address, ftp_username, ftp_password, target_file_path)
                self.sftp_put(connexion_sftp_talend_rec, working_file)
                connexion_ssh_talend_rec = self.ssh_connection(ftp_address, ftp_username, ftp_password)
                shell_cmd_installation = 'livraison_talend.sh /tmp/%s OF' % buildFileName
                self.ssh_run_shell_command(connexion_ssh_talend_rec, "cd /tmp")
                self.ssh_run_shell_command(connexion_ssh_talend_rec, shell_cmd_installation)
                ssh_stdin.write(answer + '\n')
                ssh_stdin.write(answer + '\n')
                ssh_stdin.flush()
                for line in iter(ssh_stdout.readline, ""):
                    self.log(line)
                connexion_sftp_talend_rec.close()
                self.buildDelivery(self.getFullPathAndBuildFileName(self.getJobName()), self.getDomaine(self.getJobName()), self.getJobName())
                self.docDelivery(self.getFullPathAndDocumentationFileName(self.getJobName()), self.getJobName())
                self.fillMantisMessage()
                self.copyToClipboard(self.mantisMessageDisplay.toPlainText())
        except Exception as e:
            self.log("Error : "+e)
            raise

    def __init__(self):
        self.log("__init__")

    def buildDelivery(self, fullPathAndBuildFileName, domaine, jobName):
        self.log("===LIVRAISON DU BUILD===")
        global buildTarget
        buildTarget="\\\\pw1920inf024\\Livrable_Talend\\FLUX\\LIV\\"+domaine+"\\"+jobName+"\\Mantis_00"+self.getMantisNumber()
        self.log("Dossier cible Build : "+buildTarget)
        if not os.path.exists(buildTarget):
            self.createDirectory(buildTarget)
            self.log("Creation du dossier "+buildTarget)
            if not os.path.exists(buildTarget+"\\"+"Build_du_job"):
                self.createDirectory(buildTarget+"\\"+"Build_du_job")
                self.log("Creation du dossier "+buildTarget+"\\"+"Build_du_job")
            self.log("Le dossier "+buildTarget+"\\"+"Build_du_job"+" existe déjà.")
        else :
            self.log("Le dossier "+buildTarget+" existe déjà.")

        if not os.path.exists(buildTarget+"\\"+"Build_du_job"+"\\"+buildFileName):
            try:
                if os.access(buildTarget+"\\"+"Build_du_job"+"\\"+buildFileName, os.W_OK):
                    copyfile(fullPathAndBuildFileName, buildTarget+"\\"+"Build_du_job"+"\\"+buildFileName)
                    self.deleteOldBuildFiles()
                else:
                    self.EmplacementLivraisonLabel.setText("Dossier du livrable : Droits insuffisants")
                    self.EmplacementLivraisonLabel.setStyleSheet('color: red')
            except Exception as e:
                self.log('Error in buildDelivery : '+e)
                # raise e
            self.log("La livraison du build "+buildTarget+"\\"+"Build_du_job"+"\\"+buildFileName+" à bien été effectuée.")
        else :
            self.log("Le build "+buildTarget+"\\"+"Build_du_job"+"\\"+buildFileName+" existe déjà dans "+buildTarget+"\\Build_du_job\\.")
            self.EmplacementLivraisonLabel.setText("Dossier du livrable : Le build existe déjà.")
            self.EmplacementLivraisonLabel.setStyleSheet('color: red')
        DeliveryDestinationFolderUrl = bytearray(QUrl.fromLocalFile(buildTarget).toEncoded()).decode()
        self.EmplacementLivraisonDisplay.setText("<a href=\""+DeliveryDestinationFolderUrl+"\\Build_du_job\">"+DeliveryDestinationFolderUrl+"\\Build_du_job</a>")
        self.EmplacementLivraisonDisplay.setOpenExternalLinks(True)
        self.log("===LIVRAISON DU BUILD===")

    def docDelivery(self, documentationfileName, jobName):
        self.log("===LIVRAISON DE LA DOCUMENTATION===")
        documentationTarget = "\\\\pw1920inf024\\DOC_Talend" + "\\" + jobName
        self.log("Dossier cible documentation : "+documentationTarget)

        if not os.path.exists(documentationTarget):
            self.createDirectory(documentationTarget)
            self.log("Creation du dossier "+documentationTarget)
        else :
            self.log("Le dossier "+documentationTarget+" existe déjà.")

        source = documentationTarget+"\\"+str.replace(buildFileName, ".zip", "")+"\\"+jobName
        target = documentationTarget+"\\"+str.replace(buildFileName, ".zip", "")+"\\"

        if not os.path.exists(documentationTarget+"\\"+str.replace(buildFileName, ".zip", "")):
            try:
                if os.access(documentationTarget, os.W_OK):
                    zip_ref = zipfile.ZipFile(documentationfileName, 'r')
                    zip_ref.extractall(documentationTarget)
                    zip_ref.close()

                    files = os.listdir(source)
                    for f in files:
                        shutil.move(source+"\\"+f, target+"\\"+f)
                    shutil.rmtree(source)
                    self.deleteOldDocFiles()
                    self.log("La livraison de la documentation du job "+jobName+" à bien été effectuée.")
                    os.startfile("http://mantis/mantis_prd/view.php?id="+self.getMantisNumber())
                else:
                    self.EmplacementDocumentationLabel.setText("Dossier de la documentation : Droits insuffisants.")
                    self.EmplacementDocumentationLabel.setStyleSheet('color: red')
            except Exception as e:
                self.EmplacementDocumentationDisplay.setText("L'archive .zip de la documentation n\'était pas présente.")
                self.EmplacementDocumentationDisplay.setStysftpleSheet('color: red')
        else :
            self.EmplacementDocumentationLabel.setText("Dossier de la documentation : La documentation existe déjà.")
            self.EmplacementDocumentationLabel.setStyleSheet('color: red')
            self.log("Le documentation "+jobName+" existe déjà dans "+documentationTarget+".")
        self.LienMantisDisplay.setText("<a href=\"http://mantis/mantis_prd/view.php?id="+self.getMantisNumber()+"\">"+"http://mantis/mantis_prd/view.php?id="+self.getMantisNumber()+"</a>")
        self.LienMantisDisplay.setOpenExternalLinks(True)
        DocumentationDestinationFolderUrl = bytearray(QUrl.fromLocalFile(documentationTarget).toEncoded()).decode()
        self.EmplacementDocumentationDisplay.setText("<a href=\""+DocumentationDestinationFolderUrl+"\">"+DocumentationDestinationFolderUrl+"</a>")
        self.EmplacementDocumentationDisplay.setOpenExternalLinks(True)
        self.log("===LIVRAISON DE LA DOCUMENTATION===")

if __name__ == "__main__":
    app = QtWidgets.QApplication(sys.argv)
    Dialog = QtWidgets.QDialog()
    ui = Ui_Dialog()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())