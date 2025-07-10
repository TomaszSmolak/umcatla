package guiFactory.label;

import guiFactory.button.ButtonFactory;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Eine Factory-Klasse zur Erstellung und Konfiguration von {@link javax.swing.JLabel}.
 * <p>
 * Die Klasse folgt dem <i>Fluent Interface Pattern</i>, sodass Einstellungen
 * wie Titel, Größe, Schriftart usw. bequem per Methodenverkettung vorgenommen werden können.
 * </p>
 * <p>
 * Beispiel:
 * <pre>{@code
 *     JLabel lblBeispiel = new LabelFactory("Beispiel Label")
 *                 .setAlignment(SwingConstants.CENTER)
 *                 .setFont(new Font("Arial", Font.BOLD, 14))
 *                 .setColor(Color.BLUE)
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
public class LabelFactory {

    /** Titel/Text im Label */
    private String text;

    /** Position vom Label. */
    private int alignment = SwingConstants.LEFT;

    /** Schriftfarbe vom Label */
    private Color color = Color.BLACK;

    /** Schriftart und -größe vom Label. */
    private Font font = new Font("SansSerif", Font.PLAIN, 12);

    /** Rahmen vom Label */
    private Border border = null;

    private Dimension size = null;


    /**
     * StandardKonstruktor.
     * Erstellt eine Instanz ohne voreingestellten Werte.
     * @since 1.0
     */
    public LabelFactory(){}

    /**
     * Erweiterter Konstruktor zur Erstellung eines Standardlabels.
     *
     * @param text der neue Labelinhalt (Text)
     */
    public LabelFactory(String text) {
        this.text = text;
    }

    /**
     * Setzt Position vom Label fest.
     * @param alignment neue Position vom Label
     * @return die aktuelle Instanz von {@code LabelFactory} für Methodenverkettung
     */
    public LabelFactory setAlignment(int alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Setzt Schriftfarbe im Label neu.
     *
     * @param color neue Schriftfarbe
     * @return die aktuelle Instanz von {@code LabelFactory} für Methodenverkettung
     */
    public LabelFactory setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Setzt Schriftart und -größe vom Label neu.
     *
     * @param font neue Schriftart/-größe
     * @return die aktuelle Instanz von {@code LabelFactory} für Methodenverkettung
     */
    public LabelFactory setFont(Font font) {
        this.font = font;
        return this;
    }

    /**
     * Setzt Rahmen vom Label.
     *
     * @param border neuer Rahmen vom Label
     * @return die aktuelle Instanz von {@code LabelFactory} für Methodenverkettung
     */
    public LabelFactory setBorder(Border border) {
        this.border = border;
        return this;
    }

    /**
     * Setzt die neue Größe vom Label.
     *
     * @param width die neue Breite vom Label
     * @param height die neue Höhe vom Label
     * @return die aktuelle Instanz von {@code LabelFactory} für Methodenverkettung
     */
    public LabelFactory setSize(int width, int height) {
        this.size = new Dimension(width, height);
        return this;
    }

    /**
     * Erstellt ein {@link javax.swing.JLabel} mit zuvor gesetzten Eigenschaften.
     *
     * <p>
     * Das Label wird mit den zuvor gesetzten Eigenschaften konfiguriert.
     * </p>
     *
     * @return ein konfiguriertes {@code JLabel}-Objekt
     * @see javax.swing.JLabel
     * @since 1.0
     */
    public JLabel build() {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(alignment);
        label.setForeground(color);
        label.setFont(font);
        if (border != null) {
            label.setBorder(border);
        }
        if (size != null && size.width > 0 && size.height > 0) {
            label.setPreferredSize(size);
        }
        return label;
    }

}
