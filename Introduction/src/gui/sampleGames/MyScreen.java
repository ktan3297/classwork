package gui.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;

public class MyScreen extends Screen {

	//fields
	private TextLabel text1;
	
	public MyScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text1 = new TextLabel(20, 200, 500, 40, "yay");
		viewObjects.add(text1);
	}
}