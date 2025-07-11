package guiFactory.window;

import guiFactory.text.TextAreaFactory;
import guiFactory.service.TextReaderService;

import javax.swing.*;
import java.awt.*;


public class ReaderGuiBuilder {

    public void build(JFrame frame) {
        frame.setLayout(new BorderLayout());

        // Textfeld
        JTextArea textArea = new TextAreaFactory()
                .setFont(new Font("Monospaced", Font.PLAIN, 14))
                .setEditable(false)
                .setLineWrap(true)
                .setWrapStyleWord(true)
                .build();

        JScrollPane scrollPane = new JScrollPane(textArea);

        // Button zum Lesen der Datei
        JButton btnLoadFile = new JButton("Datei lesen");

        btnLoadFile.addActionListener(e ->
                TextReaderService.loadFileToTextArea("/demo.txt", textArea, frame)
        );


        // Obere Leiste für Button
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(btnLoadFile);

        // Einfügen in das Fenster
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
    }
}
