package primary;
import java.awt.event.*;
public class Controller
{
   private SBSS_Panel game;

   protected boolean keyW=false;
   protected boolean keyA=false;
   protected boolean keyS=false;
   protected boolean keyD=false;
   protected boolean keySp=false;
   protected boolean keySh=false;
   protected boolean key4=false;
   protected boolean key5=false;
   protected boolean key6=false;
   protected boolean key8=false;
   protected boolean keyEn=false;
   protected boolean keyZe=false;

   public Controller()
   {}
   public void setGame(SBSS_Panel game)
   {
      this.game = game;
   }
   public void doEvent(int eventCode)
   {
      switch(eventCode)
      {
         case 1:keyD=false;
            break;
         default:
            break;
      }
   }
   public void checkIn(KeyEvent e)
   {
      switch(e.getKeyCode())
      {
         case KeyEvent.VK_W:game.jump(0,keyA||keyD);
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
         case KeyEvent.VK_NUMPAD4:key4=true;
            break;
         case KeyEvent.VK_NUMPAD5:key5=true;
            break;
         case KeyEvent.VK_NUMPAD6:key6=true;
            break;
         case KeyEvent.VK_NUMPAD8:game.jump(1,key4||key6);
            break;
         case KeyEvent.VK_ENTER:keyEn=true;
            break;
         case KeyEvent.VK_NUMPAD0:keyZe=true;
            break;
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
         case KeyEvent.VK_NUMPAD4:key4=false;
            break;
         case KeyEvent.VK_NUMPAD5:key5=false;
            break;
         case KeyEvent.VK_NUMPAD6:key6=false;
            break;
         case KeyEvent.VK_NUMPAD8:key8=false;
            break;
         case KeyEvent.VK_ENTER:keyEn=false;
            break;
         case KeyEvent.VK_NUMPAD0:keyZe=false;
            break;
         default: 
            break;
      }
   }

}