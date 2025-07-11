package guiFactory.window;

import guiFactory.text.TextAreaFactory;
import guiFactory.service.ByteReaderService;

import javax.swing.*;
import java.awt.*;

public class InputStreamGuiBuilder {

    public void build(JFrame frame) {
        frame.setLayout(new BorderLayout());

        // TextArea vorbereiten
        JTextArea textArea = new TextAreaFactory()
                .setFont(new Font("Monospaced", Font.PLAIN, 14))
                .setEditable(false)
                .setLineWrap(true)
                .setWrapStyleWord(true)
                .build();

        JScrollPane scrollPane = new JScrollPane(textArea);

        // Button vorbereiten
        JButton btnLoad = new JButton("Datei laden (InputStream)");
        btnLoad.addActionListener(e ->
                ByteReaderService.loadFromResources("/demo-inputstream.txt", textArea, frame)
        );

        // Button mittig platzieren
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(btnLoad);

        // Komponenten ins Fenster
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
    }
}
