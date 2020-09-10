
import java.awt.*;
import java.applet.*;

public class HuisH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(160, 130, 210, 70);
        g.drawLine(210, 70, 260, 130 );
        g.drawLine(260, 130, 160, 130);
        g.drawRect(160, 130, 100, 70);
        g.drawRect(215, 160, 25, 40);
        g.drawRect(180, 140, 20, 20);
    }
}
