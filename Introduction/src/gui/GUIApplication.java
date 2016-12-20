package gui;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{
	
	private Screen currentScreen;
	
	//demo purposes only
//	public static void main(String[] args) {
//		new GUIApplication(800,600); 
//	}
	 
	public GUIApplication(int width, int height) {
		super();
//		setUndecorated(true); //gets rid of the bars
		setBounds(20,20,width,height); //first 2 parameters are the starting coordinates 
		//terminates the program when window is closed 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		initScreen();
		setVisible(true); 
	}

	public abstract void initScreen(); //not defining this method. for each diff game you have to define it
	
	public void setScreen(Screen s){
		//stop listening to previous screen
		if(currentScreen != null){
			MouseListener ml = currentScreen.getMouseListener();
			if(ml != null){
				removeMouseListener(ml);
			}   
			MouseMotionListener mml = currentScreen.getMouseMotionListener();
			if(mml != null){
				removeMouseMotionListener(mml);
			}
		}
		currentScreen = s;
		if(currentScreen != null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void run(){
		while(true){
			//redraws the display; updates the picture
			currentScreen.update();
			//update the window; window shows pictures of a display
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// abstraction: generalized (parts that will be different and not always the same)
//								CAN'T INSTANTIATE AN ABSTRACT CLASS 
//	examples: 
//		1. interface: description of methods (implement as many interfaces as you want)
//		2. abstract class: description of methods and has methods=only useful to subclasses that inherit this class ~ kinda like a mix of an interface and a class
//		int[] num;	-> declaration
//		num = new int[5]; -> instantiate (initialized) 