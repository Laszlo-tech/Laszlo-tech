package Drawings;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Diagonals {
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;


  public static void drawImage(Graphics graphics) {
    // Create a function that draws a single line
    // Use this function to draw the canvas' diagonals
    // If the line starts from the upper-left corner it should be green, otherwise it should be red
    // Make decision about the color in the function

    atlo(graphics, 0, 0);
  }

    public static void atlo(Graphics graphics, int x1, int y1);
     if (x1 == 0) {
    graphics.setColor(Color.RED);
    graphics.drawLine(x1, y1, 320, 320);
  } else {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x1, y1, 0, 320);
  }
}
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
      drawImage(graphics);
    }
  }
}
