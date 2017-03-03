package k;

import java.awt.Graphics2D;

import gui.components.Visible;

/**
 * @author Kristy Tan
 *
 */
  
public class Card {

	public int value;
	public String faceValue;
	public String suit;
	public String image1;
	private static int y;
	private static int x;
	private static int h;
	private static int w;
	
	public Card(int value, String fValue, String suit, String image1){
	
		this.value = value;
		this.faceValue = fValue;
		this.suit = suit;
		this.image1 = image1;
		//setY(800);
		//setVY(-2);
		//play();
	}
}
