package HolidayCard;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import guiTeacher.GUIApplication;
import guiTeacher.components.StyledComponent;

public class KatherinsGUI extends GUIApplication {

	public static KatherinsGUI sample;
	public static KatsCatalogScreen s;
	public static KatsCatalogScreenInside inside;
	
	public KatherinsGUI(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		try {
			File fontFile = new File("resources/Risque-Regular.ttf");
			//			File fontFile = new File("resources//DayRoman.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			Font baseFont=font.deriveFont(30f);
			StyledComponent.setBaseFont(baseFont);
			StyledComponent.setAccentColor(Color.white);
		} catch (Exception e) {
			e.printStackTrace();
		}
		s = new KatsCatalogScreen(getWidth(),getHeight());
		inside = new KatsCatalogScreenInside(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample = new KatherinsGUI(800,450);
		Thread go = new Thread(sample);
		go.start();
	}

}
