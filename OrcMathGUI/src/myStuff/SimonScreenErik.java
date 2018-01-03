/**
 * 
 */
package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenErik extends ClickableScreen implements Runnable {

	private TextLabel round;
	private ButtonInterfaceErik[] buttons;
	private ProgressInterfaceErik info;
	private ArrayList<MoveInterfaceErik> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceindex;
	private int lastSelectedButton;
	
	
	public SimonScreenErik(int width, int height) {
		super(width,height);
		Thread app = new Thread(this);
		app.start();
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceErik b: buttons){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceErik>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}
	private MoveInterfaceErik randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
	    while(bIndex == lastSelectedButton){
	        bIndex = (int)(Math.random()*buttons.length);
	    }
	    return getMove(bIndex);
	}

	/**
	 * Placeholder until partner finishes implementation of ProgressInterface
	 * @return
	 */
	
	private MoveInterfaceErik getMove(int bIndex) {
		return null;
	}

	/**
	 * Placeholder until partner finishes implementation of ProgressInterface
	 * @return
	 */
	private ProgressInterfaceErik getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 5;
		buttons = new ButtonInterfaceErik[numberOfButtons];
		Color[] buttonColors = {Color.blue,Color.red,Color.yellow,Color.GREEN,Color.orange};
		for(int i = 0; i < numberOfButtons;i++) {
			ButtonInterfaceErik b = getAButton();
			b.setColor(buttonColors[i]);
			b.setX(10+i*20);
			b.setY(10+i*20);
			buttons[i] = b;
		}
	}

	/**
	 * Placeholder until partner finishes implementation of ProgressInterface
	 * @return
	 */
	private ButtonInterfaceErik getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
