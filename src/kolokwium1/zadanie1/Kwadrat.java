package kolokwium1.zadanie1;

import java.awt.*;
import java.util.Random;

/**
 * Created by Krzysiek on 2016-11-29.
 */
public class Kwadrat {
    private float x, y;
    private Color color;
    private Random random;
    private int size;
    public Kwadrat(Dimension dimension, int size) {
        this.size = size;
        random = new Random();
        color = new  Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
        x =(size-1) + ( dimension.width * random.nextFloat() - 2 *(size-1));
        y =(size-1) + ( dimension.height * random.nextFloat() - 2 *(size-1));

    }

    public void rysuj(Graphics graphics){
        graphics.setColor(color);
        graphics.fillRect((int) x, (int) y, size, size);

    }

    public void zwieksz() {
        size+=1;
        if(size==80){
            size=10;
        }
    }

    public void zmniejsz() {
        size-=1;
        if(size==8){
            size=40;
        }
    }

    public boolean nalezy(int x, int y) {
        return (x>this.x && x <this.x+(size-1))&&(x>this.x && x <this.x+(size-1));
    }
}
