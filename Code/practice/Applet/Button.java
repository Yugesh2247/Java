import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=Button width=400 height=500>
</applet>*/

public class Button extends Applet implements ActionListener
{
    TextField t1= new TextField();
    TextField t2=new TextField();
    Button btn=new Button();
public void init()
{
add(t1);
add(btn);
btn.addActionListener(this);
}
public void paint(Graphics g)
{
g.drawString(str,10,10);
}
public void actionPerformed(ActionEvent e)
{
 str="Thanks You!";
repaint();
}
}