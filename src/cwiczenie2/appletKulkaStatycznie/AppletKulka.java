package cwiczenie2.appletKulkaStatycznie;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Krzysiek on 2016-11-05.
 */
public class AppletKulka extends Applet {
    final int ileKulek = 10;

    private Kulka[] tablicaKulek = new Kulka[10];

    @Override
    public void init() {
        Dimension d = getSize();
        for (int i = 0; i < tablicaKulek.length; i++)
            tablicaKulek[i] = new Kulka(d, 30);

    }

    @Override
    public void paint(Graphics g) {
        for (Kulka k : tablicaKulek) {
            k.rysuj(g);
        }

    }
}
