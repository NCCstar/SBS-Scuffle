package physics.players;
import shapes.*;
import physics.*;
import java.util.*;
public class Steven extends Player
{
   public Steven(double x,double y)
   {
      super();
      Shape[] boxes = new Shape[2];
      boxes[0] = new Rect(false,x,y-23,x+17,y);//torso
      boxes[1] = new Rect(true,x-1,y-1,x+18,y+1);//feet
      setHitbox(new Hitbox(boxes)); 
          
      landMove = 1.05;
      jumpPower = 2.3;
      maxJumps = 1;
      airMove = .017;
      airMax = 1.3;
      Grav = .012;
      ffMulti = 2;    
   }
}