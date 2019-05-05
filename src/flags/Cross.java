package flags;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cross extends Group {

	/**
	 * 
	 * @param width
	 * <br>The flag's width
	 * <br><br>
	 * @param proport
	 * <br>The flag's proportions as told on Wikipedia Height / Width
	 * <br><br>
	 * @param x
	 * <br>Amount of extra stripes, on the Swedish flag it's 1, Norwegian flag 2
	 * <br><br>
	 * @param SP
	 * <br>The proportion of the main stripe to width ex. Swedish flag is 5:2:9 so S1P for Sweden is 2/16
	 * <br><br>
	 * @param SxP
	 * <br>The proportion of the sub stripes to the main stripe ex. Norwegian flag is 6:1:2:1:12 so S2P for Norway is 4/2 = 2
	 * <br>Doesn't allow for multiple sub stripe proportions
	 * <br><br>
	 * @param ST
	 * <br>How far to the right the main stripe is ex. Swedish flag is 4:2:5 so St for Sweden is 4/11
	 * <br><br>
	 * @param SxT
	 * <br>What one part of the proportions is ex. Norwegian flag is 6:1:2:1:12 so S2P for Norway is 1 / 24
	 * @param c
	 * <br>An array of the colors used in the flag, c[0] will be the background color, c[1] will be the primary stripes color, 
	 * <br>subsequent indexes will be the color of the following stripe
	 * <br><br>
	 */
	public Cross (double width, double proport, int x, double SP, double SxP, double ST, double SxT, Color[] c) {
		
		Rectangle background = new Rectangle();
		background.setWidth(width);
		background.setHeight(width * proport);
		background.setFill(c[0]);
		
		this.getChildren().add(background);
		
		if (x > 1) {
			
			Rectangle[] s1 = new Rectangle[x];
			Rectangle[] s2 = new Rectangle[x];
			
			for (int i = 0; i < x - 1; i++) {
				
				s1[i] = new Rectangle();
				s2[i] = new Rectangle();
				
				s1[i].setWidth(width * SP * (x - i - 1) * SxP);
				s1[i].setHeight(width * proport);
				s1[i].setTranslateX(width * ST - (width * (i + 1) * SxT * SxP / 2.0));
				s1[i].setFill(c[c.length - i - 1]);
				
				s2[i].setWidth(width);
				s2[i].setHeight(width * SP * (x - i - 1) * SxP);
				s2[i].setTranslateY(width * proport / 2 - (width * SP * (x - i - 1) * SxP) / 2);
				s2[i].setFill(c[c.length - i - 1]);
				
				this.getChildren().addAll(s1[i], s2[i]);
				
			}
			
			s1[x - 1] = new Rectangle();
			s2[x - 1] = new Rectangle();
			
			s1[x - 1].setWidth(width * SP);
			s1[x - 1].setHeight(width * proport);
			s1[x - 1].setTranslateX(width * ST);
			s1[x - 1].setFill(c[1]);
			
			s2[x - 1].setWidth(width);
			s2[x - 1].setHeight(width * SP);
			s2[x - 1].setTranslateY(width * proport / 2 - (width * SP) / 2);
			s2[x - 1].setFill(c[1]);
			
			this.getChildren().addAll(s1[x - 1], s2[x - 1]);
			
		} else {
			
			Rectangle s1 = new Rectangle();
			Rectangle s2 = new Rectangle();
			
			s1.setWidth(width * SP);
			s1.setHeight(width * proport);
			s1.setTranslateX(width * ST);
			s1.setFill(c[1]);
			
			s2.setWidth(width);
			s2.setHeight(width * SP);
			s2.setTranslateY(width * proport / 2 - (width * SP) / 2);
			s2.setFill(c[1]);
			
			this.getChildren().addAll(s1, s2);
			
		}
		
	}
	
}
