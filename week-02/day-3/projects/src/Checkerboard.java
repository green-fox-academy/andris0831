import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {



    public static void checker(Graphics graphics) {
        int sizeOfBoard = 8;
        int x, y;
        for (int row = 0; row < sizeOfBoard; row++) {

            for (int col = 0; col < sizeOfBoard; col++) {

                x = row * 40;

                y = col * 40;

                if ((row % 2 == 0) == (col % 2 == 0))
                    graphics.setColor(Color.BLACK);
                else
                    graphics.setColor(Color.WHITE);


                graphics.fillRect(x, y, 40, 40);
            }
        }
    }

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        checker(graphics);

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
