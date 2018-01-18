package januaryAssessment;

import guiTeacher.GUIApplication;

public class Q1GUI extends GUIApplication {

	public Q1GUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		Q1Screen s = new Q1Screen(getWidth(),getHeight());
		setScreen(s);

	}

	public static void main(String[] args) {
		Q1GUI s = new Q1GUI(800,550);
		Thread runner = new Thread(s);
		runner.start();
	}

}
