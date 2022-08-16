
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=Choice width=600 height=500>
  </applet>
 */
public class Choice extends Applet implements ItemListener, ActionListener {
    Choice c;
    List l;
    String msg;

    public void init() {
        c = new Choice();
        l = new List();
        c.add("Selena");
        c.add("Henna");
        c.add("Camila");

        l.add("Selena");
        l.add("Henna");
        l.add("Camila");
        add(c);
        add(l);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    private void addItemListener(Choice choice) {
    }

    private void add(String string) {
    }

    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        String cmsg = (String) c.getSelectedItem();
        String lmsg = l.getSelectedItem();
        g.drawString((String) cmsg, 200, 200);
        g.drawString(lmsg, 200, 400);
    }

    private Object getSelectedItem() {
        return null;
    }
}