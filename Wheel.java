//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 8 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
//import random class 
import java.util.Random;
import java.util.Scanner;
//import file reader
import java.io.File;

//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;

//import java ArrayList
import java.util.ArrayList;

//Wheel Class contains Wheel constructor and spin method
public class Wheel {
	
	//simple attributes
	private Random rand = new Random();
	private ArrayList <String> values = new ArrayList<String>();
	
	
	//Wheel constructor reads in a textfile to use as names in the ArrayList
	Wheel() {
		
		
		//read in the file and scan each line as a new name using the scanner
		File file = new File("wheelvalues.txt");
		Scanner scan;
		
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
			values.add(scan.nextLine());
			}
			
			//file not found exception
		} catch (FileNotFoundException e) {
			System.out.println("nothing else to read");
		}
	
	   
		
	}//end wheel constructor
	
	// public method Spin returns one of the Strings in Wheels using random number generator
	public String spin() {
		return values.get(rand.nextInt(values.size()));
		
	}//end spin
	

}//end wheel class
