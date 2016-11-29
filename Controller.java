import java.awt.event.*;
public class Controller
{
   private SBSS_Panel game;

   private boolean keyW=false;
   private boolean keyA=false;
   private boolean keyS=false;
   private boolean keyD=false;
   private boolean keySp=false;
   private boolean keySh=false;
   /*
   private boolean key4=false;
   private boolean key5=false;
   private boolean key6=false;
   private boolean key8=false;
   private boolean keyEn=false;
   private boolean keyZe=false;
   */
   public Controller()
   {}
   public void setGame(SBSS_Panel game)
   {
      this.game = game;
   }
   public void checkIn(KeyEvent e)
   {
      switch(e.getKeyCode())
      {
         case KeyEvent.VK_W:keyW=true;
            break;
         case KeyEvent.VK_A:keyA=true;
            break;
         case KeyEvent.VK_S:keyS=true;
            break;
         case KeyEvent.VK_D:keyD=true;
            break;
         case KeyEvent.VK_SPACE:keySp=true;
            break;
         case KeyEvent.VK_SHIFT:keySh=true;
            break;
         /*
         case KeyEvent.VK_NUMPAD4:key4=true;
            break;
         case KeyEvent.VK_NUMPAD5:key5=true;
            break;
         case KeyEvent.VK_NUMPAD6:key6=true;
            break;
         case KeyEvent.VK_NUMPAD8:key8=true;
            break;
         case KeyEvent.VK_ENTER:keyEn=true;
            break;
         case KeyEvent.VK_NUMPAD0:keyZe=true;
            break;
         */
         default: 
            break;
      }
   }
   public void checkOut(KeyEvent e)
   {
      switch(e.getKeyCode())
      {
         case KeyEvent.VK_W:keyW=false;
            break;
         case KeyEvent.VK_A:keyA=false;
            break;
         case KeyEvent.VK_S:keyS=false;
            break;
         case KeyEvent.VK_D:keyD=false;
            break;
         case KeyEvent.VK_SPACE:keySp=false;
            break;
         case KeyEvent.VK_SHIFT:keySh=false;
            break;
         /*
         case KeyEvent.VK_NUMPAD4:key4=false;
            break;
         case KeyEvent.VK_NUMPAD5:key5=false;
            break;
         case KeyEvent.VK_NUMPAD6:key6=false;
            break;
         case KeyEvent.VK_NUMPAD8:key8=false;
            break;
         case KeyEvent.VK_ENTER:keyEn=false;
            plys[1].attack(5,false);
            break;
         case KeyEvent.VK_NUMPAD0:keyZe=false;
            plys[1].attack(5,true);
            break;
         */
         default: 
            break;
      }
   }

}