import java.applet.*;
import java.awt.*;
/*
 <applet code=Applet3
 width=400
 height=500
 ></applet>
 */

import javafx.scene.text.Font;

public class Applet3 extends Applet{
    public void init(){
        setBackground(Color.black);
        setForeground(Color.red);
        
    }
    public void paint(Graphics g){
        int x[]={20,50,80};
        int y[]={80,20,80};
        g.drawRect(100,100,250,200);
        g.drawRoundRect(400, 100, 250, 200, 100, 100);
        g.drawOval(100,300,200,200);
        g.drawLine(10, 10, 100, 100);
        g.drawString("Selena", 10, 0);
        g.drawPolygon(x, y, 3);
    }
    
}
