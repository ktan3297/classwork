package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{
	
	private Screen currentScreen;
	
	//demo purposes only
//	public static void main(String[] args) {
//		new GUIApplication(800,600); 
//	}
	
	public GUIApplication(int width, int height) {
		super();
		setBounds(20,20,width,height); //first 2 parameters are the starting coordinates 
		//terminates the program when window is closed 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		initScreen();
		setVisible(true); 
	}

	public abstract void initScreen(); //not defining this method. for each diff game you have to define it
	
	public void setScreen(Screen s){
		currentScreen = s;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}

// abstraction: generalized
//								can't instantiate an abstract class 
//	examples: 
//		1. interface: description of methods (implement as many interfaces as you want)
//		2. abstract class: description of methods and has methods=only useful to subclasses that inherit this class ~ kinda like a mix of an interface and a class
//		int[] num;	-> declaration
//		num = new int[5]; -> instantiate (initialized) 