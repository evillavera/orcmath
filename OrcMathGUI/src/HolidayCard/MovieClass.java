package HolidayCard;

//import java.awt.Color;
import java.awt.Graphics2D;
import guiTeacher.components.AnimatedComponent;
//import guiTeacher.components.Component;

public class MovieClass extends AnimatedComponent{//Component 
	
	private String movieTitle;
	private String producer;
	private int duration;
	
	public MovieClass(String movieTitle, String producer, int duration) {
		super(40,40,40,100);
		addSequence("resources/MyStarSprite.png", 150, 0, 0, 40, 100, 12);
		update();
		Thread animation = new Thread(this);
		animation.start();
		this.movieTitle = movieTitle;
		this.producer = producer;
		this.duration = duration;
	}
	
	public void update(Graphics2D g) {
		//g.setColor(Color.WHITE);
		//g.fillRect(0,0,getWidth(),getHeight());
		super.update(g);
	}
	
	public String toString() {
		return movieTitle + "," + producer+","+duration+",";
	}
}
