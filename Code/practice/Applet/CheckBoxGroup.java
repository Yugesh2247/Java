
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=CheckBoxGroup width=600 height=500>
  </applet>
 */
public class CheckBoxGroup extends Applet  
{
    public void init()
        {
Label l=new Label("Your Favourite Game");
CheckboxGroup cbg=new CheckboxGroup();
Checkbox c1=new Checkbox("cricket",cbg,true);
Checkbox c2=new Checkbox("bgmi",cbg,false);
Checkbox c3=new Checkbox("FreeFire",cbg,false);
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