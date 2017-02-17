package blackjack;

import java.util.ArrayList;
 
public class PlayerHand extends DealtHand{

	public static ArrayList <Card> hand;
	public boolean player = true;
	private int playerTotal = 0;
	public int finalTotal;
	
//	@Override
//	public void hit() {
//		hand.add(Deck.deck.get(0));
//		Deck.deck.remove(0);
//		
//	}

	@Override
	public int checkValue() {
		if(player){
			for(int i = 0; i < hand.size(); i++){
				playerTotal += hand.get(0).value;
			}
		}
		return playerTotal;
	}

	@Override
	public boolean stay() {
		finalTotal = playerTotal;
		player = false;
		return player;
	}

}
