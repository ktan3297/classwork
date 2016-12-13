package gui.sampleGames;

import gui.GUIApplication;

import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	//fields
	private CoordinateScreen cs;
	
	public MouseFollower(int width, int height) {
		super(width, height);
	}
 
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		new MouseFollower(800,600);

	}
}
