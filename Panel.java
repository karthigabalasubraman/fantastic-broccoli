package p3;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel {
   public void paint(Graphics gr) {
      Graphics2D g = (Graphics2D)gr;
      g.setRenderingHint(
         RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     
      Font font = new Font("Serif", Font.PLAIN, 26);
      g.setFont(font);
      g.drawString("Time", 10, 60);
      g.drawString("Date", 10, 100);
      g.drawString("Weather", 10, 160);
   } 
   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().add(new Panel());
      f.setSize(300, 200);
      f.setVisible(true);
   } 
}