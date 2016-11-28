import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SBSS_Panel extends JPanel
{
   private Level level;
   public SBSS_Panel(Level l)
   {
      level = l;
      
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.black);
      for(Shape s:level.getBoxes())
      {
         if(s instanceof Rect)
         {
            Rect r = (Rect)s;
            g.fillRect((int)r.getLeft(),(int)r.getTop(),(int)r.getWidth(),(int)r.getHeight());
         }
      }
   }
   public void checkIn(KeyEvent e)
   {
      /*
      switch(e.getKeyCode())
      {
         case KeyEvent.VK_W:keyW=true;
            break;
         case KeyEvent.VK_A:keyA=true;
            break;
         case KeyEvent.VK_S:keyS=true;
            break;
         case KeyEvent.VK_D:keyD=true;
            break;
         case KeyEvent.VK_SPACE:keySp=true;
            break;
         case KeyEvent.VK_SHIFT:keySh=true;
            break;
         case KeyEvent.VK_NUMPAD4:key4=true;
            break;
         case KeyEvent.VK_NUMPAD5:key5=true;
            break;
         case KeyEvent.VK_NUMPAD6:key6=true;
            break;
         case KeyEvent.VK_NUMPAD8:key8=true;
            break;
         case KeyEvent.VK_ENTER:keyEn=true;
            break;
         case KeyEvent.VK_NUMPAD0:keyZe=true;
            break;
         default: 
            break;
      }
      */
   }
   public void checkOut(KeyEvent e)
   {
      /*
      switch(e.getKeyCode())
      {
         case KeyEvent.VK_W:keyW=false;
            break;
         case KeyEvent.VK_A:keyA=false;
            break;
         case KeyEvent.VK_S:keyS=false;
            break;
         case KeyEvent.VK_D:keyD=false;
            break;
         case KeyEvent.VK_SPACE:keySp=false;
            if(atks[0]!=1||atks[1]!=3)
               plys[0].attack(5,true);
            break;
         case KeyEvent.VK_SHIFT:keySh=false;
            if(atks[0]!=1||atks[1]!=3)
               plys[0].attack(5,false);
            break;
         case KeyEvent.VK_NUMPAD4:key4=false;
            break;
         case KeyEvent.VK_NUMPAD5:key5=false;
            break;
         case KeyEvent.VK_NUMPAD6:key6=false;
            break;
         case KeyEvent.VK_NUMPAD8:key8=false;
            break;
         case KeyEvent.VK_ENTER:keyEn=false;
            plys[1].attack(5,false);
            break;
         case KeyEvent.VK_NUMPAD0:keyZe=false;
            plys[1].attack(5,true);
            break;
         default: 
            break;
      }
      */
   }

}