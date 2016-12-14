package gui.screens;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen {

	private Button button1;
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some text");
		button1 = new Button(30, 300,600,50,"Button", Color.white, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(text);
		viewObjects.add(button1);
	}
}
 