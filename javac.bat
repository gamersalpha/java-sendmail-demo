@echo off
setlocal

set myVar=%1

echo compilation du fichier : %myVar%.

C:\Users\issa2021\Downloads\jdk-19_windows-x64_bin\jdk-19.0.2\bin\javac.exe -classpath "C:\Users\issa2021\Downloads\jdk-19_windows-x64_bin\lib\activation-jaf1.1.1.jar;C:\Users\issa2021\Downloads\jdk-19_windows-x64_bin\lib\javax.mail.jar;." %myVar%