package guiFactory.service;

import javax.swing.*;
import java.io.*;

public class TextReaderService {

    /**
     * Lädt eine Datei aus dem Ressourcenverzeichnis in ein Textfeld.
     *
     * @param resourcePath Pfad zur Datei im resources-Ordner (z. B. "/demo.txt")
     * @param textArea     Ziel-TextArea
     * @param parent       Elternkomponente für Fehlermeldungen (z. B. JFrame)
     */
    public static void loadFileToTextArea(String resourcePath, JTextArea textArea, JFrame parent) {
    try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(TextReaderService.class.getResourceAsStream(resourcePath)))) {

        textArea.setText(""); // vorherigen Text löschen
        String line;
        while ((line = reader.readLine()) != null) {
            textArea.append(line + "\n");
        }

    } catch (IOException | NullPointerException ex) {
        JOptionPane.showMessageDialog(parent,
                "Fehler beim Laden der Datei:\n" + ex.getMessage(),
                "Fehler", JOptionPane.ERROR_MESSAGE);
    }
}
}

