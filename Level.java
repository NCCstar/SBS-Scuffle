import java.util.*;
public abstract class Level
{
   public int XSIZE;
   public int YSIZE;
   private List<Shape> boxes = new ArrayList();
   public List<Shape> getBoxes()
   {
      return boxes;
   }
   public void addBox(Shape box)
   {
      boxes.add(box);
   }
}