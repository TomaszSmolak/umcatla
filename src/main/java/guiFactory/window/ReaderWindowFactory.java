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
 *     JFrame frame = new ReaderWindowFactory("Mein Fenster", 1024, 768)
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
 * @since 2025-07-11
 */
public class ReaderWindowFactory {

    /** Standardtitel des Fensters */
    private String title = "Fenster";

    /** Standard Breite des Fensters */
    private int width = 800;

    /** Standard Höhe des Fensters */
    private int height = 600;

    /** Standard Position des Fensters (zentriert) */
    private boolean centered = true;

    /** TODO: Fenstergröße veränderbar machen (true/false konfigurierbar) */
    private boolean resizable = true;

    /** TODO: Optionales Fenster-Icon (z.B. für Anwendungssymbol) */
    private ImageIcon icon;

    /** Standard Schließverhalten des Fensters (Schließt das Programm) */
    private int closeOperation = JFrame.EXIT_ON_CLOSE;

    /**
     * Standardkonstruktor.
     * @since 1.0
     */
    public ReaderWindowFactory(){}

    /**
     * Erweiterter Konstruktor für Standardfenster mit Titel und Größe.
     * @param title der neue FensterTitel
     * @param width die neue Fensterbreite
     * @param height die neue Fensterhöhe
     * @since 1.0
     */
    public ReaderWindowFactory(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    /**
     * Setzt den Fenstertitel.
     *
     * @param title der neue Fenstertitel
     * @return die aktuelle Instanz von {@code ReaderWindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public ReaderWindowFactory setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Setzt die größe des Fensters.
     *
     * @param width die neue Breite des Fensters
     * @param height die neue Höhe des Fensters
     * @return die aktuelle Instanz von {@code ReaderWindowFactory} für Methodenverkettung
     * @since 1.0
     */
    // TODO: Eingabevalidierung einbauen: width und height > 0 prüfen
    public ReaderWindowFactory setSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    /**
     * Setzt die Position des Fensters.
     *
     * @param centered die neue Position
     * @return die aktuelle Instanz von {@code ReaderWindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public ReaderWindowFactory setCentered(boolean centered) {
        this.centered = centered;
        return this;
    }

    /**
     * Setzt das Schließverhalten des Fensters.
     *
     * @param closeOperation das neue Schließverhalten
     * @return die aktuelle Instanz von {@code ReaderWindowFactory} für Methodenverkettung
     * @since 1.0
     */
    public ReaderWindowFactory setCloseOperation(int closeOperation) {
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
        JFrame readerFrame = new JFrame(title);
        readerFrame.setSize(width, height);
        readerFrame.setDefaultCloseOperation(closeOperation);
        if(centered){
            readerFrame.setLocationRelativeTo(null);
        }
        // TODO: Icon setzen, wenn vorhanden → readerFrame.setIconImage(icon.getImage());
        return readerFrame;
    }

}
