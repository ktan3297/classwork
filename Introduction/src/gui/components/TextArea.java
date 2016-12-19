package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	
	}
	@Override
	public void update(Graphics2D g) {
		g = clear(); //deletes previous text 
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
		FontMetrics fm = g.getFontMetrics();
		if(getText() != null){
			String[] words = getText().split(" ");
			while(fm.getHeight()> getHeight() )
			{
				for (int i=0;i<words.length;i++)
				{
					
//					if (fm.getAscent() + fm.getDescent() < fm.getHeight())
//					{
//						
//					}
//					fm.getAscent();
//					fm.getDescent();
//					fm.getHeight();
				fm.stringWidth(words[i]);
				g.drawString(getText(), i, fm.getHeight());
				}
			}
		}

}
}
