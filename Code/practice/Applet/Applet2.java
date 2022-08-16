import java.applet.*;
import java.awt.*;
/*<applet code="Applet2"
          width=400
          height=600>
        
    </applet>*/
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
public class Applet2 extends Applet{

    TextField t1=new TextField();
    TextField t2=new TextField();

    public void AppletNew(){
        Label l1=new Label("First number");
        Label l2=new Label("second number");
        setLayout(new GridLayout(3,2));
        setBackground(Color.black);
        add(l1);
        add(t1);
        add(l2);
        add(t2);

    }
    
}
