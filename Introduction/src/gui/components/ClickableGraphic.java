package gui.components;

public class ClickableGraphic extends Graphic implements Clickable {

	public Action act1;
	
	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
	}
	
	public void setAction(Action a){
		this.act1 = a;
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
	}

	@Override
	public boolean isHovered(int x, int y) {    
		return x> getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}

	@Override
	public void act() {
			if(act1 != null) act1.act();
	}
}