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
      
      landMove = 1.3;
      jumpPower = 1.5;
      maxJumps = 6;
      airMove = .015;
      airMax = 1.4;
      Grav = .008;
      ffMulti = 2;
   }
}