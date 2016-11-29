import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SBSS_Driver
{
   private static SBSS_Panel panel;
   private static Controller controller;
   public static void main(String[] arg)
   {
      JFrame frame = new JFrame("Superb Bash Siblings: Scuffle");
      
      Level level = new Last_Terminous();
      
      controller = new Controller();
      panel = new SBSS_Panel(level,controller);
      controller.setGame(panel);
      frame.setSize(level.XSIZE,level.YSIZE);
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
         controller.checkIn(e);
      }
      public void keyReleased(KeyEvent e)
      {
         controller.checkOut(e);
      }
   }
}