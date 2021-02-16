# cd C:\JobsTalend\LIVRAISON_JOB
# python -m PyQt5.uic.pyuic -x LivraisonJobTalend_v3.04.ui -o LivraisonJobTalend_v3.04.py
#
# python LivraisonJobTalend_v3.05.py


# *********************************************************
#               LivraisonJobTalend
# *********************************************************
# Developpeur  : Guillaume BUNEL
# Version      : 3.06
# Modification :
# Reprise de la version 3.05
# Livraison SFTP + commande livraison.sh talend
# Modification de la fonction "__init__".
# *********************************************************
# Developpeur  : Guillaume BUNEL
# Version      : 3.05
# Modification : Implémentation d'un fichier de config
# pour la liste déroulante des utilisateurs.
# Refonte de la fonction "read_ini_file"
# Modification de la fonction "__init__".
# *********************************************************
# Developpeur  : Guillaume BUNEL
# Version      : 3.04
# Modification : Migration Python 2.7 vers 3.7
#                  Changement cible documentation pour
#                 GDrive
# *********************************************************

# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'LivraisonJobTalend_v3.05.ui'
#
# Created by: PyQt5 UI code generator 5.13.0
#
# WARNING! All changes made in this file will be lost!
import os
from importlib import reload

from PyQt5 import QtCore, QtGui, QtWidgets

from controller import controller
import sys
# Added code
from ThreadWithReturnValue import ThreadWithReturnValue
# Added code

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
    def __init__(self):
        pass

    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(429, 530)
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
        self.mantisMessageDisplay.setGeometry(QtCore.QRect(10, 360, 411, 166))
        self.mantisMessageDisplay.setObjectName("mantisMessageDisplay")
        self.ConsoleLabel = QtWidgets.QLabel(Dialog)
        self.ConsoleLabel.setGeometry(QtCore.QRect(10, 525, 411, 20))
        self.ConsoleLabel.setObjectName("ConsoleLabel")
        self.lineEdit = QtWidgets.QLineEdit(Dialog)
        self.lineEdit.setGeometry(QtCore.QRect(10, 60, 411, 20))
        self.lineEdit.setObjectName("lineEdit")
        self.lineEdit_2 = QtWidgets.QLineEdit(Dialog)
        self.lineEdit_2.setGeometry(QtCore.QRect(10, 100, 411, 20))
        self.lineEdit_2.setObjectName("lineEdit_2")
        self.trigramBox = QtWidgets.QComboBox(Dialog)
        self.trigramBox.setGeometry(QtCore.QRect(10, 10, 411, 22))
        self.trigramBox.setObjectName("trigramBox")
        self.textBrowser = QtWidgets.QTextBrowser(Dialog)
        self.textBrowser.setGeometry(QtCore.QRect(10, 545, 411, 241))
        self.textBrowser.setObjectName("textBrowser")
        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

        # Added code
        # Permet de rétablir l'affichage du bouton de réduction dans la barre des tâches
        Dialog.setWindowFlags(Dialog.windowFlags() | QtCore.Qt.WindowMinimizeButtonHint | QtCore.Qt.WindowSystemMenuHint)
        Dialog.setWindowIcon(QtGui.QIcon('icon.png'))
        self.pushButton.clicked.connect(lambda: self.run())
        control = controller()
        # Chargement de la liste des utilisateurs depuis le fichier config.ini
        users_list = control.load_ini_file_section('config.ini', 'users')
        for user in users_list:
            self.trigramBox.addItem("")
            self.trigramBox.setItemText(users_list.index(user), user[2])
        self.textBrowser.append("Note :")
        self.textBrowser.append("L'exécutable doit se trouver dans le répertoire des jobs buildés.")
        self.textBrowser.append("La documentation doit se trouver dans le dossier /BUILD/DOC.")
        self.textBrowser.append("Le job renseigné ne doit pas comporter le numéro de version.")
        self.textBrowser.append("Le numéro de Mantis ne doit pas comporter les 00.")
        self.textBrowser.append("")
        self.EmplacementLivraisonDisplay.setOpenExternalLinks(True)
        self.LienMantisDisplay.setOpenExternalLinks(True)
        self.EmplacementDocumentationDisplay.setOpenExternalLinks(True)
        # Added code


        # TEST
        self.lineEdit.setText("IDG_TES_DEC_ODS_OMNICANAL")
        self.lineEdit_2.setText("20000")
        # TEST

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Livraison Job Talend v3.07"))
        Dialog.setWindowIcon(QtGui.QIcon('icon.png'))
        self.EmplacementLivraisonLabel.setText(_translate("Dialog", "Dossier du livrable :"))
        self.EmplacementDocumentationLabel.setText(_translate("Dialog", "Dossier de la documentation :"))
        self.LienMantisLabel.setText(_translate("Dialog", "Lien vers le mantis :"))
        self.label_7.setText(_translate("Dialog", "Nom du job à livrer"))
        self.label_8.setText(_translate("Dialog", "Numéro du mantis"))
        self.pushButton.setText(_translate("Dialog", "Livrer"))
        self.MessageMantisLabel.setText(_translate("Dialog", "Message Mantis :"))
        self.ConsoleLabel.setText(_translate("Dialog", "Console :"))

    def reset(self):
        self.EmplacementLivraisonLabel.setText("Dossier du livrable :")
        self.EmplacementLivraisonLabel.setStyleSheet('color: dark')
        self.EmplacementDocumentationLabel.setText("Dossier de la documentation :")
        self.EmplacementDocumentationLabel.setStyleSheet('color: dark')
        self.EmplacementLivraisonDisplay.clear()
        self.EmplacementDocumentationDisplay.clear()
        self.LienMantisDisplay.clear()
        self.mantisMessageDisplay.clear()
        self.textBrowser.clear()

    # Added code
    def run(self):
        self.reset()
        jobname = self.lineEdit.text()
        mantis_number = self.lineEdit_2.text()
        user = self.trigramBox.currentText()
        control = controller()
        thread_delivery = ThreadWithReturnValue(target=control.run, args=(jobname, mantis_number, user))
        thread_delivery.start()
        logs = thread_delivery.join()
        for log in logs:
            # On ajoute les logs au textbrowser "Console"
            self.textBrowser.append(log)

        if control.get_display_string('BUILD_EXISTE'):
            self.EmplacementLivraisonDisplay.setText(control.get_display_string('BUILD_EXISTE')[0][1])
            self.EmplacementDocumentationDisplay.setText('')
            self.EmplacementLivraisonDisplay.setStyleSheet('color: red')
            self.LienMantisDisplay.setText('')
        elif control.get_display_string('ARCHIVE_BUILD_ABSENTE'):
            self.EmplacementLivraisonDisplay.setText(control.get_display_string('ARCHIVE_BUILD_ABSENTE')[0][1])
            self.EmplacementDocumentationDisplay.setText('')
            self.EmplacementLivraisonDisplay.setStyleSheet('color: red')
            self.LienMantisDisplay.setText('')
        else:
            self.EmplacementLivraisonDisplay.setText(control.get_display_string('BUILD_DESTINATION')[0][1])
            self.LienMantisDisplay.setText(control.get_display_string('LIEN_DU_MANTIS')[0][1])

        if control.get_display_string('DOC_EXISTE'):
            self.EmplacementDocumentationDisplay.setText(control.get_display_string('DOC_EXISTE')[0][1])
            self.EmplacementLivraisonDisplay.setText('')
            self.EmplacementDocumentationDisplay.setStyleSheet('color: red')
            self.LienMantisDisplay.setText('')
        elif control.get_display_string('ARCHIVE_DOC_ABSENTE'):
            self.EmplacementDocumentationDisplay.setText(control.get_display_string('ARCHIVE_DOC_ABSENTE')[0][1])
            self.EmplacementLivraisonDisplay.setText('')
            self.EmplacementDocumentationDisplay.setStyleSheet('color: red')
            self.LienMantisDisplay.setText('')
        else:
            self.EmplacementDocumentationDisplay.setText(control.get_display_string('DOC_DESTINATION')[0][1])
            self.LienMantisDisplay.setText(control.get_display_string('LIEN_DU_MANTIS')[0][1])


        for line in control.get_display_string('MESSAGE_MANTIS'):
            self.mantisMessageDisplay.append(line[1])
    # Added code


if __name__ == "__main__":
    app = QtWidgets.QApplication(sys.argv)
    Dialog = QtWidgets.QDialog()
    ui = Ui_Dialog()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())
