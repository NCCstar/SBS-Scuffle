package physics;
import shapes.*;
import java.awt.*;
public abstract class Phys
{//protected actually working.
   protected double Grav; //gravitational coefficent - diff
   protected double xVel;
   protected double yVel;
   protected Hitbox hitbox;
   public Phys(Hitbox hitbox)
   {
      this.hitbox = hitbox;
   }
   protected Phys()
   {}
   public void posTick()
   {
      hitbox.offsetX(xVel);
      hitbox.offsetY(yVel);
   }
   public void draw(Graphics g)
   {
      hitbox.draw(g);
   }
   public void setHitbox(Hitbox hitbox)
   {
      this.hitbox = hitbox;
   }
   public Hitbox getHitbox()
   {
      return hitbox;
   }
   public void offsetX(double off)
   {
      hitbox.offsetX(off);
   }
   public void offsetY(double off)
   {
      hitbox.offsetY(off);
   }
   //TEMP
   public double getXVel()
   {
      return xVel;
   }
   public double getYVel()
   {
      return yVel;
   }
}