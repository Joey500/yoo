package applet; /**
 * Created by Pavilion on 24-4-2016.
 */
import java.applet.Applet;
import java.awt.*;

public class screen extends Applet {

    public void start() {

    }

    public void init() {
        setBackground(Color.PINK);

    }

    public void paint(Graphics g) {

        g.drawString("hi!", 100, 100);
        g.drawRect(100,100,100,100);

    }
}
