package k;

import gui.GUIApplication;
 
public class BJGame extends GUIApplication {

	public BJGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BJGame game = new BJGame(800,600);
		Thread bj = new Thread(game);
		bj.start();
	}

	@Override
	public void initScreen() {
		BJScreen game = new BJScreen(getWidth(), getHeight());
		setScreen(game);
	}

}
