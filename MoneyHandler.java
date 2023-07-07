//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 8 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
//MoneyHandler class contains MoneyHandler constructor as well as methods add, deduct, getBalance, setBalance, dispense, and toString
import java.io.PrintWriter;
public class MoneyHandler {
	
	private double balance;
	
	//add a private data field
	private String dispenseStr;

	//constructor initializes balance to 0
	public MoneyHandler(){
		balance = 0; 
		
	}//end money Handler
	
	// add method adds the double parameter passed in to the value of balance
	public void add(double d){
		balance += d;
		
	}//end add
	
	// deduct method subtract the double parameter passed in to the value of balance
	public void deduct(double d) {
		balance -= d;
	}//end deduct
	
	//getBalance method returns the current balance 
	public double getBalance() {
		return balance;
	}//end getBalance
	
	//setBalance method sets the current balance
	public void setBalance(double d){
		balance = d;	
	}//end setBalance
	
	//dispense method prints out all the balance and then sets the balance variable to 0 creates a voucher file
public void dispense() {
		
	 //concatenate the String you originally displayed 
		dispenseStr = "Dispensed $  " + balance;
		try {
			PrintWriter pw = new PrintWriter("voucher.txt");
			
			//Create an output file named voucher.txt which contains the text "Casino voucher for $ xxx.xx" 
			pw.printf("Casino Voucher for $ %3.2f", balance);
			pw.close();
			}
		    //catch exception
			catch(Exception e)
			{
				System.out.println("File Problem with voucher.txt");
				
			}
		balance = 0;
			
	}

    //get method for dispenseStr
	public String getDispenseStr() {
		return dispenseStr;
	}
	//toString method returns the String containing the current Balance
	public String toString() {
		dispenseStr = "You have a $ " + balance + " balance";
		return dispenseStr;
	}//end toString
}//endMoneyHandler Class
