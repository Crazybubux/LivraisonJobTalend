# *********************************************************
#                      file_ini
# *********************************************************
#  Developpeur  : Guillaume BUNEL
#  Version      : 0.1
#  Modification : Création
# *********************************************************

import configparser
import os

class file_ini():
    def __init__(self, filename):
        self.filename = filename

    def exists(self):
        if os.path.exists(self.filename):
            return 1

    def read_ini_file(self):
        config = configparser.ConfigParser()
        try:
            config.read(self.filename)
        except Exception as e:
        	raise e
        return config

    def read_options(self, config, section):
        list = []
        for option in config.options(section):
            section = section
            optionname = option
            option = config[section][option]
            list.append([section, optionname, option])
        return list

    def get_options_from_list(self, list, section):
        options_list = []
        for option in list:
            if option[0] == 'section':
                options_list.append([option[1], option[2]])
        return options_list

if __name__ == "__main__":
    filename = 'config.ini'
    ini_file = file_ini(filename)
    config = ini_file.read_ini_file()
    users_list = ini_file.read_options(config, 'users')
    sftp_list = ini_file.read_options(config, 'sftp')
    for user in users_list:
        print(user[2])
