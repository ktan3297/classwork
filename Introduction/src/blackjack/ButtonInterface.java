package blackjack;

import java.awt.Color;

import gui.components.Action;
import gui.components.Clickable;

public interface ButtonInterface extends Clickable {

	void setAction(Action action);

	void setY(int i);

	void setX(int i);

	void setColor(Color red);

} 
