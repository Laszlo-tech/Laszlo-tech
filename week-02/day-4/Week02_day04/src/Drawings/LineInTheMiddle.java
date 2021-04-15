package Drawings;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class  LineInTheMiddle{
  public static void drawImage(Graphics graphics){
    /*
    graphics.setColor(Color.RED);
    graphics.drawLine(120,120,200,120);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(120,150,120,250);

    graphics.setColor(Color.RED);
   graphics.drawLine(120,120,200,120);

   graphics.setColor(Color.GREEN);
   graphics.drawLine(120,120,120,200);

   graphics.setColor(Color.BLUE);
   graphics.drawLine(120,200,200,200);

   graphics.setColor(Color.CYAN);
   graphics.drawLine(200,120,200,200);
     */







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
      drawImage(graphics);
    }
  }
}