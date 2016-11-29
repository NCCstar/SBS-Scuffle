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
}