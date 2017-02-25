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
		if(!PlayerHand.getStandCall()){ //if not player's turn
			while(dealerPlaying){ //computer plays
				checkValue(); //checkValue
				chance(); //take a chance
			}
		}
		checkWinner();
	}
	
	public void checkWinner(){
		if(!dealerPlaying && !PlayerHand.getStandCall()){
			if(getTotal() > PlayerHand.getPlayerTotal()){
				//computer wins and player loses money
			}
			else if(getTotal() < PlayerHand.getPlayerTotal()){
				//player wins and player wins money
			}
			else if(getTotal() == PlayerHand.getPlayerTotal()){
				//tie 
			}
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

	@Override
	public boolean getStandCall() {
		// TODO Auto-generated method stub
		return dealerPlaying;
	}

	@Override
	public void setStandCall() {
		dealerPlaying = false;
		
	}

	@Override
	public int getTotal() {
		return finalCTotal;
	}

	@Override
	public void setTotal() {
		finalCTotal = currentTotal;
	}

	

}
