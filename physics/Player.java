package physics;
import shapes.*;
public abstract class Player extends Phys
{
   private boolean inAir;
   public Player(double x,double y,Hitbox hitbox)
   {
      super(x,y,hitbox);
   }
}