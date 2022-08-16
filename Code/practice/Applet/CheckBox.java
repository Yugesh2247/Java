
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=CheckBox width=600 height=500>
  </applet>
 */
public class CheckBox extends Applet  
{
    public void init()
        {
Label l=new Label("Your Favourite Game");
Checkbox c1=new Checkbox("cricket",true);
Checkbox c2=new Checkbox("bgmi");
Checkbox c3=new Checkbox("FreeFire");
add(l);
add(c1);
add(c2);
add(c3);
}
public void paint(Graphics g)
{
g.drawString("Checkbox",10,10);
}

}