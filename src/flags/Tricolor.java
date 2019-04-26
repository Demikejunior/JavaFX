package flags;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tricolor extends Group{
	
	public Tricolor(char v, double width, int[] proport, Color c1, Color c2, Color c3) {

		Rectangle l = new Rectangle();
		Rectangle m = new Rectangle();
		Rectangle r = new Rectangle();
		
		if (v == 'v' || v == 'V') {

			l.setWidth(width / 3);
			l.setHeight((width / proport[1]) * proport[0]);

			m.setWidth(width / 3);
			m.setHeight((width / proport[1]) * proport[0]);
			m.setTranslateX(width / 3);

			r.setWidth(width / 3);
			r.setHeight((width / proport[1]) * proport[0]);
			r.setTranslateX(width / 1.5);
			
		} else if (v == 'h' || v == 'H') {
			
			l.setWidth((width / proport[0]) * proport[1]);
			l.setHeight(width / 3);
			
			m.setWidth((width / proport[0]) * proport[1]);
			m.setHeight(width / 3);
			m.setTranslateY(width / 3);
			
			r.setWidth((width / proport[0]) * proport[1]);
			r.setHeight(width / 3);
			r.setTranslateY(width / 1.5);
			
		}
		
		l.setFill(c1);
		m.setFill(c2);
		r.setFill(c3);
		
		this.getChildren().addAll(l, m, r);
		
	}
	
}
