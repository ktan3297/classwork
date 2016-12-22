package gui.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	//fields
	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;
	
	// full size graphics constructor
	public Graphic(int x, int y, String imageLocation) {
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation, 0, 0);
	}

	//custom size graphics constructor 
	public Graphic(int x, int y, int w, int h, String imageLocation) {
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation, w, h);
	}
	
	//scaled size graphics constructor 
	public Graphic(int x, int y, double scale, String imageLocation) {
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation, scale);
	}

	private void loadImages(String imageLocation, double scale) {
		try{
			//get the full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int) (icon.getIconWidth() * scale);
			int newHeight = (int) (icon.getIconHeight() * scale);
			image = new BufferedImage(newWidth,newHeight, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth, newHeight, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void loadImages(String imageLocation, int w, int h) {
		try{
			//this is the full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w <= 0 && h <= 0){
				//use fullsize icon
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				//use graphics2D tool to copy the icon
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else{
				//use custom size icon
				image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				//image to draw xCoord of destination, yCoord of destination, width of Destination,
				//height of destination, xCoord of target, yCoord of target, width of target,height of target
				//null
				g.drawImage(icon.getImage(), 0, 0, w, h, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
			}
			setLoadedImages(true);
		}catch(Exception e){
			//this happens when you don't make the image correctly
			e.printStackTrace();
		}
	}

	@Override
	public BufferedImage getImage() {
		return image;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		return false;
	}

	@Override
	public void update() {
		//does nothing. image stays the same
	}

	public boolean isLoadedImages() {
		return loadedImages;
	}

	public void setLoadedImages(boolean loadedImages) {
		this.loadedImages = loadedImages;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
