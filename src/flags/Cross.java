package flags;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Cross extends Group {

	/**
	 * 
	 * @param v 
	 * <br>V - vertical cross (Pretty much any flag that isn't Scotland)
	 * <br>D - diagonal cross (Scottish flag)
	 * <br>B - a vertical cross on top of a diagonal one (UK flag)
	 * <br><br>
	 * @param m 
	 * <br>L - vertical stripe goes through the left side (Scandinavian cross)
	 * <br>M - vertical stripe goes through the middle (English flag)
	 * <br>R - vertical stripe goes through right side (No)
	 * <br><br>
	 * @param width
	 * <br>The flags width
	 * <br><br>
	 * @param proport
	 * <br>The flags proportions as told on Wikipedia {Height, Width}
	 * <br><br>
	 * @param S1P
	 * <br>The proportion of the Red stripe in the Genoan flag to width ex. Swedish flag is 4:2:5 so S1P for Sweden is 2/11
	 * <br><br>
	 * @param S2P
	 * <br>The proportion of the white stripe in the Norwegian flag to width ex. Norwegian flag is 6:1:2:1:12 so S2P for Norway is 4/22 = 2/11
	 * <br><br>
	 * @param c1
	 * <br>First color, blue in Swedish flag
	 * <br><br>
	 * @param c2
	 * <br>Second color, blue in Finnish flag
	 * <br><br>
	 * @param c3
	 * <br>Third color, white in the UK & Norwegian flag
	 */
	public Cross (char v, char m, double width, int[] proport, double S1P, double S2P, Color c1, Color c2, Color c3) {
		
		
		
	}
	
}
