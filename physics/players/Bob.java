package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Bob extends Player
{
   public Bob(double x,double y)
   {
      super(x,y,new Hitbox(new Shape[]{new Rect(x,y-20,x+20,y)}));
      landMove = 10;
      airMove = 2;
   }
}