package guiFactory.window;

import javax.swing.*;

/**
 * Eine Factory-Klasse zur Erstellung und Konfiguration von {@link javax.swing.JFrame}-Fenstern.
 * <p>
 * Die Klasse folgt dem <i>Fluent Interface Pattern</i>, sodass Einstellungen
 * wie Titel, Größe, Schließverhalten usw. bequem per Methodenverkettung vorgenommen werden können.
 * </p>
 * <p>
 * Beispiel:
 * <pre>{@code
 *     JFrame frame = new WindowFactory("Mein Fenster", 1024, 768)
 *         .setCentered(true)
 *         .setCloseOperation(JFrame.DISPOSE_ON_CLOSE)
 *         .build();
 * }</pre>
 *
 * <p>© 2025 Tomasz Smolak. Alle Rechte vorbehalten.</p>
 * <p>Lizenz: MIT – Nutzung auf eigene Gefahr. Keine Haftung für Schäden.</p>
 * <p>Diese Klasse ist nicht thread-sicher und sollte nur von einem Thread verwendet werden.</p>
 * <p>Diese Klasse dient zu Lernzwecken und ist nicht für den produktiven Einsatz optimiert.</p>
 *
 * @author Tomasz Smolak
 * @version 1.0
 * @since 2025-07-09
 */
public class WindowFactory {

    /** Titel des Fensters */
    private String title = "Fenster";

    /** Breite des Fensters in Pixeln */
    private int width = 800;

    /** Höhe des Fensters in Pixeln */
    private int height = 600;

    /** Gibt an, ob das Fenster zentriert dargestellt werden soll */
    private boolean centered = true;

    /** Verhalten beim Schließen des Fensters (z. B. EXIT_ON_CLOSE) */
    private int closeOperation = JFrame.EXIT_ON_CLOSE;

    /**
     * Standardkonstruktor
     * @since 1.0
     */
    public WindowFactory() {
    }

    /**
     * Erweiterter Konstruktor für Standardfenster mit Titel und Größe.
     *
     * @param title  der neue Fenstertitel
     * @param width  die neue Fensterbreite
     * @param height die neue Fensterhöhe
     * @since 1.0
     */
    public WindowFactory(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    /**
     * Setzt den Titel des Fensters.
     *
     * @param title der neue Fenstertitel
     * @return die aktuelle Instanz von {@code WindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public WindowFactory setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Bestimmt die Größe des Fensters.
     *
     * @param width  die neue Breite des Fensters.
     * @param height die neue Höhe des Fensters.
     * @return die aktuelle Instanz von {@code WindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public WindowFactory setSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    /**
     * bestimmt, ob das Fenster zentriert ist.
     *
     * @param centered {@code true}, wenn das Fenster zentriert werden soll, sonst {@code false}
     * @return die aktuelle Instanz von {@code WindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public WindowFactory setCentered(boolean centered) {
        this.centered = centered;
        return this;
    }

    /**
     * Legt die Aktion fest, die beim Schließen des Fensters ausgeführt wird.
     *
     * @param closeOperation eine der Konstanten aus {@link javax.swing.JFrame}, z. B. {@code JFrame.EXIT_ON_CLOSE}
     * @return die aktuelle Instanz von {@code WindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public WindowFactory setCloseOperation(int closeOperation) {
        this.closeOperation = closeOperation;
        return this;
    }

    /**
     * Erstellt ein {@link javax.swing.JFrame} mit den zuvor gesetzten Eigenschaften.
     * <p>
     * Das Fenster wird mit Titel, Größe und Schließverhalten konfiguriert. Falls aktiviert,
     * wird es zentriert auf dem Bildschirm positioniert.
     * </p>
     *
     * @return ein konfiguriertes {@code JFrame}-Objekt
     * @see javax.swing.JFrame
     * @since 1.0
     */
    public JFrame build() {
        JFrame mainFrame = new JFrame(title);
        mainFrame.setSize(width, height);
        mainFrame.setDefaultCloseOperation(closeOperation);
        if (centered) {
            mainFrame.setLocationRelativeTo(null);
        }
        return mainFrame;
    }
}
