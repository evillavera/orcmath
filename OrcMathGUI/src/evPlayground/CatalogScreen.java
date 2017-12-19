package evPlayground;

import java.awt.Color;
import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField titleField;
	private TextField authorField;
	private TextField pageField;
	private Button createButton;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		titleField = new TextField(40, 40, 200, 30, "title","");
		viewObjects.add(titleField);
		authorField = new TextField(240, 40, 200, 30, "author","");
		viewObjects.add(authorField);
		pageField = new TextField(440, 40, 200, 30, "page number","");
		viewObjects.add(pageField);
		createButton = new Button(40,70,100,100,"Click here",Color.BLUE, null);
		viewObjects.add(createButton);
	}

}
