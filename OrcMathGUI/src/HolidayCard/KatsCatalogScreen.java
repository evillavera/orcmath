package HolidayCard;

import java.awt.Color;
import java.awt.Font;
import java.awt.Transparency;
import java.io.File;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.*;
import guiTeacher.components.Graphic;
import guiTeacher.components.StyledComponent;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class KatsCatalogScreen extends FullFunctionScreen {

	private Button b;
	private Graphic stan;
	private Graphic tree;
	private TextArea greetings;
	
	public KatsCatalogScreen(int width, int height) {
		super(width, height);
	}
	
	public void initAllObjects(List<Visible> viewObjects) {
		tree = new Graphic(0,0,getWidth(),getHeight(),"resources/christmasTree.jpg");
		viewObjects.add(tree);
		greetings = new TextArea(40, 70, 200, 150, "Happy Holidays!");
		viewObjects.add(greetings); 
		b = new Button(40, 350, 90, 40, "Inside",Color.CYAN,new Action() {
			@Override
			public void act() {
				// TODO Auto-generated method stub
				KatherinsGUI.sample.setScreen(KatherinsGUI.inside); 
			}
		});
		viewObjects.add(b);
		for(int i = 0; i < 28; i++){
			viewObjects.add(new Hats(getWidth(), getHeight()));
		}
	}

}