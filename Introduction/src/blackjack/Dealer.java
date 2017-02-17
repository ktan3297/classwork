//package blackjack;
//
//import java.util.ArrayList;
//
///**
// * @author Kristy Tan
// *
// */
// 
//public class Dealer extends DealtHand {
//
//	public static ArrayList <Card> dealerHand;
//	private int currentTotal = 0;
//	public boolean dealerPlaying;
//	public int finalCTotal;
//	public int rewards; 
//	 
//	public Dealer() {
//		initialStart(); 
//		while(dealerPlaying){
//			checkValue();
//			chance();
//		}
//	}
//	
//	public void initialStart(){
//		for(int i = 0; i < 2; i++){
//			Dealer.dealerHand.add(Deck.deck.get(0));
//			Deck.deck.remove(0);
//			PlayerHand.hand.add(Deck.deck.get(0));
//			Deck.deck.remove(0);
//		}
//	}
//	
//	public void chance(){
//		int chance = (int) (Math.random() * 100);
//		if(currentTotal == 21 || currentTotal > 21){
//			stay();
//		}else if(currentTotal < 17){
//			hit(dealerHand);
//		}
//		else if(currentTotal == 17){
//			if(chance >= 75){
//				hit(dealerHand);
//			}
//			else{
//				stay();
//			}
//		}
//		else if(currentTotal == 18){
//			if(chance >= 85){
//				hit(dealerHand);
//			}
//			else{
//				stay();
//			}
//		}
//		else if(currentTotal == 19){
//			if(chance >= 90){
//				hit(dealerHand);
//			}
//			else{
//				stay();
//			}
//		}
//		else if(currentTotal == 20){
//			if(chance >= 95){
//				hit(dealerHand);
//			}
//			else{
//				stay();
//			}
//		}
//	}
//	@Override 
//	public int checkValue() {
//		if(dealerPlaying){
//			for(int i = 0; i < dealerHand.size(); i++){
//				currentTotal += dealerHand.get(0).value;
//			}
//		}
//		return currentTotal;
//	}
//
////	@Override
////	public void hit() {
////		dealerHand.add(Deck.deck.get(0));
////		Deck.deck.remove(0);
////		
////	}
//
//	@Override
//	public boolean stay() {
//		finalCTotal = currentTotal;
//		dealerPlaying = false;
//		return dealerPlaying;
//	}
//}
