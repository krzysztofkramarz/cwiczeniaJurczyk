package cwiczenia3;

import java.awt.*;
import java.util.Random;

public class Kulka {

    private static final float DX_MIN = 1.0f;//minimalny krok kulki
    private static final float DX_MAX = 12.0f;//maksymalny krok kulki
    private static final float PROMIEN_MIN = 5.0f;//minimalny promien kulki
    private static final float PROMIEN_MAX = 30.0f;//maksymalny promien kulki

    private float dx, dy;//wektory ruchu kulki
    private float x, y; // koordynaty kwadratu, w którym jest kulka
    private Color color;
    private float promien;
    private Random random;
    private Dimension dimension;


    public Kulka(Dimension dimension) {
        this.dimension = dimension;
        random = new Random();
        color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());

        promien = PROMIEN_MIN + random.nextFloat() * (PROMIEN_MAX - PROMIEN_MIN);

        x = random.nextFloat() * (dimension.width - promien);
        y = random.nextFloat() * (dimension.height - promien);

        dx = DX_MIN + random.nextFloat() * (DX_MAX - DX_MIN);
        dy = 100 / promien;


    }
    public Kulka(Dimension dimension, int x, int y){
        this(dimension);
        this.x = x;
        this.y = y;
    }


    void rysuj(Graphics graphics) {

        graphics.setColor(color);
        graphics.fillOval((int) (x-promien), (int) (y-promien), (int) (2 * promien), (int) (2 * promien));

        graphics.setColor(Color.RED);
        graphics.drawString("DOMEK JEST NA PRERII", -10, 2);

    }


    public void przesun() {
        if (x - promien< 0 || x +  promien >= dimension.width) dx = -dx;
        if (y - promien< 0 || y +  promien >= dimension.height) dy = -dy;

        x += dx;
        y += dy;
    }

    public void zmienKolor() {
        color = Color.RED;
    }

    public boolean isContaining(int x, int y) {
        float f = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        return f <= promien * promien;
    }

}
