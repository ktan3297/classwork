package blackjack;

import java.util.ArrayList;

/**
 * @author Kristy Tan
 *
 */ 

public class Deck implements DeckInterface{

	public static ArrayList <Card> deck;
 	
	public Deck() {
		generateDeck();
//		for(int i = 0 ; i <deck.size(); i++){
//			System.out.println(deck.get(i).value + deck.get(i).faceValue +  deck.get(i).suit);
//		}

		shuffleDeck();
		initialStart();
	}
	
	public void generateDeck(){
		deck = new ArrayList <Card>();
		String[] faces = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen",  "king"};
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] cardImages = {"resources/sampleImages/ace_of_diamonds.png", "resources/sampleImages/ace_of_clubs.png","resources/sampleImages/ace_of_hearts.png","resources/sampleImages/ace_of_spades.png",
				"resources/sampleImages/2_of_diamonds.png", "resources/sampleImages/2_of_clubs.png","resources/sampleImages/2_of_hearts.png","resources/sampleImages/2_of_spades.png",
				"resources/sampleImages/3_of_diamonds.png", "resources/sampleImages/3_of_clubs.png","resources/sampleImages/3_of_hearts.png","resources/sampleImages/3_of_spades.png",
				"resources/sampleImages/4_of_diamonds.png", "resources/sampleImages/4_of_clubs.png","resources/sampleImages/4_of_hearts.png","resources/sampleImages/4_of_spades.png",
				"resources/sampleImages/5_of_diamonds.png", "resources/sampleImages/5_of_clubs.png","resources/sampleImages/5_of_hearts.png","resources/sampleImages/5_of_spades.png",
				"resources/sampleImages/6_of_diamonds.png", "resources/sampleImages/6_of_clubs.png","resources/sampleImages/6_of_hearts.png","resources/sampleImages/6_of_spades.png",
				"resources/sampleImages/7_of_diamonds.png", "resources/sampleImages/7_of_clubs.png","resources/sampleImages/7_of_hearts.png","resources/sampleImages/7_of_spades.png",
				"resources/sampleImages/8_of_diamonds.png", "resources/sampleImages/8_of_clubs.png","resources/sampleImages/8_of_hearts.png","resources/sampleImages/8_of_spades.png",
				"resources/sampleImages/9_of_diamonds.png", "resources/sampleImages/9_of_clubs.png","resources/sampleImages/9_of_hearts.png","resources/sampleImages/9_of_spades.png",
				"resources/sampleImages/10_of_diamonds.png", "resources/sampleImages/10_of_clubs.png","resources/sampleImages/10_of_hearts.png","resources/sampleImages/10_of_spades.png",
				"resources/sampleImages/jack_of_diamonds2.png", "resources/sampleImages/jack_of_clubs2.png","resources/sampleImages/jack_of_hearts2.png","resources/sampleImages/jack_of_spades2.png",
				"resources/sampleImages/queen_of_diamonds2.png", "resources/sampleImages/queen_of_clubs2.png","resources/sampleImages/queen_of_hearts2.png","resources/sampleImages/queen_of_spades2.png",
				"resources/sampleImages/king_of_diamonds2.png", "resources/sampleImages/king_of_clubs2.png","resources/sampleImages/king_of_hearts2.png","resources/sampleImages/king_of_spades2.png"};
		int iNum = 0;
		for(int i = 0; i < 13; i++){
			for(int s = 0; s < 4; s++){
				if(i == 10 || i == 11 || i == 12 ){
					deck.add(new Card(10, faces[i], suit[s], cardImages[iNum]));
			//		System.out.println("hi");
					iNum++;
				}else{
			//		System.out.println("bye");
					deck.add(new Card(i + 1, faces[i], suit[s], cardImages[iNum]));
			//		System.out.println("no");
					iNum++;
				}
			}
		}
	} 
	 
	public void shuffleDeck(){
		for(int i = 0; i < deck.size(); i++){
			int randNum = (int) (Math.random() * deck.size());
			Card holder = deck.get(randNum);
			deck.set(randNum, deck.get(i));
			deck.set(i, holder);
		}
		setDeck(deck);
	}
	
	public void initialStart(){
		for(int i = 0; i < 2; i++){
			System.out.println("i");
			Dealer.dealerHand.add(deck.get(0));
			System.out.println("ok");
			deck.remove(0);
			PlayerHand.hand.add(deck.get(0));
			deck.remove(0);
		}

		setDeck(deck);
	}

	@Override
	public void setDeck(ArrayList<Card> deckCard) {
		deckCard = deck;
	}

	public static ArrayList<Card> getDeck() {
		return deck;
		
	}



}