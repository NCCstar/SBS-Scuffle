package physics;
import shapes.*;
public abstract class Player extends Phys
{
   protected boolean inAir=true;
   protected double airMove;
   protected double ffMulti;
   protected double landMove;
   protected double airMax;
   protected double jumpPower;
   protected double numJumps;
   protected double maxJumps;
   public Player(Hitbox hitbox)
   {
      super(hitbox);
   }
   protected Player()
   {}
   public void tick(boolean fastFall)
   {
      //checkInAir has been done outside
      if(inAir)
      {
         if(fastFall)
            yVel+=Grav*ffMulti;
         else
            yVel+=Grav;
         offsetX(xVel);
         offsetY(yVel);
         if(xVel>0.01)
         {
            xVel-=airMove/6;
         }
         else
            if(xVel<0.01)
            {
               xVel+=airMove/6;
            }
      }  
   }
   public void setInAir(boolean bool)
   {
      inAir=bool;
      if(!inAir)
      {
         xVel=0;
         yVel=0;
         numJumps=0;
      }
   }
   public boolean getInAir()
   {
      return inAir;
   }
   public void move(int dir,int dirMoving)
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
               if(-1*xVel<airMax)
                  xVel-=airMove;
               break;
            case 1:
               if(numJumps<maxJumps)
               {
                  yVel=-1*jumpPower*(maxJumps-numJumps+3)/(maxJumps+3);
                  numJumps++;
               }
               break;
            case 3:
               yVel+=Grav*0.5;
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
               if(dirMoving==2)
               {
                  xVel=landMove;
               }
               else
                  if(dirMoving==4)
                  {
                     xVel=landMove*-1;
                  }
               numJumps++;
               yVel-=jumpPower;
               offsetY(-2);
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
   public void move(int dir)
   {
      move(dir,0);
   }
}