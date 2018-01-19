package januaryAssessment;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Q2PScreen extends FullFunctionScreen {

	private int startTime;
	private int countDown;
	private int score;
	private TextLabel scoreBoard;
	private TextLabel clock;
	
	public Q2PScreen(int width, int height) {
		super(width, height);
		startTime = 3;
		countDown = 5;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		scoreBoard = new TextLabel(100,400,200,100,"Score");
		clock = new TextLabel(100,50,100,100,"Timer");
		
		Q2PButton button = new Q2PButton(150,150);
		
		button.updateString("Ready");
		
		viewObjects.add(scoreBoard);
		viewObjects.add(clock);
		viewObjects.add(button);
		
		button.setAction(new Action() {
			public void act() {
				Timer s = new Timer();
				s.scheduleAtFixedRate(new TimerTask() {
					@Override
					public void run() {
						clock.setText(Integer.toString(startTime));
						if(startTime <= 0) {
							Timer t = new Timer();
							t.scheduleAtFixedRate(new TimerTask() {
								@Override
								public void run() {
									clock.setText("Time Left: " + Integer.toString(countDown));
									button.updateString("Click Me!");
									button.setAction(new Action() {
										public void act() {
											score++;
											scoreBoard.setText(Integer.toString(score));	
										}
									});
									if(countDown <= 0) {
										gameOver();
										t.cancel();
									}
									countDown--;
								}

								private void gameOver() {
									button.setEnabled(false);
									button.updateString("Done");
									scoreBoard.setText("Your score is: " + Integer.toString(score));
								}
							}, 0, 1000);
							s.cancel();
						}
						startTime--;	
					}
				}, 1000, 1000);
			}
		});
		}

}
