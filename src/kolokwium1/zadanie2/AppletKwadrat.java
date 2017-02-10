package kolokwium1.zadanie2;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Krzysiek on 2016-11-30.
 */
public class AppletKwadrat extends Applet {
    private ArrayList<Kwadrat> kwadratArrayList;
    private Dimension dimension;
    private int ileKwadratow;
    private Kwadrat kwadrat;
    int size;


    @Override
    public void init() {
      // size = Integer.parseInt(getParameter("ROZMIAR_KWADRATU"));
        setBackground(Color.PINK);
        dimension = getSize();
        kwadrat = new Kwadrat(dimension);
        kwadratArrayList = new ArrayList<>();
        //  ileKwadratow = Integer.parseInt(getParameter("ILE_KWADRATOW"));
        ileKwadratow = 10;
        for (int i = 0; i < 10; i++) {
            kwadratArrayList.add(new Kwadrat(dimension));
        }

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
        new Thread(new Watek()).start();

    }

    @Override
    public void paint(Graphics g) {

       // kwadrat.rysujJeden(g);
        for(Kwadrat kwadrat:kwadratArrayList){
            kwadrat.rysuj(g);
        }
    }

    class Watek implements Runnable {

        @Override
        public void run() {
            while (true) {
                for (Kwadrat kwadrat : kwadratArrayList) {

                    kwadrat.przerysuj();
                    System.out.println("as");
                }

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();

            }
        }
    }

}
