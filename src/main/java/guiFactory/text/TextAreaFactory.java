package guiFactory.text;

import javax.swing.*;
import java.awt.*;

public class TextAreaFactory {

    private final JTextArea textArea;

    public TextAreaFactory() {
        this.textArea = new JTextArea();
    }

    public TextAreaFactory setFont(Font font) {
        textArea.setFont(font);
        return this;
    }

    public TextAreaFactory setEditable(boolean editable) {
        textArea.setEditable(editable);
        return this;
    }

    public TextAreaFactory setLineWrap(boolean wrap) {
        textArea.setLineWrap(wrap);
        return this;
    }

    public TextAreaFactory setWrapStyleWord(boolean wrapStyleWord) {
        textArea.setWrapStyleWord(wrapStyleWord);
        return this;
    }

    public TextAreaFactory setText(String text) {
        textArea.setText(text);
        return this;
    }

    public TextAreaFactory setCaretPosition(int position) {
        textArea.setCaretPosition(position);
        return this;
    }

    public JTextArea build() {
        return textArea;
    }
}