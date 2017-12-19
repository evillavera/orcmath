package evPlayground;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Boss extends AnimatedComponent {

	public Boss() {
		super(60, 60, 38, 48);
		//add animated image 
		//first parameter is the file
		//second is number of ms between transition
		//x-coor and then y-coor of the first sprite (top left)
		//width + height of sprite
		//number of sprites
		addSequence("resources/flash-sprite.png", 150, 12, 13, 59, 50, 4);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	@Override
	public void update(Graphics2D g) {
		//draws picture of the animated thing
		super.update(g);
	}

}
