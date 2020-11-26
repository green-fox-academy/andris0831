import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
        public static void checkers(Graphics graphics) {
            int x = 0;
            int y = 0;
            int size = 10;
            boolean blue = true;
            int width = 40;
            int height = 40;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    x += 40;
                    if (blue == true) {
                        graphics.setColor(Color.BLUE);
                    } else {
                        graphics.setColor(Color.BLACK);
                    }
                    graphics.fillRect(x, y, width, height);
                    blue = !blue;
                }
                blue = !blue;
                x = 0;
                y += 40;
            }
        }
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        checkers(graphics);

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
