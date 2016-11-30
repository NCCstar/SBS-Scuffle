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
   private Timer time1;
   private Timer time2;
   public SBSS_Panel(Level l,Controller c)
   {
      level = l;
      con = c;
      play1 = new Bob(500,400);
      time1 = new Timer();
      time2 = new Timer();
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.black);
      level.draw(g);
      g.setColor(Color.red.darker());
      play1.draw(g);
      if(con.keyD)
      {
         play1.offsetX(1);
         time1.schedule(new AttackStopper(con,0),100);
      }
      if(con.keyA)
      {
         play1.offsetX(-1);
      }
      repaint();
   }  
}