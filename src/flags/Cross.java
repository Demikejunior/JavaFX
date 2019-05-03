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
	 * <br>R - vertical stripe goes through right side (A flipped Scandinavian cross)
	 * <br><br>
	 * @param width
	 * <br>The flags width
	 * <br><br>
	 * @param proport
	 * <br>The flags proportions as told on Wikipedia Height / Width
	 * <br><br>
	 * @param SP
	 * <br>The proportion of the main stripe to width ex. Swedish flag is 4:2:5 so S1P for Sweden is 2/11
	 * <br><br>
	 * @param SxP
	 * <br>The proportion of the sub stripes to the main stripe ex. Norwegian flag is 6:1:2:1:12 so S2P for Norway is 4/2 = 2
	 * <br>Doesn't allow for multiple sub stripes
	 * <br><br>
	 * @param c
	 * <br>An array of the colors used in the flag, c[0] will be the background color, c[1] will be the primary stripes color, 
	 * <br>subsequent indexes will be the color of the following stripe
	 * <br><br>
	 */
	public Cross (char v, char m, double width, double proport, double SP, double SxP, Color[] c) {
		
		
		
	}
	
}
