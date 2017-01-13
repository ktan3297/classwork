package gui.simon;

import testCode.Progress;
import gui.components.Visible;

public interface ProgressInterfaceKristyT extends Visible {

	//why is this static; not suppose to be?
	public void gameOver();
	
	public void setSequence(int x);
		
	public void setRoundNumber(int roundNumber);


}
