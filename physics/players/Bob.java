package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Bob extends Player
{
   public Bob(double x,double y)
   {
      super(new Hitbox(new Shape[]{new Rect(x,y-20,x+20,y)}));
      landMove = 1;
      airMove = 2;
      Grav = .001;
      jumpPower = 1;
      airMax = 10;
   }
}