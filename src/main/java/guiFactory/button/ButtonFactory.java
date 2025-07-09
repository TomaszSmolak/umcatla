package guiFactory.button;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonFactory {

    private final String text;
    private Font font = new Font("SansSerif", Font.PLAIN, 12);
    private Color background = UIManager.getColor("Button.background");
    private Color foreground = Color.BLACK;
    private Border border = null;
    private Dimension size = null;
    private boolean hoverEffect = false;
    private Color hoverColor = Color.LIGHT_GRAY;
    private boolean focusPainted = true;


    public ButtonFactory(String text) {
        this.text = text;
    }

    public ButtonFactory setFont(Font font) {
        this.font = font;
        return this;
    }

    public ButtonFactory setBackground(Color background) {
        this.background = background;
        return this;
    }

    public ButtonFactory setForeground(Color foreground) {
        this.foreground = foreground;
        return this;
    }

    public ButtonFactory setBorder(Border border) {
        this.border = border;
        return this;
    }

    public ButtonFactory setSize(int width, int height) {
        this.size = new Dimension(width, height);
        return this;
    }

    public ButtonFactory enableHover(Color hoverColor) {
        this.hoverEffect = true;
        this.hoverColor = hoverColor;
        return this;
    }
    public ButtonFactory setFocusPainted(boolean focusPainted) {
        this.focusPainted = focusPainted;
        return this;
    }

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
