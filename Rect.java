import java.awt.*;
public class Rect implements Shape
{
   private double left;
   private double right;
   private double top;
   private double bottom;
   private double width;
   private double height;
   public Rect(double x1,double y1,double x2,double y2)
   {
      left = Math.min(x1,x2);
      right = Math.max(x1,x2);
      top = Math.min(y1,y2);
      bottom = Math.max(y1,y2);
      width = right - left;
      height = bottom - top;
   }
   public void draw(Graphics g)
   {
      g.fillRect((int)left,(int)top,(int)width,(int)height);
   }
   public double getLeft()
   {
      return left;
   }
   public double getRight()
   {
      return right;
   }
   public double getTop()
   {
      return top;
   }
   public double getBottom()
   {
      return bottom;
   }
   public double getWidth()
   {
      return width;
   }
   public double getHeight()
   {
      return height;
   }
   public void offsetX(double x)
   {
      left+=x;
      right+=x;
   }
}