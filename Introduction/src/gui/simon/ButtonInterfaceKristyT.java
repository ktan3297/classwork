package gui.simon;

import java.awt.Color;

import gui.components.Action;
import gui.components.Clickable;

public interface ButtonInterfaceKristyT extends Clickable {

	public void setColor(Color color);

	public void setAction(Action action);

	public void highlight();

	public void setX(int i);

	public void setY(int i);

	public void dim();

}
