package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private Button button1;
	private TextLabel text;
	private TextArea text1;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button1 = new Button(30, 300,80,50,"Button", Color.white, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button1);
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		text1 = new TextArea(20, 100, 500, 40, "hi hello bye");
		viewObjects.add(text1);
	}

	@Override
	public void mouseDragged(MouseEvent e) { 
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX(); //get mouse x coordinate
		int my = e.getY(); //get mouse y coordinate
		text.setText("Mouse at " + mx + "," + my);
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}