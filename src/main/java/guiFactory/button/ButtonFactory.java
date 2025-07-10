package guiFactory.button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Eine Factory-Klasse zur Erstellung und Konfiguration von {@link javax.swing.JLabel}.
 * <p>
 * Die Klasse folgt dem <i>Fluent Interface Pattern</i>, sodass Einstellungen
 * wie Titel, Größe, Klickverhalten usw. bequem per Methodenverkettung vorgenommen werden können.
 * </p>
 * <p>
 * Beispiel:
 * <pre>{@code
 *     JButton btnBeispiel = new ButtonFactory("Mein Beispielknopf")
 *                 .setFont(new Font("Arial", Font.BOLD, 14))
 *                 .setForeground(Color.BLACK)
 *                 .setBackground(Color.WHITE)
 *                 .setBorder(BorderFactory.createLineBorder(Color.BLACK))
 *                 .setSize(160, 40)
 *                 .enableHover(Color.GRAY)
 *                 .setFocusPainted(false)
 *                 .build();
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
public class ButtonFactory {

    /** Titel des Buttons */
    private String text;

    /** Schriftart/Größe des Buttons */
    private Font font = new Font("SansSerif", Font.PLAIN, 12);

    /** Hintergrundfarbe des Buttons */
    private Color background = UIManager.getColor("Button.background");

    /** Schriftfarbe des Buttons */
    private Color foreground = Color.BLACK;

    /** Erzeugt Rahmen um den Button */
    private Border border = null;

    /** Bestimmt Größe des Buttons (width/height) */
    private Dimension size = null;

    /** Schaltet Hovereffekt am Button ein */
    private boolean hoverEffect = false;

    /** Bestimmt Farbe beim drüber hovern */
    private Color hoverColor = Color.LIGHT_GRAY;

    /** Schaltet den Fokusrahmen des Buttons ein oder aus */
    private boolean focusPainted = true;

    /**
     * Standardkonstruktor.
     * Erstellt eine Instanz ohne voreingestellten Text.
     * @since 1.0
     */
    public ButtonFactory() {}

    /**
     * Erweiterter Konstruktor zu erzeugung eines Standardbuttons.
     *
     * @param text der neue Buttontext/Titel
     */
    public ButtonFactory(String text) {
        this.text = text;
    }

    /**
     * Setzt die Schriftart und -größe des Buttons.
     *
     * @param font die neue Schriftart/Schriftgröße
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory setFont(Font font) {
        this.font = font;
        return this;
    }

    /**
     * Setzt die Hintergrundfarbe im Button.
     *
     * @param background die neue Hintergrundfarbe
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory setBackground(Color background) {
        this.background = background;
        return this;
    }

    /**
     * Setzt die Schriftfarbe des Buttons.
     *
     * @param foreground die neue Schriftfarbe
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory setForeground(Color foreground) {
        this.foreground = foreground;
        return this;
    }

    /**
     * Setzt den neuen Rahmen um den Button.
     *
     * @param border der neue Rahmen
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory setBorder(Border border) {
        this.border = border;
        return this;
    }

    /**
     * Setzt die neue Größe des Buttons.
     *
     * @param width die neue breite des Buttons
     * @param height die neue Höhe des Buttons
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory setSize(int width, int height) {
        this.size = new Dimension(width, height);
        return this;
    }

    /**
     * Setzt Hoverfarbe für den Button.
     *
     * @param hoverColor die neue Farbe für den Hovereffekt
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory enableHover(Color hoverColor) {
        this.hoverEffect = true;
        this.hoverColor = hoverColor;
        return this;
    }

    /**
     * Schaltet Fokusrahmen für den Button um.
     *
     * @param focusPainted der neue Zustand vom Fokusrahmen
     * @return die aktuelle Instanz von {@code ButtonFactory} für Methodenverkettung
     */
    public ButtonFactory setFocusPainted(boolean focusPainted) {
        this.focusPainted = focusPainted;
        return this;
    }

    /**
     * Erstellt ein {@link javax.swing.JButton} mit zuvor gesetzten Eigenschaften.
     *
     * <p>
     * Der Button wird mit den zuvor gesetzten Eigenschaften konfiguriert.
     * </p>
     *
     * @return ein konfiguriertes {@code JButton}-Objekt
     * @see javax.swing.JButton
     * @since 1.0
     */
    public JButton build() {
        JButton button = new JButton(text);
        button.setFont(font);
        button.setBackground(background);
        button.setForeground(foreground);
        button.setFocusPainted(focusPainted);
        if (border != null) button.setBorder(border);
        if (size != null) button.setPreferredSize(size);

        if (hoverEffect) {
            Color original = background;
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(hoverColor);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(original);
                }
            });
        }

        return button;
    }
}
