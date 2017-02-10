package kolokwium1.zadanie4;

import java.awt.*;
import java.util.Random;

/**
 * Created by kkramarz on 02.12.16.
 */
public class Krzyzyk {

    private float x, y, size;

    private Color color;

    private Random random;
    private Dimension dimension;
    private float dx, dy;
    static final private float SIZE_MIN = 20.0f;
    static final private float SIZE_MAX = 35.0f;
    static final private float DX_MIN = 2.0f;
    static final private float DX_MAX = 5.0f;
    private float odlegloscOdKursora;
    private int wartosc = 0;


    public Krzyzyk(Dimension dimension) {

        this.dimension = dimension;
        random = new Random();
        color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());

        size = SIZE_MIN + (random.nextFloat() * (SIZE_MAX - SIZE_MIN));

        x = size / 2 + random.nextFloat() * (dimension.width - size / 2);
        y = size / 2 + random.nextFloat() * (dimension.height - size / 2);

        dx = DX_MIN + (random.nextFloat() * (DX_MAX - DX_MIN));
        dy = DX_MIN + (random.nextFloat() * (DX_MAX - DX_MIN));


    }

    public void rysuj(Graphics graphic) {
        graphic.setColor(color);

        graphic.drawLine((int) (x - size / 2), (int) y, (int) (x + size / 2), (int) y);
        graphic.drawLine((int) x, (int) (y - size / 2), (int) x, (int) (y + size / 2));
        graphic.drawString(Integer.toString(wartosc), (int) x, (int) y);

    }


    public void zmienKolor(int x, int y) {

        if (x < (this.size + this.x) && x > this.x && y < (this.size + this.y) && y > this.y) {
            color = color.RED;
        }
    }

    public void poruszaj() {
        x += 1;


        if (x > (dimension.width + size / 2)) x = -size;

    }


    public void dodajWartosc(int x, int y) {
        if(x > (this.x-size/2) && x<(this.x+size/2) && y<(this.y+size/2) && y>(this.y-size/2)){
            wartosc += 1;
        }
    }

    public void odejmijWartosc(int x, int y) {
        if(x > (this.x-size/2) && x<(this.x+size/2) && y<(this.y+size/2) && y>(this.y-size/2)){
            wartosc-= 1;
        }
    }
}
