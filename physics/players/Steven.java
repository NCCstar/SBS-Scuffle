package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Steven extends Player
{
   public Steven(double x,double y)
   {
      super(new Hitbox(new Shape[]{new Rect(x,y-25,x+15,y)}));
      landMove = 1.05;
      airMove = .017;
      Grav = .012;
      jumpPower = 2.3;
      airMax = 1.2;
      maxJumps = 1;
   }
}