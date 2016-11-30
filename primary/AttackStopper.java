package primary;
import java.awt.event.*;
public class AttackStopper implements ActionListener
{
   private Controller con;
   private int eventCode;
   public AttackStopper(Controller con,int eventCode)
   {
      this.con = con;
      this.eventCode = eventCode;
   }
   public void actionPerformed(ActionEvent e)
   {
      con.doEvent(eventCode);
   }
}