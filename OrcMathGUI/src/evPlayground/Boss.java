package evPlayground;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Boss extends Component {

	public Boss() {
		super(40, 40, 100, 100);
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(0, 0, getWidth(), getHeight());
	}

}
