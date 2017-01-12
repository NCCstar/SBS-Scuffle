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
   /*
   0=standing, 1=upAttack, 2=rightAttack, 3=downAttack, 4=leftAttack
      int[] eventLength;
      List<Hitbox>[] eventHitbox;
      List<Double>[] eventOffsetX;
      List<Double>[] eventOffsetY;
   */
   protected void defineHitboxes()
   {
      eventLength = new int[MAX_EVENTS+1];
      eventHitbox = new ArrayList[MAX_EVENTS+1];
      for(int i=0;i<eventHitbox.length;i++)
         eventHitbox[i] = new ArrayList();
      eventOffsetX = new ArrayList[MAX_EVENTS+1];
      for(int i=0;i<eventOffsetX.length;i++)
         eventOffsetX[i] = new ArrayList();
      eventOffsetY = new ArrayList[MAX_EVENTS+1];
      for(int i=0;i<eventOffsetY.length;i++)
         eventOffsetY[i] = new ArrayList();
      
      eventLength[0] = 31;
      Hitbox tempBox = 
      eventHitbox[0].add(new Hitbox(new Rect(false,this.hitbox.getBoxes[1].getLeft(),))
   }
}