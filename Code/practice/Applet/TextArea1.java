

import java.applet.*;
import java.awt.*;
/*<applet code=TextArea1 height=400 width=500>
</applet>*/
public class TextArea1 extends Applet{
    TextArea tx=new TextArea();
    Button btn=new Button("Submit");
    public void init(){
setBackground(Color.black);
        add(tx);
    }
    
}
