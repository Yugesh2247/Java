
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=ButtonEvent1 width=600 height=500>
  </applet>
 */
public class ButtonEvent1 extends Applet implements ActionListener 
{
    public void init()
        {
        Button b1=new Button("Red");
        Button b2=new Button("Blue");
        Button b3=new Button("Yellow");
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
    public void actionPerformed(ActionEvent ae)
{
     String str=ae.getActionCommand();
     if(str.equals("Red"))
      setBackground(Color.red);
     elseif(str.equals("Blue"))
      setBackground(Color.blue);
     else
      setBackground(Color.Yellow);
}
    
}
