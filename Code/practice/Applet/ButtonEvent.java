
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=ButtonEvent width=600 height=500>
  </applet>
 */
public class ButtonEvent extends Applet implements ActionListener {

    public void init(){
        setBackground(Color.black);
        Button b1=new Button();
        Button b2=new Button();
        Button b3=new Button();
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void paint(Graphics g)
    {
           g.drawString("ButtonEvent", 100  , 100);

    }
    
}
