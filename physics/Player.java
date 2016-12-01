package physics;
import shapes.*;
public abstract class Player extends Phys
{
   protected boolean inAir;
   private double airMove;
   private double airMax;
   public Player(double x,double y,Hitbox hitbox)
   {
      super(x,y,hitbox);
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
         
      }
   }
}