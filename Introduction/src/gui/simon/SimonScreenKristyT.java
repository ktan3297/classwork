package gui.simon;

import java.util.ArrayList;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.ClickableScreen;

public class SimonScreenKristyT extends ClickableScreen implements Runnable {

	private ArrayList<MoveInterfaceKristyT> moveSequence1;
	private TextLabel label1;
	private ButtonInterfaceKristyT button1;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
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

	private MoveInterfaceKristyT randomMove() {
		//code that randomly selects a ButtonInterfaceX
		return getMove(b);

	}

	private ProgressInterfaceKristyT getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numOfButtons = 6;
	}
}