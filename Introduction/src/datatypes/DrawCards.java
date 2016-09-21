package datatypes;

import java.util.Random;

public class DrawCards {

	public static void main(String[] args) {
		String suite[] = {"Diamond", "Clubs", "Hearts", "Spade"};
		String card[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		System.out.print("I drew the " + card[pickRandomCard() - 1] + " of " + suite[pickRandomSuite() -1 ] + ".");
	}
	
	public static int pickRandomSuite(){
		double rand = Math.random();
		int cardIndex = (int) (4*rand);
		return cardIndex +1; 
	}
	
	public static int pickRandomCard(){
		double rand2 = Math.random();
		int cardIndex2 = (int) (13*rand2);
		return cardIndex2 +1; 
	}
}