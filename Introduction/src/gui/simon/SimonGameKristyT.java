package gui.simon;

import javax.swing.JFrame;

import gui.GUIApplication;

public class SimonGameKristyT extends GUIApplication {

	public SimonGameKristyT(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		SimonScreenKristyT sgkt = new SimonScreenKristyT(getWidth(), getHeight());
		setScreen(sgkt);
	}

	public static void main(String[] args) {
		SimonGameKristyT sgkt = new SimonGameKristyT(800,500);
		Thread game = new Thread(sgkt);
		game.start();
	}
}