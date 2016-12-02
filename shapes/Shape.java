package shapes;
import java.awt.*;
public interface Shape
{
   public void draw(Graphics g);
   public void offsetX(double off);
   public boolean touches(Shape other);
}