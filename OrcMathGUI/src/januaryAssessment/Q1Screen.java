package januaryAssessment;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Q1Screen extends FullFunctionScreen {

	private Button win;
	private Button lose;
	private TextLabel outcome;
	
	public Q1Screen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		win = new Button(100,300,80,80,"Win",Color.blue,new Action() {
			
			@Override
			public void act() {
				outcome = new TextLabel(150, 200, 80, 80, "You Win!");
				viewObjects.add(outcome);
				lose.setEnabled(false);
				win.setEnabled(false);
			}
		});
		viewObjects.add(win);
		lose = new Button(200,300,80,80,"Lose",Color.red,new Action() {
			
			@Override
			public void act() {
				outcome = new TextLabel(150, 200, 80, 80, "You Lost!");
				viewObjects.add(outcome);
				lose.setEnabled(false);
				win.setEnabled(false);
			}
		});
		viewObjects.add(lose);
	}

}
