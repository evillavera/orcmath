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

	private TextLabel label;
	private ButtonInterfaceErik[] buttons;
	private ProgressInterfaceErik info;
	private ArrayList<MoveInterfaceErik> sequence;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
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
		label.setText("");
	    nextRound();
	}

	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
		MoveInterfaceErik move = randomMove();
		sequence.add(move);
		info.setRound(roundNumber);
		info.setSequenceSize(sequence.size());
		changeText("Simon's turn");
		label.setText("");
		playSequence();
		changeText("Your turn");
		acceptingInput = true;
		sequenceIndex = 0;
	}

	private void playSequence() {
		ButtonInterfaceErik b = getAButton();
		for(MoveInterfaceErik m: sequence){ 
		    if(b != null) {
		    		b.dim();
		    }
		    b = m.getButton();
		    b.highlight();
		    int sleepTime = (1/roundNumber)/roundNumber;
		    try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    b.dim();
		}

	}
	
	public void changeText(String str) {
		label.setText(str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceErik b: buttons){ 
		    viewObjects.add(b); 
		}
		info = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceErik>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(info);
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
			final ButtonInterfaceErik b = getAButton();
			b.setColor(buttonColors[i]);
			b.setX(10+i*20);
			b.setY(10+i*20);
			b.setAction(new Action() {
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread (new Runnable() {
							public void run() {
								b.highlight();
								try {
									Thread.sleep(800);
									} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									}
									b.dim();
							}
						});
							blink.start();
						}
					}	
				});
			buttons[i] = b;
			//dont know where this belongs
			if(b == sequence.get(sequenceIndex).getButton()) {
				sequenceIndex++;
			}else {
				ProgressInterfaceErik.gameOver();
			}
			if(sequenceIndex == sequence.size()){ 
			    Thread nextRound = new Thread(SimonScreenErik.this); 
			    nextRound.start(); 
			}
			//up to here
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
