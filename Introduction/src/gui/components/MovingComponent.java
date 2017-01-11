package gui.components;

import java.awt.Color;
import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {

	private long moveTime; //time when the image last moved
	private double vx; //the horizontal velocity
	private double vy; //the vertical velocity
	private double posx; //the actual x-coordinate of the object
	private double posy; //the actual y-coordinate of the object
	private boolean running; //whether the object is actually moving

	public static final int REFRESH_RATE = 20;
	
	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		vx = 0;
		vy = 0;
	}

	public boolean isAnimated(){
		return true;
	}
	
	public boolean isRunning(){
		return running;
	}
	
	public void setRunning(boolean b){
		running = b;
	}
	
	public void setX(int x){
		super.setX(x);
		posx = x; //now the actual position is synced with the pixel (screen) position
	}
	
	public void setY(int y){
		super.setY(y);
		posy = y; //now the actual position is synced with the pixel (screen) position
	}
	
	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	@Override
	public void run() {
		posx = getX();
		posy = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running){
			try {
				Thread.sleep(REFRESH_RATE);
				checkBehaviors();
				update();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void checkBehaviors() {
		if(getY() > 300){
			setY(300);
			setVy(-vy);
		}
		
	}

	@Override
	public void update(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		int difference = (int) (currentTime - moveTime);
		if(difference >= REFRESH_RATE){
			//update moveTime since a move is happening
			moveTime = currentTime;
			//calculate the new position
			posx += vx * (double) difference/REFRESH_RATE;
			posy += vy * (double) difference/REFRESH_RATE;
			//note: for very low velocities the position might not change by very much so by rounding down to an int 
			//might make it look like nothing changed but posx and posy will keep track of fractions of a change
			super.setX((int) posx); //change only x not posx
			super.setY((int) posy); //change only y not posy 
		}
		drawImage(g);
	}

	private void drawImage(Graphics2D g) {
		g.setColor(Color.white);
		g.fillOval(0, 0, getWidth(), getHeight());
	}
	
	public void play(){
		if(!running){
			Thread go = new Thread(this);
			go.start();
		}
	}
}
