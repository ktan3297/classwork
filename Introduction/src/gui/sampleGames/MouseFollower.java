package gui.sampleGames;

import gui.GUIApplication;

import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	//fields
	public static MouseFollower game; // only ONE exists
	private CoordinateScreen cs;
	
	public MouseFollower(int width, int height) {
		super(width, height);
	}
 
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) { //mousefollower is subclass of guiapp and guiapp is runnable
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}
}
