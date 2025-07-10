package guiFactory.layout;

import javax.swing.*;
import java.awt.*;


public class GridBagFactory {

    private final JPanel panel;
    private final GridBagConstraints gbc;

    public GridBagFactory() {
        panel = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5); // Abstand zwischen Komponenten
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE; // Kein Stretch
    }

    public GridBagFactory add(Component comp, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(comp, gbc);
        return this;
    }

    public GridBagFactory setInsets(int top, int left, int bottom, int right) {
        gbc.insets = new Insets(top, left, bottom, right);
        return this;
    }

    public GridBagFactory setFill(int fill) {
        gbc.fill = fill;
        return this;
    }

    public GridBagFactory setAnchor(int anchor) {
        gbc.anchor = anchor;
        return this;
    }

    public GridBagFactory setGridWidth(int width) {
        gbc.gridwidth = width;
        return this;
    }


    public JPanel build() {
        return panel;
    }
}

