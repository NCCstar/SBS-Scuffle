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
      airMove = .017;
      ffMulti = 2;
      Grav = .012;
      jumpPower = 2.3;
      airMax = 1.2;
      maxJumps = 1;
   }
}