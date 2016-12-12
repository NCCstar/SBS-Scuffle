package physics;
import shapes.*;
public abstract class Player extends Phys
{
   protected boolean inAir=true;
   protected double airMove;
   protected double landMove;
   protected double airMax;
   protected double jumpPower;
   protected double numJumps;
   protected double maxJumps;
   public Player(Hitbox hitbox)
   {
      super(hitbox);
   }
   public void tick()
   {
      //checkInAir has been done outside
      if(inAir)
      {
         yVel+=Grav;
         offsetX(xVel);
         offsetY(yVel);
      }
      
   }
   public void setInAir(boolean bool)
   {
      inAir=bool;
   }
   public boolean getInAir()
   {
      return inAir;
   }
   public void move(int dir)
   {
      if(inAir)
      {
         switch(dir)
         {
            case 2:
               if(xVel<airMax)
                  xVel+=airMove;
               break;
            case 4:
               if(Math.abs(xVel)<airMax)
                  xVel+=airMove;
               break;
            case 1:
               //check num jumps
               yVel-=jumpPower;
            default:
               break;
         }
      }
      else
      {
         switch(dir)
         {
            case 1:
               inAir=true;
               yVel-=jumpPower;
               offsetY(-1);
            case 2:
               offsetX(landMove);
               break;
            case 4:
               offsetX(landMove*-1);
               break;
            default:
               break;
         }
      }
   }
}