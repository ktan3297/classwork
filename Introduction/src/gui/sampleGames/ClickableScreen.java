package gui.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Clickable;
import gui.components.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener {

	public ArrayList clickables;
	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		for(int i = 0; i < clickables.size(); i++){
			if(((Clickable) clickables).isHovered(arg0.getX(), arg0.getY())){
				((Clickable) clickables).act();
				break;
			}
		}
	}
	
	public void addObject(Visible v){
		 super.addObject(v);
		 if(v instanceof Clickable){
			 clickables.add(v);
		 }
	}
	
	 public void remove(Visible v){
		 super.removeObject(v);
		 clickables.remove(v);
	} 

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(int i = 0; i < viewObjects.size(); i++){
			if(viewObjects instanceof Clickable){
				clickables.add((Clickable) viewObjects);
			}
		}

	}

	private void initAllObjects(ArrayList<Visible> viewObjects) {
		
	}
}
