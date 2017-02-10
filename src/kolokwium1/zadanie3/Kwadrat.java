package kolokwium1.zadanie3;

import java.awt.*;
import java.util.Random;

/**
 * Created by kkramarz on 02.12.16.
 */
public class Kwadrat {

    private float x, y, size;
    private float xKulka, yKulka, promien;
    private Color color;
    private Color colorKulka;
    private Random random;
    private Dimension dimension;
    private float dx, dy;
    static final private float SIZE_MIN = 20.0f;
    static final private float SIZE_MAX = 35.0f;
    static final private float DX_MIN = 2.0f;
    static final private float DX_MAX = 5.0f;
    private float odlegloscOdKursora;


    public Kwadrat(Dimension dimension) {

        this.dimension = dimension;
        random = new Random();
        color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
        color = colorKulka = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
        size = SIZE_MIN + (random.nextFloat() * (SIZE_MAX - SIZE_MIN));
        promien = size / 2;
        xKulka = (dimension.width - promien) * random.nextFloat();
        yKulka = (dimension.height - promien) * random.nextFloat();
        x = random.nextFloat() * (dimension.width - size);
        y = random.nextFloat() * (dimension.height - size);
        dx = DX_MIN + (random.nextFloat() * (DX_MAX - DX_MIN));
        dy = DX_MIN + (random.nextFloat() * (DX_MAX - DX_MIN));
        if (random.nextBoolean()) dx = -dx;
        if (random.nextBoolean()) dy = -dy;

    }

    public void rysuj(Graphics graphic) {
        graphic.setColor(color);
        graphic.fillRect((int) x, (int) y, (int) size, (int) size);
        graphic.setColor(colorKulka);
        graphic.fillOval((int) (xKulka - promien), (int) (yKulka - promien), (int) (2 * promien), (int) (2 * promien));
    }


    public void zmienKolor(int x, int y) {

        if (x < (this.size + this.x) && x > this.x && y < (this.size + this.y) && y > this.y) {
            color = color.RED;
        }
    }

    public void poruszaj() {
        x += dx;
        y += dy;

        if (x < 0 || x > (dimension.width - size - 1)) dx = -dx;
        if (y < 0 || y > (dimension.height - size - 1)) dy = -dy;
    }

    public void zmienKolor(float szukanaOdleglosc) {
        if (odlegloscOdKursora == szukanaOdleglosc) colorKulka = Color.black;


    }

    public void obliczOdlegloscOdKursora(int x, int y) {
        odlegloscOdKursora = Math.abs(xKulka - x) * Math.abs(xKulka - x) + Math.abs(yKulka - y) * Math.abs(yKulka - y);
        System.out.println(odlegloscOdKursora);

    }

    public float getOdlegloscOdKursora() {
        return odlegloscOdKursora;
    }
}
