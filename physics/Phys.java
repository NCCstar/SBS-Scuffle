package physics;
import shapes.*;
import java.awt.*;
public abstract class Phys
{//protected actually working.
   protected static double Grav; //gravitational coefficent - diff
   protected double xVel;
   protected double yVel;
   protected double xPos;
   protected double yPos;
   protected Hitbox hitbox;
   public void posTick()
   {
      xPos+=xVel;
      yPos+=yVel;
   }
   public Phys(double x,double y,Hitbox hitbox)
   {
      xPos=x;
      yPos=y;
      this.hitbox = hitbox;
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
}