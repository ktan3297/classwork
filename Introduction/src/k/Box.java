package k;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Box extends Component {
	
	private Color color;
	private boolean isFilled;

	public Box(int x, int y, int w, int h, Color color, boolean isFilled) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.isFilled = isFilled;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		if(isFilled){
			g.setColor(Color.black);
			g.drawRect(0,0,getHeight(), getWidth());
			g.setColor(this.color);
			g.fillRect(0, 0, getWidth(), getHeight());
		}
		else {
			g.setColor(Color.black);
			g.drawRect(0, 0, getWidth(), getHeight());
		}

	}

}
