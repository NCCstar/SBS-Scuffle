import levels.*;
import physics.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
public class SBSS_Panel extends JPanel
{
   private Level level;
   private Controller con;
   private physics.Character play1;
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
      if(con.keyD)
      {
         play1.offsetX(1);
      }
      if(con.keyA)
      {
         play1.offsetX(-1);
      }
   }  
}