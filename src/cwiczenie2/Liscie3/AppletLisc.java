package cwiczenie2.Liscie3;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Krzysiek on 2016-11-19.
 */
public class AppletLisc extends Applet implements Runnable {
    int x = 10;
    int y = 10;
    Lisc lisc1;
    Lisc liscie[] = new Lisc[10];

    public void init() {
        System.out.println("init");
        Dimension d = getSize();
        lisc1 = new Lisc(d);
        for (int i = 0; i < 10; i++) {
            liscie[i] = new Lisc(d);
        }
        setBackground(new Color(20, 50, 67));
        setBackground(Color.magenta);
        Thread w = new Thread(this);
        w.start();
    }

    public void paint(Graphics g) {
        //  g.drawString("Jestem", x, y);
        System.out.println("paint");
        System.out.println(Thread.currentThread().toString());
        for (Lisc jedenLisc : liscie) {
            jedenLisc.rysuj(g);
        }
        showStatus("Aplet działa");
    }

    @Override
    public void run() {
        System.out.println("RUN");
     //   while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Ja wątek, działam!");

            Dimension d = getSize();
            for(Lisc l : liscie)
                l.spadaj(d);
        System.out.println("repaint");
            repaint();
      //  }
    }

}
