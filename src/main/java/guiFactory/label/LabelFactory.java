package guiFactory.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelFactory {








    private final String text;
    private int alignment = SwingConstants.LEFT;
    private Color color = Color.BLACK;
    private Font font = new Font("SansSerif", Font.PLAIN, 12);
    private Border border = null;
    private int width = -1;
    private int height = -1;

    public LabelFactory(String text) {
        this.text = text;
    }

    public LabelFactory(String text, int alignment, Color color, Font font, Border border, int width, int height) {
        this.text = text;
        this.alignment = alignment;
        this.color = color;
        this.font = font;
        this.border = border;
        this.width = width;
        this.height = height;

    }

    public JLabel build() {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(alignment);
        label.setForeground(color);
        label.setFont(font);
        if (border != null) {
            label.setBorder(border);
        }
        if (width > 0 && height > 0) {
            label.setPreferredSize(new Dimension(width, height));
        }
        return label;
    }

}
