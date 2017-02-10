package kolokwium1.zadanie2;

import java.awt.*;
import java.util.Random;

/**
 * Created by Krzysiek on 2016-11-30.
 */
public class Kwadrat {
    private Dimension dimension;
    private float x, y, sizeX, sizeY;
    private Random random;
    private Color color;
    private static final float SIZE_MIN = 5f;
    private static final float SIZE_MAX = 25f;
    final float max;
    final float min;
    boolean isGrowing = true;

    public Kwadrat(Dimension dimension) {
        random = new Random();
        color = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
        sizeX = sizeY = SIZE_MIN + (SIZE_MAX - SIZE_MIN) * random.nextFloat();
        x = (sizeX - 1) + (dimension.width * random.nextFloat() - 2 * (sizeX - 1));
        y = (sizeX - 1) + (dimension.height * random.nextFloat() - 2 * (sizeX - 1));
        max = 2 * sizeX;
        min = sizeX;

    }

    public void rysuj(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect((int) x, (int) y, (int) sizeX, (int) sizeY);

    }

    public void rysujJeden(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillRect(10, 10, 20, 20);
    }

    public void przerysuj() {

        if (sizeX < max && isGrowing) {
            sizeX += 2;
            sizeY += 2;
            x -= 1;
            y -= 1;
        } else {
            isGrowing = false;
            sizeX -= 2;
            sizeY -= 2;
            x += 1;
            y += 1;
            if (sizeX < min) isGrowing=true;
        }
    }
}
