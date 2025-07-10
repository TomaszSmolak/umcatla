package guiFactory.window;
import javax.swing.*;

public class WriterWindowFactory {

    private String title = "Fenster";
    private int width = 800;
    private int height = 600;
    private boolean centered = true;
    private int closeOperation = JFrame.DISPOSE_ON_CLOSE;

    public WriterWindowFactory(){}

    public WriterWindowFactory(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public WriterWindowFactory setTitle(String title) {
        this.title = title;
        return this;
    }

    public WriterWindowFactory setSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    public WriterWindowFactory setCentered(boolean centered) {
        this.centered = centered;
        return this;
    }

    public WriterWindowFactory setCloseOperation(int closeOperation) {
        this.closeOperation = closeOperation;
        return this;
    }

    public JFrame build() {
        JFrame writerFrame = new JFrame(title);
        writerFrame.setSize(width, height);
        writerFrame.setDefaultCloseOperation(closeOperation);
        if(centered){
            writerFrame.setLocationRelativeTo(null);
        }
        return writerFrame;
    }

}
