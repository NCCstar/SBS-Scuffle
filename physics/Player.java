package physics;
import shapes.*;
public abstract class Player extends Phys
{
   protected boolean inAir;
   protected double airMove;
   protected double landMove;
   protected double airMax;
   public Player(double x,double y,Hitbox hitbox)
   {
      super(x,y,hitbox);
   }
   public void tick()
   {
      
   }
   public void jump()
   {
      yVel = 10;
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
               if(xVel*-1<airMax)
                  xVel+=airMove;
               break;
            default:
               break;
         }
      }
      else
      {
         switch(dir)
         {
            case 2:
               xPos+=landMove;
               break;
            case 4:
               xPos-=landMove;
               break;
            default:
               break;
         }
      }
   }
}