package kolokwium1.zadanie3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kkramarz on 02.12.16.
 */
public class AppletKwadrat extends Applet {
    // prawy kawisz zaczernia najbliższe kulki
    //lewy klawisz zmienia kwadraty na czerwono
    private ArrayList<Kwadrat> kwadratArrayList;
    private ArrayList<Float> odleglosci;
    private Kwadrat kwadrat;
    private Dimension dimension;
    private int ilosc;

    @Override
    public void init() {




        kwadratArrayList = new ArrayList<>();
        odleglosci = new ArrayList<>();
        dimension = getSize();

        
        System.out.println("$$$$$$$$$" + getParameter("ILOSC"));
        if (getParameter("ILOSC") == null) {
            ilosc = 10;
        } else {
            ilosc = Integer.parseInt(getParameter("ILOSC"));
        }

        kwadrat = new Kwadrat(dimension);

        for (int i = 0; i < ilosc; i++) {
            kwadratArrayList.add(new Kwadrat(dimension));
        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
                    for (Kwadrat kwadrat : kwadratArrayList) {
                        kwadrat.zmienKolor(mouseEvent.getX(), mouseEvent.getY());
                        repaint();
                    }
                }

                if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
                    for (Kwadrat kwadrat : kwadratArrayList) {
                        kwadrat.obliczOdlegloscOdKursora(mouseEvent.getX(), mouseEvent.getY());
                        odleglosci.add(kwadrat.getOdlegloscOdKursora());

                    }


                    int minIndex = odleglosci.indexOf(Collections.min(odleglosci));
                    System.out.println(Collections.min(odleglosci));
                    for (Kwadrat kwadrat : kwadratArrayList) {
                        kwadrat.zmienKolor(odleglosci.get(minIndex));

                    }
                    repaint();
                    odleglosci.clear();
                }
            }
        });

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (Kwadrat kwadrat : kwadratArrayList) {
                        kwadrat.poruszaj();
                    }
                    repaint();
                }
            }


        }).start();

    }


    @Override
    public void paint(Graphics graphics) {
        //    kwadrat.rysuj(graphics);
        for (Kwadrat kwadrat : kwadratArrayList) {
            kwadrat.rysuj(graphics);
        }
    }
}
