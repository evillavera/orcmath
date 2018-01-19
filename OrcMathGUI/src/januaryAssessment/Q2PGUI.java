package januaryAssessment;

import guiTeacher.GUIApplication;

public class Q2PGUI extends GUIApplication {

	public Q2PGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		Q2PScreen s = new Q2PScreen(getWidth(),getHeight());
		setScreen(s);

	}

	public static void main(String[] args) {
		Q2PGUI s = new Q2PGUI(800,550);
		Thread runner = new Thread(s);
		runner.start();
	}

}
