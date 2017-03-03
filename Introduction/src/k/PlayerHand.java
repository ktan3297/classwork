package k;

import java.util.ArrayList;
 
public class PlayerHand implements PlayerHandInterface {

	public static ArrayList <Card> hand;
	public static boolean player = true;
	private static int playerTotal = 0;
	private static int secondPlayerTotal = 0;
	public static int finalTotal;
	public static Card nextCard;

	public PlayerHand(){
		hand = new ArrayList <Card>();
	}

	public void checkValue() {
		playerTotal = 0;
		secondPlayerTotal = 0;
		for(int i = 0; i < hand.size(); i++){
			playerTotal += hand.get(i).value;
			if(hand.get(i).faceValue == "ace"){
				secondPlayerTotal += 11;
			}
			else{
				secondPlayerTotal += hand.get(i).value;
			}
			
		}
		
		//System.out.println(playerTotal);
		//System.out.println(secondPlayerTotal);
		
		set2ndTotal(secondPlayerTotal);
		setPlayerTotal(playerTotal);
		if(secondPlayerTotal > 21 && playerTotal > 21){
			setStandCall();
		}
	}

	public boolean stand() {
		setStandCall();
		finalTotal = playerTotal;
		return player;
	}

	public static void hit() {
			hand.add(Deck.deck.get(0));
			nextCard = Deck.deck.get(0);
			Deck.deck.remove(0);
	}

	public Card nextCard(){
		return nextCard;
	}

	public static int getPlayerTotal() {
		return PlayerHand.playerTotal;
	}

	public void setPlayerTotal(int playerTotal) {
		PlayerHand.playerTotal = playerTotal;
	}
	
	public static int get2ndTotal(){
		return PlayerHand.secondPlayerTotal;
	}
	
	public void set2ndTotal(int total){
		PlayerHand.secondPlayerTotal = total;
	}

	public void setStandCall() {
		player = false;
	}

	public static boolean getStandCall() {
		return player;
	}
}
