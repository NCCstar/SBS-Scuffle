package primary;
import levels.*;
import physics.*;
import physics.players.*;
import shapes.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
public class SBSS_Panel extends JPanel
{
   private Level level;
   private Controller con;
   private Player play1;
   private Player play2;
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
      //check inAir
      outerLoop:
      for(Shape l:level.getBoxes())
      {
         for(Shape p:play1.getHitbox().getBoxes())
         {
            if(l.touches(p))
            {
               play1.setInAir(false);
               break outerLoop;
            }
         }
      }
      //events
      if(time1<=0)
      {
         if(eCode1!=0)
         {
            con.doEvent(eCode1);
            eCode1=0;
         }
      }
      else
      {
         time1--;
         g.fillRect(0,0,10,10);
      }
      //movement
      if(con.keyA)
      {
         play1.move(4);
      }
      if(con.keyD)
      {
         play1.move(2);
      }
      //jump is event
      
      play1.tick();
      g.drawString(play1.getHitbox().getBoxes()[0].getX()+":"+play1.getHitbox().getBoxes()[0].getY(),0,10);
      g.drawString(play1.getXVel()+":"+play1.getYVel(),0,20);
      repaint();
   }
   public void jump(int pNum)
   {
      play1.move(1);
   }  
}