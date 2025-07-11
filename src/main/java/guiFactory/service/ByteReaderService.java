package guiFactory.service;

import javax.swing.*;
import java.io.*;
import java.awt.Component;

public class ByteReaderService {

    public static void loadFromResources(String resourcePath, JTextArea textArea, Component parent) {
        try (InputStream in = ByteReaderService.class.getResourceAsStream(resourcePath);
             BufferedInputStream bis = new BufferedInputStream(in)) {

            textArea.setText("");
            int value;
            while ((value = bis.read()) != -1) {
                // Ausgabe als hexadezimale Zeichenfolge
                textArea.append(String.format("%02X ", value));
            }

        } catch (IOException | NullPointerException ex) {
            JOptionPane.showMessageDialog(parent,
                    "Fehler beim Lesen:\n" + ex.getMessage(),
                    "InputStream Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }
}
