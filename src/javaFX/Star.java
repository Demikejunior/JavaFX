package javaFX;

import javafx.scene.shape.Polygon;

public class Star extends Polygon{
	
	public Star(double r) {
		
		double v = 360 / 5.0;
		for (int i = 0; i < 5; i++) {
			double x = Math.sin(Math.toRadians(108 + v * 2 * i)) * r;
			double y = Math.cos(Math.toRadians(108 + v * 2 * i)) * r;
			getPoints().add(x);
			getPoints().add(y);
		}
		
	}
	
}
