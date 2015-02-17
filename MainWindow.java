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
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        positionWindow();


        getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        JPanel[] panels = new JPanel[3];
        int j = 1;
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panels[i].setLayout(new BoxLayout(panels[i], BoxLayout.X_AXIS));
            for (int k = 0; k < 2; k++) {
                panels[i].add(new JButton(String.valueOf(j++)));
            }
            add(panels[i]);
        }

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
