package myStuff;

import guiPlayer.CustomGUI;
import guiPlayer.CustomScreen;
import guiTeacher.GUIApplication;

public class SimonGameErik extends GUIApplication{

	public SimonGameErik(int width, int height) {
		super(width,height);
		setVisible(true);
	}

	public static void main(String[] args) {
		SimonGameErik s = new SimonGameErik(800, 550);
		Thread runner = new Thread(s);
		runner.start();
	}

	@Override
	public void initScreen() {
		SimonScreenErik screen = new SimonScreenErik(getWidth(), getHeight());
		setScreen(screen);
	}

}
