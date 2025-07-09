@echo off
setlocal

rem Wechsle ins Projektverzeichnis (ein Verzeichnis über dem aktuellen)
cd /d "%~dp0.."

rem Maven Build starten
echo Starte Maven Build...
call mvn clean install

rem Setze Pfade
set JAR_NAME=hello-world-gui-1.0-SNAPSHOT.jar
set SOURCE=target\%JAR_NAME%
set DEST=HelloWorldApp\%JAR_NAME%

rem Kopieren der .jar
echo Kopiere %SOURCE% nach %DEST%...
copy /Y "%SOURCE%" "%DEST%"

echo Vorgang abgeschlossen.
pause
