package testCode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import gui.components.Action;
import gui.components.Component;
import gui.simon.ButtonInterfaceKristyT;

public class Button extends Component implements ButtonInterfaceKristyT {

	private Color col;
	private Action acts;
	private final static int WIDTH = 65;
	private final static int HEIGHT = 65;
	private boolean highlighted;
	 
	private static int count;
	
	public Button() {
		super(70 * count + 50, 300, WIDTH, HEIGHT);
		count++;
	}

	@Override
	public void act() {
		acts.act();
	}

	@Override
	public boolean isHovered(int arg0, int arg1) {
		return  arg0 > getX() && arg0 < getX() + getWidth() && arg1 > getY() && arg1 < getY() + getHeight();
	}

	@Override
	public void setColor(Color color) {
		this.col = color;
		update();
	}

	@Override
	public void setX(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setY(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAction(Action action) {
		this.acts = action;

	}

	@Override
	public void highlight() {
		highlighted = true;
		update();
	}

	@Override
	public void dim() {
		highlighted = false;
		update();

	}

	@Override
	public void update(Graphics2D arg0) {
		arg0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(col != null){  
			arg0.setColor(col);
		}
		else{
			arg0.setColor(Color.gray);
		}
		arg0.fillOval(0, 0, WIDTH, HEIGHT);
		arg0.drawOval(0, 0, WIDTH - 1 , HEIGHT - 1);
	}

}
