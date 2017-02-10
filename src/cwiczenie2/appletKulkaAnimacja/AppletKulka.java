package cwiczenie2.appletKulkaAnimacja;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Krzysiek on 2016-11-05.
 */
public class AppletKulka extends Applet implements Runnable {
    final int ileKulek = 10;
    int i = 0;

    private Kulka[] tablicaKulek = new Kulka[10];
private Dimension d;
    @Override
    public void init() {
        d = getSize();
        for (int i = 0; i < tablicaKulek.length; i++)
            tablicaKulek[i] = new Kulka(d, 30);
//new Thread(this).start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("rysuję");
      //  while (true) {
            for (Kulka k : tablicaKulek) {
                k.rysuj(g);
               // try {
                //    Thread.sleep(100);
               // } catch (InterruptedException e) {
                  //  e.printStackTrace();
               // }
              //  k.przesun(d);
           // }
             //   repaint();
           // System.out.println("HEJ" + (i++));
        }
new Thread(this, String.valueOf(i++)).start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().toString());
       while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            Dimension d = getSize();
            for(Kulka k : tablicaKulek)
                k.przesun(d);
            repaint();
            System.out.println("Działam");
        }
    }
}
