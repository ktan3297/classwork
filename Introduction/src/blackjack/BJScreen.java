package blackjack;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

/**
 *  
 * @author Kristy Tan
 *
 */
public class BJScreen extends ClickableScreen implements Runnable {

	private Deck deck1;
	public PlayerHand player1;
	public Dealer dealer1;
	public Button hit;
	public Button stand;
	private TextLabel name;
	private Graphic background;
	public Graphic card1;
	public Graphic card2;
	public int positionCount = 100;
	public int nextRow = 200;
	
	public BJScreen(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		
		background = new Graphic(0, 0, 800, 600, "resources/sampleImages/background.jpg");
		viewObjects.add(background);
		
		player1 = new PlayerHand();
		dealer1 = new Dealer();
		deck1 = new Deck();
		
//		cards = new Graphic(15,200, 60,80, deck1.deck.get(0).image1);
		card1 = new Graphic(15,200, 60,80, PlayerHand.hand.get(0).image1);
		card2 = new Graphic(100,200, 60,80, PlayerHand.hand.get(1).image1);
		viewObjects.add(card1);
		viewObjects.add(card2);
		
		name = new TextLabel(350, 50, 300, 60, "Blackjack");
		hit = new Button(20, 350,65,40,"Hit", Color.green, new Action() {
			
			@Override
			public void act() {
					PlayerHand.hit();
					viewObjects.add(new Graphic(positionCount + 85, nextRow, 60,80, PlayerHand.nextCard().image1));
					positionCount += 85;
					if(positionCount >= 695){
						positionCount = 15;
						nextRow += 100;
					}
			}
		});
		
		stand = new Button(20,400,65,40,"Stand", Color.green, new Action(){
			public void act(){
			//	PlayerHand.stay();
			}
		});
		
		viewObjects.add(name);
		viewObjects.add(hit);
		viewObjects.add(stand);
	}
}
