package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic unicorn;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(30, 300,80,50,"Button", Color.white, new Action() {
			
			@Override
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.screen1);
				
			}
		});
		viewObjects.add(button);
		
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		area = new TextArea(20, 100, 500, 100, "This is really long text. It prints over multiple lines"
				+ " as you can see, we worked on this in class. It is called Text Area");
		viewObjects.add(area);
//		unicorn = new Graphic(30,30, 0.15, "resources/sampleImages/unicorn.jpg");
//		viewObjects.add(unicorn);
		
	}
	
	
	public MouseListener getMouseListener(){
		return this;
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

	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}