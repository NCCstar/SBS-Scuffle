package primary;
import levels.*;
import physics.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
public class SBSS_Panel extends JPanel
{
   private Level level;
   private Controller con;
   private Player play1;
   private double time1;
   private double time2;
   private int eCode1;
   private int eCode2;
   public SBSS_Panel(Level l,Controller c)
   {
      level = l;
      con = c;
      play1 = new Bob(500,400);
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.black);
      level.draw(g);
      g.setColor(Color.red.darker());
      play1.draw(g);
      if(time1<=0)
      {
         if(eCode1!=0)
         {
            con.doEvent(eCode1);
            eCode1=0;
         }
         if(con.keyW)
         {
            play1.jump();
            eCode1 = 1;
            timer=3000;
         }
      }
      else
      {
         time1--;
         g.fillRect(0,0,10,10);
      }
      if(con.keyA)
      {
         play1.move(4);
      }
      if(con.keyD)
      {
         play1.move(2);
      }
      repaint();
   }  
}