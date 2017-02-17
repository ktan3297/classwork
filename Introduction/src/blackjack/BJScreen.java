package blackjack;

import java.awt.Color;
import java.util.ArrayList;

import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class BJScreen extends ClickableScreen implements Runnable {

//	private ButtonInterface[] button;
	private Deck deck1;
	public Button hit;
	public Button stand;
	private TextLabel name;
	private Graphic background;
	public Graphic cards; 
	
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
		
//		addButtons(viewObjects);
		background = new Graphic(0, 0, 800, 600, "resources/sampleImages/background.jpg");
		viewObjects.add(background);
		
		deck1 = new Deck();
		cards = new Graphic(15,200, 65,80, deck1.deck.get(0).image1);
//		cards = new Graphic(15,200,65,80, PlayerHand.hand.get(0).image1);
		viewObjects.add(cards);
		
		name = new TextLabel(350, 50, 300, 60, "Blackjack");
		hit = new Button(20, 350,65,40,"Hit", Color.green, new Action() {
			
			@Override
			public void act() {
		//		DealtHand.hit(PlayerHand.hand);
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
	
//	public void addButtons(ArrayList<Visible> viewObjects) {
//		// TODO Auto-generated method stub
//		int numOfButtons = 3;
//		button = new ButtonInterface[numOfButtons];
//		for(int i = 0; i < numOfButtons; i++){
//			button[i] = getAButton();
//		    button[i].setX(100*(i+1));
//		    button[i].setY(100*(i+1));
//		    
//		    ButtonInterface b = button[i];
//		    button[i].setAction(new Action(){
//		    	public void act(){
//		    		//code here
//		    	}
//		    });
//		    viewObjects.add((Visible) button[i]);
//		}
//	}

//	private ButtonInterface getAButton() {
//		// TODO Auto-generated method stub
//		return new Button();
//	}

}
