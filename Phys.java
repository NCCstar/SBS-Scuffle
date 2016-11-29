import java.awt.*;
public abstract class Phys
{
   private static double Grav; //gravitational coefficent - diff
   private double xVel;
   private double yVel;
   private double xPos;
   private double yPos;
   private Hitbox hitbox;
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
}