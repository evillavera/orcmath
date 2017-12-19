package evPlayground;

import guiTeacher.GUIApplication;

class CatalogMakerGUI extends GUIApplication {

	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CatalogScreen s = new CatalogScreen(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		CatalogMakerGUI maker = new CatalogMakerGUI(800,550);
		Thread go = new Thread(maker);
		go.start();

	}

}
