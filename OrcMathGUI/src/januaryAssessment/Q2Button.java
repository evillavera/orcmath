package januaryAssessment;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class Q2Button extends Button {

	private String field;
	
	public Q2Button(int x, int y) {
		super(x, y, 100, 100, "", null, null);
		field = "";
	}

	public void updateString(String s) {
		field = s;
		update();
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.black);
		Rectangle rect = new Rectangle(0,0,250,200);
		g.draw(rect);
		g.fill(rect);
		g.setColor(Color.white);
		if(field != null) {
			g.drawString(field, 20, 100);
		}
	}
}
