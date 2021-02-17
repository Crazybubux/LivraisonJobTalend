import pysftp
import file_ini

class sftp():
    def __init__(self):
        pass

    def connection(self, ftp_address, ftp_username, ftp_password, ftp_folder):
        # Définition de la connexion au serveur SFTP
        # Les paramètres sont récupérés depuis le fichier de configuration
        # params.ini.
        global cnopts
        cnopts = pysftp.CnOpts()
        cnopts.hostkeys = None
        try:
            sftp = pysftp.Connection(host=ftp_address, username=ftp_username, password=ftp_password, cnopts=cnopts)
            if sftp:
                print('Connection to %s successfull.' % ftp_address)
            sftp.chdir(ftp_folder)
        except Exception as e:
            sftp = None
            print('Connection to %s failed.' % ftp_address)
        return sftp

    def put(self, sftp_connection, local_file_path):
        # Envoi du fichier "localFilePath" vers le serveur SFTP "sftp"
        try:
            sftp_connection.put(local_file_path)
            print('File "%s" sent.' % local_file_path)
        except TypeError as te:
            print('Erreur : %s ' % te)

if __name__ == "__main__":
    filename = 'config.ini'
    ini_file = file_ini.file(filename)
    config = ini_file.read_ini_file()
    options_list = ini_file.read_options(config, 'DEFAULT')

    sftp_connection = sftp.connection()
    file = ""
    sftp.put(sftp_connection, file)