package evPlayground;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import guiPlayer.Book;
import guiPlayer.CatalogMaker;


public class HeroCatalog {

	private static ArrayList<Hero> heroes;
	public static Scanner in;
	
	public HeroCatalog() {
		heroes = new ArrayList<Hero>();
		heroes.add(new Hero("Flash","1",2000));
		heroes.add(new Hero("Batman","1",2000));
		heroes.add(new Hero("Superman","1",2000));
	}

	public static void main(String[] args) {
//		HeroCatalog catalog = new HeroCatalog();
//		FileLoading save = new FileLoading();
//		Scanner in = new Scanner(System.in);
//		System.out.println("Add a hero?");
//		String s = in.nextLine();
//		if(s.equals("yes")) {
//			System.out.println("Enter hero name");
//			String name = in.nextLine();
//			System.out.println("Enter image address");
//			String image = in.nextLine();
//			System.out.println("Enter year");
//			int year = Integer.parseInt(in.nextLine());
//			addInput(name,image,year);
//		}else {
//			System.out.println("Okay");
//		}
////		for(Hero h: heroes) {
////			System.out.println(h);
////		}
////		instead of using that ^ you can use this 
//		
//		System.out.println(catalog.getCSVContent());
//		System.out.println("Would you like to save your file?");
//		s = in.nextLine();
//		if(s.equals("yes")) {
//			save.main(args);
//		}
		HeroCatalog maker = new HeroCatalog();
		in = new Scanner(System.in);
		maker.menu();
	}

	private void menu() {
		displayMessage("Would you like to \"load\" a save file or \"create\" a new list? ");
		String[] allowedEntry = {"load","create"};
		String input = getEntry(allowedEntry);
		if(input.equals("load")){
			load();
		}else{
			create();
		}
	}
	
	private void load() {
		String fileName = "";
		//empty the catalog to prepare for a new load
		heroes = new ArrayList<Hero>();
		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
		boolean opened = false;
		while(!opened){
			try {
				System.out.println("Enter a file to open");
				fileName = in.nextLine();
				FileReader fileReader = new FileReader(new File(fileName));
				String line = "";
				//a BufferedReader enables us to read teh file one line at a time
				BufferedReader br = new BufferedReader(fileReader);
				while ((line = br.readLine()) != null) {

					String[] param = line.split(",");
					//add a new Book for each line in the save file
					heroes.add(new Hero(param[0],param[1],Integer.parseInt(param[2])));



				}
				br.close();
				opened = true;
			}catch (IOException e) {
				System.out.println("The file name you specified does not exist.");
			}
		}
		create();

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
	
	public void save() {
		try{    
			FileWriter fw=new FileWriter("BookCatalog.csv");
			for(Hero b: heroes){
				fw.write(b+"\n");    	
			}

			fw.close();    
			System.out.println("Success! File \"BookCatalog.csv\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	
	public void add() {
		String title = null;
		String author = null;
		int pages = 0;
		displayMessage("Please enter a hero name");
		title = getStringInput();
		displayMessage("Please enter an image addresss");
		author = getStringInput();
		displayMessage("Please enter a year");
		pages = getIntegerInput();
		addHero(new Hero(title, author, pages));
	}
	
	private static void displayMessage(String message){
		System.out.println(message);
	}
	
	private static String getStringInput(){
		String text = in.nextLine();
		while(text.isEmpty()){
			displayMessage("You must enter a non-empty String.");
			text = in.nextLine();
		}
		return text;
	}
	
	private static int getIntegerInput() {
		String text = in.nextLine();
		int value = 0;
		boolean valid = false;
		while(!valid){
			try{
				value = Integer.parseInt(text);
				valid = true;
			}catch(NumberFormatException nfe){
				displayMessage("You must enter an integer.");
				text = in.nextLine();
			}
			
		}
		return value;
	}
	
	public void addHero(Hero b){
		heroes.add(b);
	}
		
	private void create() {
		boolean running = true;
		while(running){
			showCatalog();
			displayMessage("Would you like to \"add\", \"save\", or \"quit\"?");
			String[] allowedEntry = {"add","save","quit"};
			String selection = getEntry(allowedEntry);
			if(selection.equals("add")){
				add();
			}else if(selection.equals("save")){
				save();
			}else{
				running = false;
			}
		}
	}
	
	private static String getEntry(String[] allowedEntry) {
		String input = in.nextLine();
		while(!matchesEntry(input, allowedEntry)){
			displayMessage("You must enter one of these words: ");
			for(String s: allowedEntry){
				System.out.print(s+" ");
			}
			displayMessage("\n");
			input = in.nextLine();
		}
		return input;
	}
	
	private  void showCatalog() {
		displayMessage("The catalog contains these Books:\n");
		for(Hero b: heroes){
			displayMessage("   "+b.toString()+"\n");
		}
	}
	
	private static boolean matchesEntry(String text, String[] list){
		for(String l: list){
			if(l.equals(text))return true;
		}
		return false;
	}
}
