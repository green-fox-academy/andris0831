import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SquareSequence {

    public static void squares(int xCor, Graphics graphics) {
        Color PURPLE = new Color(148,0,211);
        graphics.setColor(PURPLE);
        graphics.fillRect(xCor, xCor, xCor, xCor);
    }

    public static void mainDraw(Graphics graphics) {
        // Draw a sequence of square and each square starting point is
        // the end point of the diagonal of the previous


        for (int i = 0; i < 10; i++) {
            squares((i + 1) * 10, graphics);
        }
        }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        HorizontalLines.ImagePanel panel = new HorizontalLines.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

