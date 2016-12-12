package shapes;
import java.awt.*;
public interface Shape
{
   public void draw(Graphics g);
   public void offsetX(double off);
   public void offsetY(double off);
   public int getX();
   public int getY();
   public boolean touches(Shape other);
}