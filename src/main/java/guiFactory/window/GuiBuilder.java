package guiFactory.window;

import guiFactory.label.LabelFactory;
import guiFactory.button.ButtonFactory;
import javax.swing.*;
//import javax.swing.border.Border;
import java.awt.*;

public class GuiBuilder {

    public void build(JFrame frame) {
        // Layout setzen
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Komponenten erstellen
        JLabel label1 = new LabelFactory("Hallo Welt!").build();

        JLabel label2 = new LabelFactory(
                "Zentriert + Farbe",
                SwingConstants.CENTER,
                Color.BLUE,
                new Font("Arial", Font.BOLD, 16),
                BorderFactory.createLineBorder(Color.BLUE, 2),
                150,
                30
        ).build();

        JButton btnWriter = new ButtonFactory("java.io.Writer")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();

        JButton btnReader = new ButtonFactory("java.io.Reader")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();

        JButton btnInputStream = new ButtonFactory("java.io.InputStream")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();

        JButton btnOutputStream = new ButtonFactory("java.io.OutputStream")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnOutputStream.addActionListener( e -> {
            System.out.println("Ich wurde geklickt.");
        });

        // Komponenten hinzufügen
        //frame.add(label1);
        //frame.add(label2);
        frame.add(btnWriter);
        frame.add(btnReader);
        frame.add(btnInputStream);
        frame.add(btnOutputStream);
    }
}

