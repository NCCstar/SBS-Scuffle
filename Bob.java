import java.util.*;
public class Bob extends Character
{
   public Bob(double x,double y)
   {
      super(x,y,new Hitbox(new Shape[]{new Rect(0,0,10,10)}));
   }
}