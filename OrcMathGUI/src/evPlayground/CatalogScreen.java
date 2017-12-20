package evPlayground;

import java.awt.Color;
import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {

	private TextField heroField;
	private TextField imageField;
	private TextField yearField;
	private Button createButton;
	private Button add;
	private Button save;
	private Button delete;
	private FileOpenButton fileOpen;
	private TextArea text;
	private Hero hero;
	private HeroCatalog catalog;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		//TEXTFIELDS
		heroField = new TextField(40, 40, 200, 30, "hero","");
		viewObjects.add(heroField);
		imageField = new TextField(240, 40, 200, 30, "image","");
		viewObjects.add(imageField);
		yearField = new TextField(440, 40, 200, 30, "year","");
		yearField.setInputType(TextField.INPUT_TYPE_NUMERIC);
		viewObjects.add(yearField);
		
		//TEXTAREA
		text = new TextArea(240, 100, 200,200,"Heroes go here");
		viewObjects.add(text);
		
		
		createButton = new Button(40,70,60,50,"Change",Color.BLUE, new Action() {
			public void act() {
				addClicked();
			}
		});
		viewObjects.add(createButton);
		add = new Button(40,120, 60,50,"Add", Color.CYAN,null);
		viewObjects.add(add);
		save = new Button(40,170, 60,50,"Save",Color.GREEN, null);
		viewObjects.add(save);
		delete = new Button(40,220,60,50,"Delete",Color.RED, null);
		viewObjects.add(delete);
		fileOpen = new FileOpenButton(40,270,60,50,null,this);
		viewObjects.add(fileOpen);
		
		Hero hero = new Hero("name", "name", 2000);
		
		
	}

	protected void addClicked() {
		Hero h = new Hero(heroField.getText(), imageField.getText(), Integer.parseInt(yearField.getText()));
		catalog.addHero(h);
		text.setText(hero + "\n" + h);
		heroField.setText("");
		imageField.setText("");
		yearField.setText("");
	}

	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
