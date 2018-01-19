package januaryAssessment;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class Q2PButton extends Button {

	private String field;
	
	public Q2PButton(int x, int y) {
		super(x, y, 100, 100, "", null);
		field = "";
	}

	public void updateString(String s) {
		field = s;
		update();
	}

	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.yellow);
		Rectangle rect = new Rectangle(0,0,200,250);
		g.draw(rect);
		g.fill(rect);
		g.setColor(Color.black);
		if(field != null) {
			g.drawString(field,20,100);
		}
	}
	
}
