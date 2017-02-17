package blackjack;

import java.util.ArrayList;

/**
 * @author Kristy Tan
 * 
 */
 
public class Dealer implements CallInterface {

	public static ArrayList <Card> dealerHand;
	private int currentTotal = 0;
	public boolean dealerPlaying;
	public int finalCTotal;
	public int rewards; 
	 
	public Dealer() {
		dealerHand = new ArrayList <Card>();
		while(dealerPlaying){
			checkValue();
			chance();
		}
	}
	
	public void chance(){
		int chance = (int) (Math.random() * 100);
		if(currentTotal == 21 || currentTotal > 21){
			stand();
		}else if(currentTotal < 17){
			hit();
		}
		else if(currentTotal == 17){
			if(chance >= 75){
				hit();
			}
			else{
				stand();
			}
		}
		else if(currentTotal == 18){
			if(chance >= 85){
				hit();
			}
			else{
				stand();
			}
		}
		else if(currentTotal == 19){
			if(chance >= 90){
				hit();
			}
			else{
				stand();
			}
		}
		else if(currentTotal == 20){
			if(chance >= 95){
				hit();
			}
			else{
				stand();
			}
		}
	}
	@Override 
	public int checkValue() {
		if(dealerPlaying){
			for(int i = 0; i < dealerHand.size(); i++){
				currentTotal += dealerHand.get(0).value;
			}
		}
		return currentTotal;
	}

	@Override
	public void hit() {
		dealerHand.add(Deck.deck.get(0));
		Deck.deck.remove(0);
	}

	@Override
	public boolean stand() {
		finalCTotal = currentTotal;
		dealerPlaying = false;
		return dealerPlaying;
	}

	

}
