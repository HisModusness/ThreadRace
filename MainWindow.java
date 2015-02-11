import javax.swing.*;
import java.awt.*;

/**
 * Created by liamwestby on 2/10/15.
 */
public class MainWindow extends JFrame {
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 500;

    public MainWindow() {
        super("HORSE");

        // Configure the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        positionWindow();


        setLayout(new GridLayout(3, 2));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));

        pack();
    }

    private void positionWindow() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        setBounds((width/2) - (FRAME_WIDTH / 2), (height/2) - (FRAME_HEIGHT / 2), FRAME_WIDTH, FRAME_HEIGHT);
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
    }
}
