//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 8 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

//import ArrayList
import java.util.ArrayList;
//PlayingField is a superclass of BonusPlayingField
//PlayingField class contains PlayingField constructor and spin method 
public class PlayingField {

	//Wheel Array List
	private ArrayList<Wheel> wheels = new ArrayList<Wheel>();
	// two private data fields (instance variables) called spinStr and wheelsStr
	
	private String wheelsStr;
	private String spinStr;
	//PlayingField Constructor 
	PlayingField(){
		
		//Add 3 wheels to the ArrayList
		wheels.add(new Wheel());
		wheels.add(new Wheel());
		wheels.add(new Wheel());
		
	}//end PlayingField
	
	//spin method spins the 3 wheels and returns the corresponding statement and money based on how many wheels match 
	public double spin() {
		double value = 0 ;
		
		String name1 = wheels.get(0).spin();
		String name2 = wheels.get(1).spin();
		String name3 = wheels.get(2).spin();

		wheelsStr = name1 + "-" + name2 + "-" + name3;
		//System.out.printf("Spun %s-%s-%s\n", name1, name2, name3);
		 
		//compares the wheel spins to identify how many matches exist
		if (name1.equals(name2)||name1.equals(name3))
		{
			value +=.5;
		}
		if (name2.equals(name3))
		{
			value += .5;
		}
		//prints how much money is won
		if (value == 0)
		{
			//System.out.println("No prize");
			spinStr = wheelsStr + "\nNo prize\n";
		}
	    if (value == 0.5)
			//System.out.println("Won 50 cents");
	    	spinStr = wheelsStr + "\nWon 50 cents\n" ;
	    if (value == 1)
			//System.out.println("Won $1");
	    	spinStr = wheelsStr + "\nWon $1\n";
		return value;
		
	}//end spin
	
	//get method for spinStr
	public String getSpinStr() {
		return spinStr;
	}
	
	//get method for wheelsSTr
	public String getWheelsStr() {
		return wheelsStr;
	}
	//assign the empty String to wheelStr
	public void resetWheelsStr() {
		wheelsStr = " ";
		
	}
	//assign the empty String to spinStr
	public void resetSpinStr() {
		spinStr = " ";
	}
	
	
}
