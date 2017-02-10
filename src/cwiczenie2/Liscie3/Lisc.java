package cwiczenie2.Liscie3;

import java.awt.*;
import java.util.Random;

/**
 * Created by Krzysiek on 2016-11-19.
 */
public class Lisc {

    int x;
    int y;
    Color color;
    int szerokosc = 60;
    int wysokosc = 80;

    public Lisc(Dimension d) {
        Random random = new Random();
        x = random.nextInt(d.width);
        y = random.nextInt(d.height);
        color = new Color( random.nextFloat(), random.nextFloat(), random.nextFloat());
    }

    void rysuj (Graphics graphics){
        graphics.setColor(color);
        //graphics.fillRoundRect(x,y,80,80,20,0);


        graphics.fillRoundRect(x, y, szerokosc, wysokosc, 8, 8);
        graphics.fillRect(x+szerokosc/2, y+wysokosc, 3, 10);
    }
    public void spadaj(Dimension d) {
        if(y < d.height-wysokosc)
            y += 1;
    }
}
