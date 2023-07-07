//import java.io.FileNotFoundException;

//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 8 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
//Slot Machine Class contains SlotMachine Constructor and methods insertMoney, play, and quit
public class SlotMachine {
	
	//simple attributes
	private PlayingField playingField; 
	private MoneyHandler theMoney;

	//SlotMachine constructor creates a new PlayingField and a new MoneyHandlerobject
SlotMachine(){
	setRegular();
	theMoney = new MoneyHandler();
}//end constructor

//insertMoney method with double parameter invokes the addMethod for the MoneyHandler allowing the user to add money
public void insertMoney(double d) {
	theMoney.add(d);
	
}//

//play method reduces 25 cents per spin from the MoneyHandler and passes the amount won in the spin to the MoneyHandler to be added to the balance
//returns returnStr
public String play() {
	String returnStr;
	//System.out.println("Paid 0.25 to spin....");

	
	theMoney.deduct(.25);
	theMoney.add(playingField.spin());
	//spinStr after playing Field is spun so that it can collect the names
	String spinStr = playingField.getSpinStr();
	System.out.println(theMoney.toString());
	returnStr = "Paid 0.25 to spin...." + "\nSpun " ;
	returnStr += spinStr  + theMoney.getDispenseStr() + "\n";
	return returnStr;
}

//quit method ends game and sends the MoneyHandler a message to dispense the money
public String quit() {
	theMoney.dispense();
	return theMoney.getDispenseStr();
	
}

/*//setBonus method creates an instance of BonusPlayingField and saves it in its playingField attribute.
public void setBonus(){
	BonusPlayingField bonusPlayingField = new BonusPlayingField();
	playingField = bonusPlayingField;
	
}// end setBonus
*/

//setRegular method creates an instance of PlayingField and saves it in its playingField attribute.
public void setRegular() {
	playingField = new PlayingField();
	
}//end setRegular();
public String[] getWheelsStrings() {
	
	String[] values = playingField.getWheelsStr().split("-");
return values;
}
public void resetStrings() {
	playingField.resetSpinStr();
	playingField.resetWheelsStr();
}
}//end SlotMachine class
