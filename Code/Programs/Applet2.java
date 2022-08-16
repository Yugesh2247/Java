import java.awt.*;
import java.applet.*;

/*<applet code=Applet2 width=500 height =600>
</applet>*/

public class Applet2 extends Applet
{
	Image picture;
  public void init()
	{
	  picture=getImage(getDocumentBase(),"selena.jpg");
	}
	public void paint(Graphics g)
	{
		for(int i=0;i<500;i++)
		{
			if(i==499)
			{
				i=0;
			}
			g.drawImage(picture,i,30,this);
			try{
				Thread.sleep(1);
			}
			catch(Exception e){
			}
		}
	}

}