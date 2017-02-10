package zadanie4;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by kkramarz on 02.12.16.
 */
public class AppletKwadrat extends Applet {

	private  ArrayList<Kwadrat> kwadratArrayList;

	private Kwadrat kwadrat;
	private Dimension dimension;
	private int dlugoscBoku;
	private int x;
	private int y;
	int koordynata;

	@Override
	public void init() {
		setBackground(Color.BLUE);
		dimension = getSize();
		if (getParameter("DLUGOSC_BOKU") == null) {
			dlugoscBoku = 10;
		} else {
			dlugoscBoku = Integer.parseInt(getParameter("DLUGOSC_BOKU"));
		}

		x = dimension.width / 2;
		y = dimension.height / 2;
		kwadratArrayList = new ArrayList<>();
		kwadrat = new Kwadrat(dimension, dlugoscBoku, x, y);

		for (int i = 0; i < 7; i++) {
			kwadratArrayList.add(new Kwadrat(dimension, dlugoscBoku, x, y));
		}

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for (Kwadrat krzyzyk : kwadratArrayList) {
						krzyzyk.zmieniajCyfre();
					}
					repaint();
				}
			}

		}).start();

	}

	@Override
	public void paint(Graphics graphics) {
		koordynata = -3;
		// kwadrat.rysujJeden(graphics);
		for (Kwadrat kwadrat : kwadratArrayList) {
			
			kwadrat.rysujWiele(graphics, koordynata);
			koordynata += 1;
		}
	}
}
