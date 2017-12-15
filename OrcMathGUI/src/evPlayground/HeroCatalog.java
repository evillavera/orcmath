package evPlayground;

import java.util.ArrayList;

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
		
//		for(Hero h: heroes) {
//			System.out.println(h);
//		}
//		instead of using that ^ you can use this 
		
		System.out.println(catalog.getCSVContent());
	}

	public static String getCSVContent() {
		String data = "";
		for(Hero h: heroes) {
			data += h + "\n";
		}
		return data;
	}
	
}
