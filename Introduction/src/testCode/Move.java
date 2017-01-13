package testCode;

import gui.simon.ButtonInterfaceKristyT;
import gui.simon.MoveInterfaceKristyT;

public class Move implements MoveInterfaceKristyT {

	private ButtonInterfaceKristyT moveButton;
	
	public Move(ButtonInterfaceKristyT b) {
		this.moveButton = b;
	}

	@Override 
	public ButtonInterfaceKristyT getButton() {
		return moveButton;
	}

}
