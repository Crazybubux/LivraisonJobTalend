import paramiko
import sys

class ssh():
    def __init__(self):
        pass

    def connection(self, server, username, password):
        try:
            ssh = paramiko.SSHClient()
            ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
            ssh.connect(server, port=22, username=username, password=password)
            print('La connexion SSH a réussi.')
        except paramiko.AuthenticationException as ae:
            print("Authentication failed when connecting to %s" % server)
            sys.exit(1)
        return ssh

    def run_shell_command(self, connection, cmd_to_execute):
        try:
            print('Commande SSH exécutée : '+cmd_to_execute)
            ssh_stdin, ssh_stdout, ssh_stderr = connection.exec_command(cmd_to_execute)
            print('L\'exécution de la commande SSH a réussi.')
        except AttributeError as ae:
            ssh_stdin, ssh_stdout, ssh_stderr = ['', '', '']
            print('L\'exécution de la commande SSH a échoué.')
            print('Exception : %s' % ae)
        return ssh_stdin, ssh_stdout, ssh_stderr

if __name__ == "__main__":
    print('SSH')