package evPlayground;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Hero extends Component {

	private String name;
	private String image;
	private int year;
	
	public Hero(String name, String image , int year) {
		super(60, 60, 38, 48);
		this.name = name;
		this.image = image;
		this.year = year;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		
	}

	public String toString() {
		return name + "," + year + "," + image;
	}
	
}
