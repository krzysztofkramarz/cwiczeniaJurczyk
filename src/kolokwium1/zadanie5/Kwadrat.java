package zadanie4;

import java.awt.*;
import java.util.Random;

/**
 * Created by kkramarz on 02.12.16.
 */
public class Kwadrat {

	private int x, y;

	private Color color;
	private Dimension dimension;
	private int dlugoscBoku;
	private int wartosc;

	public Kwadrat(Dimension dimension, int dlugoscBoku, int x, int y) {
		this.dlugoscBoku = dlugoscBoku;
		this.dimension = dimension;
		color = Color.WHITE;
		this.x = x;
		this.y = y;

	}

	public void rysujJeden(Graphics graphics) {
		wartosc = 0;
		graphics.setColor(color);

		graphics.fillRect(x - dlugoscBoku / 2, y - dlugoscBoku / 2, dlugoscBoku, dlugoscBoku);
		graphics.setColor(Color.BLACK);
		graphics.drawString(Integer.toString(wartosc), x, y);

	}

	public void rysujWiele(Graphics graphics, int koordynata) {
		graphics.setColor(color);
		graphics.fillRect((x - dlugoscBoku / 2) + (koordynata * dlugoscBoku) + koordynata*7, y - dlugoscBoku / 2,
				dlugoscBoku, dlugoscBoku);
		graphics.setColor(Color.BLACK);
		graphics.drawString(Integer.toString(wartosc), x + (koordynata * dlugoscBoku) + koordynata*7, y);
	}

	public void zmieniajCyfre() {
		wartosc += 1;
		if (wartosc > 9)
			wartosc = 0;

	}

	}
