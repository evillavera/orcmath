package evPlayground;

import java.util.ArrayList;
import java.util.Scanner;


public class HeroCatalog {

	private static ArrayList<Hero> heroes;
	
	public HeroCatalog() {
		heroes = new ArrayList<Hero>();
		heroes.add(new Hero("Flash","flash-sprite.png",2000));
		heroes.add(new Hero("Batman","flash-sprite.png",2000));
		heroes.add(new Hero("Superman","flash-sprite.png",2000));
	}

	public static void main(String[] args) {
		HeroCatalog catalog = new HeroCatalog();
		FileLoading save = new FileLoading();
		Scanner in = new Scanner(System.in);
		System.out.println("Add a hero?");
		String s = in.nextLine();
		if(s.equals("yes")) {
			System.out.println("Enter hero name");
			String name = in.nextLine();
			System.out.println("Enter image address");
			String image = in.nextLine();
			System.out.println("Enter year");
			int year = Integer.parseInt(in.nextLine());
			addInput(name,image,year);
		}else {
			System.out.println("Okay");
		}
//		for(Hero h: heroes) {
//			System.out.println(h);
//		}
//		instead of using that ^ you can use this 
		
		System.out.println(catalog.getCSVContent());
		System.out.println("Would you like to save your file?");
		s = in.nextLine();
		if(s.equals("yes")) {
			save.main(args);
		}
		
	}

	private static void addInput(String name, String image, int year) {
		heroes.add(new Hero(name,image,year));
		System.out.println("Hero added");
	}

	public static String getCSVContent() {
		String data = "";
		for(Hero h: heroes) {
			data += h + "\n";
		}
		return data;
	}
	
	
	
}
