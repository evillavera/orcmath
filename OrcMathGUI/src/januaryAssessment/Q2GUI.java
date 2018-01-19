package januaryAssessment;

import guiTeacher.GUIApplication;

public class Q2GUI extends GUIApplication {

	public Q2GUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		Q2Screen s = new Q2Screen(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		Q2GUI s = new Q2GUI(800,550);
		Thread runner = new Thread(s);
		runner.start();
	}

}
