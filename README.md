# Umcatla – Java GUI-Lernprojekt 
# Version 1.0

Dies ist ein Lernprojekt im Rahmen des Informatik-Studiums.  
Ziel ist es, ein flexibles Java-Programm mit einfacher GUI für Demo-Zwecke zu entwickeln 

## 📦 Projektinhalt

# (TODO)
Das Projekt besteht aus einer `WindowFactory`-Klasse, die ein `JFrame` nach dem Baukastenprinzip erzeugt, sowie weiteren Hilfsklassen zur GUI-Erstellung (z. B. `ButtonFactory`, `LabelFactory`, `GuiBuilder` usw.).

## ✅ Features

- Erstellung von Swing-Fenstern mit `WindowFactory`
- Fluent Interface Pattern für Methodenverkettung
- Konfigurierbare Fenstergröße, Titel, Zentrierung, Close-Operation
- Modularer Aufbau (Buttons, Labels, Layouts)
- Vollständig kommentierter Quellcode mit JavaDoc
- Build- und Startskripte für Windows (`.bat`, `.ps1`)

## 🛠️ Verwendete Technologien

- Java 24 (OpenJDK)
- IntelliJ IDEA
- Maven (Projektstruktur)
- Swing (GUI)
- PowerShell / Batch (Skripte)

## 🚀 Projekt starten

```bash
# Kompilieren
javac -d out src/main/java/guiFactory/**/*.java

# Ausführen
java -cp out guiFactory.App
