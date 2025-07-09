# Pfade definieren
$sourceJar = "C:\Users\tomas\IdeaProjects\umcatla\target\hello-world-gui-1.0-SNAPSHOT.jar"
$targetFolder = "C:\Users\tomas\IdeaProjects\umcatla\HelloWorldApp\"
$targetJar = Join-Path $targetFolder "hello-world-gui-1.0-SNAPSHOT.jar"

# Existenz prüfen
if (Test-Path $sourceJar) {
    Copy-Item $sourceJar -Destination $targetJar -Force
    Write-Host "✅ JAR erfolgreich kopiert nach HelloWorldApp-Ordner"
} else {
    Write-Host "❌ Fehler: JAR wurde nicht gefunden. Stelle sicher, dass 'mvn clean install' vorher ausgeführt wurde."
}
