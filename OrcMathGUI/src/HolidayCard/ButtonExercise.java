package HolidayCard;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonExercise extends Button {

	private String s1;
	private String s2;
	private Color color;
	
	public ButtonExercise(int x, int y) {
		super(x,y,200,200,"",null);
		// TODO Auto-generated constructor stub
	}
	
	void updateString1(String string) {
		this.s1 = string;
	}

	void updateString2(String string) {
		this.s2 = string;
	}

	void setIconColor(Color color) {
		this.color = color;
	}
	
	public void drawButton(Graphics2D g, boolean hover){
//		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//				RenderingHints.VALUE_ANTIALIAS_ON);
//		drawShape(g, hover);
//		g.setColor(getForeground());
//		g.setFont(getFont());
//		FontMetrics fm = g.getFontMetrics();
//		
//		if(getText()!= null){
//			g.setColor(getForeground());
//			String t = getText();
//			//just in case text is too wide, cut off
//			int cutoff = t.length();
//			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
//				cutoff --;
//				t = t.substring(0,cutoff); 
//			}
//			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, 
//					(getHeight()+fm.getHeight()-fm.getDescent())/2);
//		}
		g.setColor(Color.BLACK);
		g.drawString("string1", 10, 10);
		g.drawString("string2", 20, 20);
		g.drawRect(0, 0, 100, 100);
	}
	
}
