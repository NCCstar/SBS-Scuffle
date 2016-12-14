package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Bob extends Player
{
   public Bob(double x,double y)
   {
      super();
      Shape[] boxes = new Shape[1];
      boxes[0] = new Rect(true,x,y-20,x+20,y);
      setHitbox(new Hitbox(boxes));
      
      landMove = .9;
      airMove = .015;
      ffMulti = 2;
      Grav = .008;
      jumpPower = 1.5;
      airMax = 1.4;
      maxJumps = 6;
   }
}