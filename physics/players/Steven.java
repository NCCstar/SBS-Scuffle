package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Steven extends Player
{
   public Steven(double x,double y)
   {
      super(new Hitbox(new Shape[]{new Rect(x,y-20,x+20,y)}));
      landMove = 1;
      airMove = .017;
      Grav = .012;
      jumpPower = 2.2;
      airMax = 1.2;
      maxJumps = 1;
   }
}