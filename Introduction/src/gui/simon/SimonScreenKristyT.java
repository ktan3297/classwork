package gui.simon;

import java.awt.Color;
import java.util.ArrayList;
import gui.components.Action;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;
import testCode.Move;

public class SimonScreenKristyT extends ClickableScreen implements Runnable {

	private ArrayList<MoveInterfaceKristyT> moveSequence1;
	private TextLabel label1;
	private ButtonInterfaceKristyT[] button1;
	private ProgressInterfaceKristyT progress1;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenKristyT(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		label1.setText("");
	    nextRound();
	}

	public void nextRound() {
		acceptingInput = false;
		roundNumber++;
		progress1.setRoundNumber(roundNumber);
		moveSequence1.add(randomMove());
		progress1.setSequence(moveSequence1.size());
		changeText("Simon's Turn.");
		label1.setText("");
		playSequence();
		changeText("Your Turn.");
		acceptingInput = true;
		sequenceIndex = 0;
	}

	public void playSequence() {
		ButtonInterfaceKristyT b = null;
		for(MoveInterfaceKristyT i:  moveSequence1){
			if(b != null){
				b.dim();
			}
				b = i.getButton();
				b.highlight();
				int sleepTime = 0;
				if(roundNumber >= 3){
					sleepTime = (int) (1500* (Math.random() * roundNumber + 1));
				}
				else{
					sleepTime = (int) (3000 * (Math.random() * roundNumber + 1));
				}
				try{
					Thread.sleep(sleepTime);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		
		b.dim();
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons(viewObjects);
		progress1 = getProgress();
		label1 = new TextLabel(130, 230, 300, 40,"Let's play Simon!");
		moveSequence1 = new ArrayList<MoveInterfaceKristyT>();
		lastSelectedButton = -1;
		moveSequence1.add(randomMove());
		moveSequence1.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress1);
		viewObjects.add(label1);
	}

	public MoveInterfaceKristyT randomMove() {
		ButtonInterfaceKristyT b = null;
		int randomNumSelect = (int) (Math.random() * button1.length);
		//code that randomly selects a ButtonInterfaceX
		while(randomNumSelect == lastSelectedButton){
			randomNumSelect = (int) (Math.random() * button1.length);
		}
		lastSelectedButton = randomNumSelect;
		return new Move(button1[randomNumSelect]);
	}

	public ProgressInterfaceKristyT getProgress() {
		return new testCode.Progress();
	}

	public void addButtons(ArrayList<Visible> viewObjects) {
		int numOfButtons = 6;
		Color[] colors1 = {Color.blue, Color.green, Color.yellow, Color.red, Color.orange, new Color(255,0,255)};
		button1 = new ButtonInterfaceKristyT[numOfButtons];
		for(int i = 0; i < numOfButtons; i++){
			
			button1[i] = getAButton();
			button1[i].setColor(colors1[i]);
		    button1[i].setX(150);
		    button1[i].setY(250);
		    
		    ButtonInterfaceKristyT b = button1[i];
		    b.dim();
		    button1[i].setAction(new Action(){
		    	public void act(){
		    		if(acceptingInput){
		    			Thread blink = new Thread(new Runnable(){
		    				public void run(){
		    					b.highlight();
		    					try{
		    						Thread.sleep(500);
		    					}
		    					catch(InterruptedException e) {
		    						e.printStackTrace();
		    					}
		    					b.dim();
		    				}
		    			});
		    		
		    			blink.start();
		    			
		    			if(acceptingInput && b == moveSequence1.get(sequenceIndex).getButton()){
		    				sequenceIndex++;
		    			}
		    			else if(acceptingInput){
		    				gameOver();
		    				return;
		    			}
		    			if(sequenceIndex == moveSequence1.size()){
		    				Thread nextRound = new Thread(SimonScreenKristyT.this);
							nextRound.start(); 
		    			}
		    		}
		    	}
		    });
		    viewObjects.add(button1[i]);
		}
	}
	
	public void gameOver() {
		ProgressInterfaceKristyT.gameOver();
	}

	public void changeText(String string){
		try {
			label1.setText(string);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//change later
	public ButtonInterfaceKristyT getAButton() {
		return new testCode.Button();
	}
}