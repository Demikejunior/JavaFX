package flags;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Multcolor extends Group {

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
