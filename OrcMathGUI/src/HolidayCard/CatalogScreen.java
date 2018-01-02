package HolidayCard;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

//import guiTeacher.components.TextField;
import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester{
	private TextField title;
	private TextField producer;
	private TextField duration;
	
	private TextArea text;
	private Button add;
	private Button save;
	private Button delete;
	private FileOpenButton open;
	//private MovieClass catalog;
	private CatalogueMaker cm;
	
	private static final long serialVersionUID = 258186143576427947L;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		//descriptionField = new TextField(40,40,200,30,"Text goes here","movieTITLE");
		//viewObjects.add(descriptionField);
		title = new TextField(40,100,200,30,"Title goes here");
		viewObjects.add(title);
		producer = new TextField(40,160,200,30,"Producer goes here");
		viewObjects.add(producer);
		duration = new TextField(40,40,200,30,"Length goes here");
		viewObjects.add(duration);
		//catalog = new MovieClass(title,producer,duration);
		cm = new CatalogueMaker();
		
		add = new Button(240,160,200,30,"add",Color.PINK,new Action() {
			public void act() {
				addButton();
			}
		} );
		save = new Button(240,100,200,30,"save",Color.PINK,new Action() {
			public void act() {
				saveButton();
			}
		} );
		delete = new Button(240,130,200,30,"delete",Color.PINK,new Action() {
			public void act() {
				deleteButton();
			}
		} );
		open = new FileOpenButton(200,40,200,30,null,this);
		viewObjects.add(add);
		viewObjects.add(save);
		viewObjects.add(delete);
		viewObjects.add(open);
		
		duration.setInputType(TextField.INPUT_TYPE_NUMERIC);
		/*
		 * title.setText("")
		 * producer.setText("")
		 * duration.setText("")
		 * */
	}
	
	public void addButton() {
		MovieClass m = new MovieClass(title.getText(),producer.getText(),Integer.parseInt(duration.getText()));
		text.setText("The movie is ");
		//cm.arrlist.add(m);
	}
	
	public void saveButton() {
		text.setText("Save");
	}
	
	public void deleteButton() {
		text.setText("Delete");
	}
	
	public void fileOpenButton() {
		text.setText("Open file");
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
