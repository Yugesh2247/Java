import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=TextField width=600 height=500>
</applet>*/
public class TextField extends Applet implements ActionListener
{
	TextField name;
	TextField password;
	
      public void init()
	 {
		Label l1=new Label("enter name");
		Label l2=new Label("enter password");
		name=new TextField(20);
		password=new TextField(20);
		password.setEchoChar('*');
		add(l1);
		add(name);
		add(l2);
		add(password);
		l1.addActionListener(this);
		name.addActionListener(this);
		l2.addActionListener(this);
		password.addActionListener(this);
				
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
        g.drawString("name is"+name.getText(),200,50);
	}
}