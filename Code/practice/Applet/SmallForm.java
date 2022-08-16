import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=SmallForm width=400 height=500>
</applet>*/

public class SmallForm extends Applet 
{
String name="",Gender="";
int age;
   TextField t=new TextField();
   CheckboxGroup g=new CheckboxGroup();
   Checkbox m=new Checkbox("Male",g,true);
   Checkbox f=new Checkbox("Female",g,false);
   Choice c=new Choice();
   Label l1=new Label("Enter your name");
   Label l2=new Label("Select Gender");
   Label l3=new Label("Age:");
   Button btn=new Button("Submit");
   public void init()
{
add(l1);
add(t);
add(l2);
add(m);
add(f);
add(l3);
c.add("18");
c.add("19");
c.add("20");
c.add("21");
c.add("22");
add(c);
add(btn);
}
}

