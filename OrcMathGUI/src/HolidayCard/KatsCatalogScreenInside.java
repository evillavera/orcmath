package HolidayCard;

import java.awt.Color;
import java.util.List;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

import guiTeacher.components.*;

public class KatsCatalogScreenInside extends FullFunctionScreen {

	private Graphic tree;
	private Button switchS;
	private TextArea name;
	
	public KatsCatalogScreenInside(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initAllObjects(List<Visible> viewObjects) {
		tree = new Graphic(getWidth()/2-50, getHeight()/2-50, "resources/treeAlex.jpg");
		viewObjects.add(tree);
		switchS = new Button(40, 350, 90, 40, "Front",Color.CYAN,new Action() {
			@Override
			public void act() {
				// TODO Auto-generated method stub
				KatherinsGUI.sample.setScreen(KatherinsGUI.s); 
			}
		});
		viewObjects.add(switchS);
		for(int i = 0; i < 8; i++){
			viewObjects.add(new OrnamentBlue(getWidth(), getHeight()));
		}
		for(int i = 0; i < 8; i++){
			viewObjects.add(new OrnamentRed(getWidth(), getHeight()));
		}
		for(int i = 0; i < 8; i++){
			viewObjects.add(new OrnamentGreen(getWidth(), getHeight()));
		}
		name = new TextArea(getWidth()-275, getHeight()-100, 500, 50, "From: Alex and Erik");
		viewObjects.add(name);
	}

}
