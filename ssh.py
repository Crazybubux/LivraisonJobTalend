import ssh
import paramiko
import sys

def ssh():
    def connection(server, username, password):
        try:
            ssh = paramiko.SSHClient()
            ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
            ssh.connect(server, port=22, username=username, password=password)
            print('La connexion SSH a réussi.')
        except paramiko.AuthenticationException:
            print("Authentication failed when connecting to %s" % server)
            sys.exit(1)
        return ssh

    def run_shell_command(ssh, cmd_to_execute):
        global ssh_stdin
        global ssh_stdout
        global ssh_stderr
        try:
            print('Commande SSH exécutée : '+cmd_to_execute)
            ssh_stdin, ssh_stdout, ssh_stderr = ssh.exec_command(cmd_to_execute)
            print('L\'exécution de la commande SSH a réussi.')
        except Exception as e:
            print('L\'exécution de la commande SSH a échoué.')
            print('Exception : '+e)
        return ssh_stdin, ssh_stdout, ssh_stderr