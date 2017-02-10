package kolokwium1.zadanie4;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by kkramarz on 02.12.16.
 */
public class AppletKwadrat extends Applet {
    // prawy kawisz zaczernia najbliższe kulki
    //lewy klawisz zmienia kwadraty na czerwono
    private ArrayList<Krzyzyk> krzyzykArrayList;
    private ArrayList<Float> odleglosci;
    private Krzyzyk krzyzyk;
    private Dimension dimension;
    private int ilosc;

    @Override
    public void init() {
        setBackground(Color.YELLOW);
        dimension = getSize();
        krzyzykArrayList = new ArrayList<>();
        krzyzyk = new Krzyzyk(dimension);


        odleglosci = new ArrayList<>();
        if (getParameter("ILOSC") == null) {
            ilosc = 10;
        } else {
            ilosc = Integer.parseInt(getParameter("ILOSC"));
        }

        krzyzyk = new Krzyzyk(dimension);

        for (int i = 0; i < ilosc; i++) {
            krzyzykArrayList.add(new Krzyzyk(dimension));
        }


        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (Krzyzyk krzyzyk : krzyzykArrayList) {
                        krzyzyk.poruszaj();
                    }
                    repaint();
                }
            }


        }).start();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1){
                    for (Krzyzyk krzyzyk : krzyzykArrayList) {
                        krzyzyk.dodajWartosc(e.getX(), e.getY());
                    }
                    repaint();
                }

                if(e.getButton()==MouseEvent.BUTTON3){
                    for (Krzyzyk krzyzyk : krzyzykArrayList) {
                        krzyzyk.odejmijWartosc(e.getX(), e.getY());
                    }
                    repaint();
                }
            }
        });
    }


    @Override
    public void paint(Graphics graphics) {
        //    krzyzyk.rysuj(graphics);
        for (Krzyzyk krzyzyk : krzyzykArrayList) {
            krzyzyk.rysuj(graphics);
        }
    }
}
