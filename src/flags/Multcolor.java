package flags;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Multcolor extends Group {

	/**
	 * 
	 * @param t
	 * <br>Amount of stripes ex. 3 on the French, 2 on the Polish, 5 on Togo's
	 * <br><br>
	 * @param v
	 * <br>V - vertical stripes
	 * <br>H - horizontal stripes
	 * <br><br>
	 * @param width
	 * <br>The flag's width
	 * <br><br>
	 * @param proport
	 * <br>The flag's proportions as told on Wikipedia Height / Width
	 * <br><br>
	 * @param c
	 * <br>An array of the colors used in the flag, c[0] will be the leftmost, or uppermost stripe, 
	 * <br>c[1] will be the next, and so on
	 */
	public Multcolor(int t, char v, double width, double proport, Color[] c) {

		Rectangle[] R = new Rectangle[t];

		if (v == 'v' || v == 'V') {

			for (int i = 0; i < t; i++) {

				R[i] = new Rectangle();

				R[i].setWidth(width / t);
				R[i].setHeight(width * proport);
				R[i].setTranslateX(width * i / t);
				R[i].setFill(c[i]);

			}

		} else if (v == 'h' || v == 'H') {

			for (int i = 0; i < t; i++) {
				R[i] = new Rectangle();
				R[i].setWidth(width);
				R[i].setHeight(width * proport / t);
				R[i].setTranslateY(width * i * proport / t);
				R[i].setFill(c[i]);
			}
		}

		this.getChildren().addAll(R);

	}

}
