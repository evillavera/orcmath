package HolidayCard;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogueMaker {//implement a save method and addObjects method
	
	private static ArrayList<MovieClass> arrlist;
	private String movieTitle;
	private String producer;
	private int duration;
	//private static String[] moviesArr = {"Goodfellas","Mamas House","Reservoir Dogs"};
	//private static String[] producerArr = {"Martin Scorcese","Tyler Perry","Quentin Tarartino"};
	//private static int[] durationArr = {1,2,3};
	
	public CatalogueMaker() {
		arrlist = new ArrayList<MovieClass>();
		//arrlist.add(new MovieClass("Goodfellas","Martin Scorcese",3));
		//arrlist.add(new MovieClass("Mamas House","Tyler Perry",2));
		//arrlist.add(new MovieClass("Reservoir Dogs","Quentin Taratino",1))
		
		/*
		 * String[] data = line.split(",");
		 * arrlist.add(new MovieClass(data[0],Integer.parseInt(data[1])));
		 * */
	}

	public static void main(String[] args) {
		CatalogueMaker c = new CatalogueMaker();
		Scanner in = new Scanner(System.in);
		boolean running = true;
		while(running) {
			System.out.println("Would you like to input movie information? Type 'yes' or 'no' ");
			String inputInfo = in.nextLine();
			// ask user input to type number of movie info they'd like to input into the csv
			if(inputInfo.equals("yes")) {
				//System.out.println("How many items of information would you like to type?");
				//int numItems = Integer.parseInt(in.nextLine);
				System.out.println("What movie would you like to input?");
				String m = in.nextLine();
				System.out.println("Who's the producer of this movie?");
				String p = in.nextLine();
				System.out.println("How long is the movie?");
				String d = in.nextLine();
				int dinteger = Integer.parseInt(d);
				arrlist.add(new MovieClass(m,p,dinteger));
				
				/*movieTitle = new TextField(200,200,200,200,"","Goodfellas")
				 * viewObjects.add(movieTitle);
				 * 
				 * */
			}
			else {
				running = false;
			}
		}
		/*
		for(int i = 0; i < 10; i++) {
			int rand = (int) (Math.random()*3);
			arrlist.add(new MovieClass(moviesArr[rand],producerArr[rand],durationArr[rand]));
		}*/
		
		//System.out.println(m);
		//System.out.println(p);
		//System.out.println(d);
		System.out.println(c.getCSVContent());
	}
	
	
	public static String getCSVContent() {
		String data = "";
		for(MovieClass m : arrlist) {
			data += "\n" + m;
		}
		return data;
	}

}
