package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Bob extends Player
{
   public Bob(double x,double y)
   {
      super(new Hitbox(new Shape[]{new Rect(x,y-20,x+20,y)}));
      landMove = .9;
      airMove = .015;
      Grav = .008;
      jumpPower = 1.5;
      airMax = 1.4;
      maxJumps = 6;
   }
}