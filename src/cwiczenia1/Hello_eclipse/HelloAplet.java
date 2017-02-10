package cwiczenia1.Hello_eclipse;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Krzysiek on 2016-11-05.
 */
public class HelloAplet extends Applet {
    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("Czołg", 10, 150);
        graphics.setColor(Color.RED);
        graphics.fillOval(40, 50, 90, 90);
        Dimension dimension = getSize();
        System.out.println("Rozmiar: " + dimension);
        Color c = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
        System.out.println(Math.random() + ", " + Math.random() + ", " + Math.random());
        graphics.setColor(c);
        graphics.fill3DRect(70, 40, 92, 80, true);
        graphics.fillRect(130, 50, 80, 100);
    }

}
