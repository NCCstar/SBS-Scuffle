import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SBSS_Panel extends JPanel
{
   private Level level;
   private Controller controller;
   private Character play1;
   public SBSS_Panel(Level l,Controller c)
   {
      level = l;
      controller = c;
      play1 = new Bob(500,400);
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.black);
      for(Shape s:level.getBoxes())
      {
         s.draw(g);
      }
   }  
}