package gui.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.TextLabel;
import gui.components.Visible;

public class ImageClicker extends ClickableGraphic implements MouseMotionListener, MouseListener {

	public ClickableGraphic i1;
	
	public ImageClicker(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ImageClicker(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ImageClicker(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}
	
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		viewObjects.add(i1);
	}
	
	public MouseListener getMouseListener(){
		return this;
		
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(i1.isHovered(e.getX(), e.getY())){
			i1.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}