package shapes;
import java.awt.*;
import java.util.*;
public class Hitbox
{
   private Shape[] boxes;
   public Hitbox(Shape[] boxes)
   {
      this.boxes = boxes;
   }
   public void draw(Graphics g)
   {
      for(Shape i:boxes)
      {
         i.draw(g);
      }
   }
   public void offsetX(double off)
   {
      for(Shape i:boxes)
      {
         i.offsetX(off);
      }
   }
}