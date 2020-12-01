import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {


    // Use paint() method
    public static void cheker(Graphics graphics)
    {
        int N = 10;
        int x, y;
        for (int row = 0; row < N; row++) {

            for (int col = 0; col < N; col++) {

                // Set x coordinates of rectangle
                // by 20 times
                x = row * 20;

                // Set y coordinates of rectangle
                // by 20 times
                y = col * 20;

                // Check whether row and column
                // are in even position
                // If it is true set Black color
                if ((row % 2 == 0) == (col % 2 == 0))
                    graphics.setColor(Color.BLACK);
                else
                    graphics.setColor(Color.WHITE);

                // Create a rectangle with
                // length and breadth of 20
                graphics.fillRect(x, y, 20, 20);
            }
        }
    }

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        cheker(graphics);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
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
