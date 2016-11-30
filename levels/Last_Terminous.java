package levels;
import shapes.*;
public class Last_Terminous extends Level
{
   public Last_Terminous()
   {
      XSIZE = 1000;
      YSIZE = 700;
      Shape floor = new Rect(250,495,750,505);
      super.addBox(floor);
   }
}