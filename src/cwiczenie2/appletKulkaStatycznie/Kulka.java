package cwiczenie2.appletKulkaStatycznie;

import java.awt.*;

/**
 * Created by Krzysiek on 2016-11-05.
 */
public class Kulka {
    private Color color;

    private int x;
    private int y;
    private int promien = 50;

    public  Kulka(Dimension d, int r  ){
        promien = r;
//        x = (int)((d.width - promien)*Math.random());
//        y = (int)((d.height - promien)*Math.random());
        x = r + (int) (Math.random() * (d.width - 2*r));
        y = r + (int) (Math.random() * (d.height - 2*r));
        color = new Color(
                (float) Math.random(),
                (float) Math.random(),
                (float) Math.random());
    }

    public void rysuj(Graphics g) {
        g.setColor(color);
        g.fillOval(x,y,4*promien, promien);
    }
}
