package myStuff;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonErik extends Button implements ButtonInterfaceErik {

	private static Color color;
	public Color startingColor;
	public Color placeHolder;
	
	public ButtonErik(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		update();
	}

	public ButtonErik(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
		update();
	}

	public void setColor(Color color) {
		this.color = color;
		this.placeHolder = color;
	}

	public void highlight() {
		this.startingColor = Color.YELLOW;
	}
	
	public void dim() {
		this.startingColor = placeHolder;

	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		if(hover) {
			highlight();
			g.drawRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		}else {
			dim();
			g.drawRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
		}
	}
}
