package guiFactory.window;

import guiFactory.label.LabelFactory;
import guiFactory.button.ButtonFactory;
import javax.swing.*;
import java.awt.*;
import guiFactory.layout.GridBagFactory;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class GuiBuilder {

    public void build(JFrame frame) {
        // Layout setzen
        GridBagFactory mainGrid = new GridBagFactory();
        GridBagFactory WB1Grid = new GridBagFactory();
        GridBagFactory WB2Grid = new GridBagFactory();
        GridBagFactory WB3Grid = new GridBagFactory();

        // Komponenten erstellen
        JLabel lblWBAufgabe1 = new LabelFactory("Workbook Aufgabenstellung 1")
                .setAlignment(SwingConstants.CENTER)
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setColor(Color.BLUE)
                .build();
        JLabel lblWBAufgabe2 = new LabelFactory("Workbook Aufgabenstellung 2")
                .setAlignment(SwingConstants.CENTER)
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setColor(Color.BLUE)
                .build();
        JLabel lblWBAufgabe3 = new LabelFactory("Workbook Aufgabenstellung 3")
                .setAlignment(SwingConstants.CENTER)
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setColor(Color.BLUE)
                .build();
        JButton btnWriter = new ButtonFactory("java.io.Writer")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnWriter.addActionListener(e -> {
                    JFrame writerWindow = new WriterWindowFactory()
                            .setTitle("java.io.Writer Beispiel")
                            .setSize(600, 400)
                            .setCentered(true)
                            .setCloseOperation(DISPOSE_ON_CLOSE)
                            .build();
                    writerWindow.setVisible(true);
                });


        JButton btnReader = new ButtonFactory("java.io.Reader")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnReader.addActionListener(e -> {
            JFrame readerWindow = new ReaderWindowFactory()
                    .setTitle("java.io.Reader Beispiel")
                    .setSize(600, 400)
                    .setCentered(true)
                    .setCloseOperation(DISPOSE_ON_CLOSE)
                    .build();
            new ReaderGuiBuilder().build(readerWindow);
            readerWindow.setVisible(true);
        });

        JButton btnInputStream = new ButtonFactory("java.io.InputStream")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnInputStream.addActionListener(e -> {
            JFrame inputStreamWindow = new InputStreamWindowFactory()
                    .setTitle("java.io.InputStream Beispiel")
                    .setSize(600, 400)
                    .setCentered(true)
                    .setCloseOperation(DISPOSE_ON_CLOSE)
                    .build();
            new InputStreamGuiBuilder().build(inputStreamWindow);
            inputStreamWindow.setVisible(true);
        });

        JButton btnOutputStream = new ButtonFactory("java.io.OutputStream")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnOutputStream.addActionListener(e -> {
            JFrame outputStreamWindow = new OutputStreamWindowFactory()
                    .setTitle("java.io.OutputStream Beispiel")
                    .setSize(600, 400)
                    .setCentered(true)
                    .setCloseOperation(DISPOSE_ON_CLOSE)
                    .build();
            outputStreamWindow.setVisible(true);
        });

        JButton btnHashMap = new ButtonFactory("HashMap")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnHashMap.addActionListener( e -> {
            System.out.println("Ich bin eine HashMap");
        });

        JButton btnTreeMap = new ButtonFactory("TreeMap")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnTreeMap.addActionListener( e -> {
            System.out.println("Ich bin eine TreeMap.");
        });

        JButton btnLinkedHashMap = new ButtonFactory("LinkedHashMap")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnLinkedHashMap.addActionListener( e -> {
            System.out.println("Ich eine LinkedHashMap.");
        });
        JButton btnCalander = new ButtonFactory("Kalender")
                .setFont(new Font("Arial", Font.BOLD, 14))
                .setForeground(Color.BLACK)
                .setBackground(Color.WHITE)
                .setBorder(BorderFactory.createLineBorder(Color.BLACK))
                .setSize(160, 40)
                .enableHover(Color.GRAY)
                .setFocusPainted(false)
                .build();
        btnCalander.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    null,
                    "Hier könnte ein Datum stehen.",
                    "Kalender",
                    JOptionPane.INFORMATION_MESSAGE
            );

        });



        // Komponenten platzieren
        WB1Grid.setAnchor(GridBagConstraints.CENTER).setGridWidth(4).add(lblWBAufgabe1,0, 0).setGridWidth(1);

        WB1Grid.add(btnWriter, 0, 1);
        WB1Grid.add(btnReader,1, 1);
        WB1Grid.add(btnInputStream,2,1);
        WB1Grid.add(btnOutputStream,3, 1);
        //grid.add(Box.createRigidArea(new Dimension(20, 20)), 0, 2);


        WB2Grid.setAnchor(GridBagConstraints.CENTER).setGridWidth(4).add(lblWBAufgabe2,0, 0).setGridWidth(1);
        WB2Grid.add(btnHashMap,0, 1);
        WB2Grid.add(btnTreeMap, 1, 1);
        WB2Grid.add(btnLinkedHashMap,2, 1);

        WB3Grid.setAnchor(GridBagConstraints.CENTER).setGridWidth(4).add(lblWBAufgabe3,0, 0).setGridWidth(1);
        WB3Grid.setAnchor(GridBagConstraints.CENTER).setGridWidth(4).add(btnCalander,0, 1).setGridWidth(1);
        //WB3Grid.add(btnCalander,0, 1);




        // Beispiel zum Erzeugen einer Leerzeile/-spalte.
        //mainGrid.add(Box.createRigidArea(new Dimension(20, 20)), 1, 2);


        // Panel ins Frame einfügen
        frame.setLayout(new BorderLayout());
        frame.add(mainGrid.build(), BorderLayout.CENTER);

        mainGrid.add(WB1Grid.build(), 0, 0);
        mainGrid.add(WB2Grid.build(), 0, 1);
        mainGrid.add(WB3Grid.build(), 0, 2);

    }
}

