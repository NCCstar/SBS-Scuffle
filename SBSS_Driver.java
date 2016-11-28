import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SBSS_Driver
{
   private static SBSS_Panel panel;
   public static void main(String[] arg)
   {
      JFrame frame = new JFrame("Superb Bash Siblings: Scuffle");
      
      Level level = new Last_Terminous();
      
      panel = new SBSS_Panel(level);
      int SIZE = level.SIZE;
      frame.setSize(SIZE,SIZE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(panel);
      frame.setVisible(true);
      frame.setResizable(true);//may be false
      frame.addKeyListener(new listen());	
   }
   public static class listen implements KeyListener 
   {
      public void keyTyped(KeyEvent e){}   
      public void keyPressed(KeyEvent e)
      {
         panel.checkIn(e);
      }
      public void keyReleased(KeyEvent e)
      {
         panel.checkOut(e);
      }
   }
}