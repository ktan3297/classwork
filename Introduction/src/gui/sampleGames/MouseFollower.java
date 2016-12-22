package gui.sampleGames;

import gui.GUIApplication;

import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {

	//fields
	public static MouseFollower game; // only ONE exists
	public static CoordinateScreen cs;
	public static MyScreen screen1;
	
	public MouseFollower(int width, int height) {
		super(width, height);
	}
 
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
		screen1 = new MyScreen(getWidth(), getHeight());
	}

	public static void main(String[] args) { //mousefollower is subclass of guiapp and guiapp is runnable
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}
}