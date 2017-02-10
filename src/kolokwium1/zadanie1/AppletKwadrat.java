package kolokwium1.zadanie1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Krzysiek on 2016-11-29.
 */
public class AppletKwadrat extends Applet {
/*
    <applet code="AppletKwadrat.class" width=300 height=300>
    <param name="wielkosc_kwadratu" value="30" />
    </applet>
    */

    private Dimension dimension;
    private ArrayList<Kwadrat> kwadratArrayList = new ArrayList<>();
    private int size;

    @Override
    public void init() {
        dimension = getSize();
        // size = 10;
        size = Integer.parseInt(getParameter("wielkosc_kwadratu"));
        for (int i = 0; i < 5; i++) {

            kwadratArrayList.add(new Kwadrat(dimension, size));
        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {

                    for (Kwadrat kwadrat : kwadratArrayList) {
                        if (kwadrat.nalezy(e.getX(), e.getY())) kwadrat.zwieksz();
                    }
                    repaint();
                } else if (e.getButton() == MouseEvent.BUTTON3) {

                    for (Kwadrat kwadrat : kwadratArrayList) {
                        if (kwadrat.nalezy(e.getX(), e.getY())) kwadrat.zmniejsz();
                    }
                    repaint();
                }
            }
        });
    }

    @Override
    public void paint(Graphics graphics) {
        for (Kwadrat kwadrat : kwadratArrayList) {

            kwadrat.rysuj(graphics);
        }
    }

}
