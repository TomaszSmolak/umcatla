package guiFactory;

import guiFactory.window.WindowFactory;
import guiFactory.window.GuiBuilder;
import javax.swing.*;

/**
 * Einstiegspunkt der Anwendung.
 * <p>
 * Diese Klasse startet die GUI-Anwendung im Event Dispatch Thread (EDT).
 * Es wird ein {@link javax.swing.JFrame} über die {@link guiFactory.window.WindowFactory} erstellt
 * und anschließend mit Inhalt durch {@link guiFactory.window.GuiBuilder} befüllt.
 * </p>
 *
 * <p>© 2025 Tomasz Smolak. Alle Rechte vorbehalten.</p>
 * <p>Lizenz: MIT – Nutzung auf eigene Gefahr. Keine Haftung für Schäden.</p>
 * <p>Diese Anwendung dient zu Lernzwecken und ist nicht für den produktiven Einsatz optimiert.</p>
 *
 * @author Tomasz Smolak
 * @version 1.0
 * @since 2025-07-09
 */
public class App {

    /**
     * Startet die GUI-Anwendung.
     * <p>
     * Die Methode nutzt {@link SwingUtilities#invokeLater(Runnable)}, um die GUI-Erstellung
     * im Event Dispatch Thread durchzuführen – gemäß Best Practices für Swing.
     * </p>
     *
     * @param args Kommandozeilenargumente (werden nicht verwendet)
     * @since 1.0
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new WindowFactory()
                    .setTitle("Meine App")
                    .setSize(800, 400)
                    .setCentered(true)
                    .build();

            GuiBuilder builder = new GuiBuilder();
            builder.build(frame);

            frame.setVisible(true);
        });
    }
}
