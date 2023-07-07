//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 8 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class GUISlotMachine extends JFrame{
	JTextArea output;
	JScrollPane scrollPane;
	JLabel label1;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JButton button1;
	JButton button2;
	JButton button3;
	SlotMachine slots = new SlotMachine();
	GUISlotMachine(){
		//title
		super("Slot Machine");
		
		//make layout malleable
		setLayout(new FlowLayout()); 
		
		// use label one to prompt user 
		label1 = new JLabel("How much money would you like to insert?");
		add(label1);
		
		//editable textfield enter money
		text1 = new JTextField(10);
	    add(text1);
	    
	    //action listener
	    MyInner theInner = new MyInner();
	   
	    // buttons 
	    button1 = new JButton("Insert");
	    add(button1);
	    button1.addActionListener(theInner);
	    
	    button2 = new JButton("Spin");
	    add(button2);
	    button2.setEnabled(false);
	    button2.addActionListener(theInner);
	    
	    button3 = new JButton("Quit");
	    add(button3);
	    button3.setEnabled(false);
	    button3.addActionListener(theInner);
	    
	    //non editable textField
	    text2 = new JTextField(10);
	    add(text2);
	    text2.setEditable(false); 
	    
	    text3 = new JTextField(10);
	    add(text3);
	    text3.setEditable(false);
	    
	    text4 = new JTextField(10);
	    add(text4);
	    text4.setEditable(false);
	    
		//Create and add widgets in the Constructor
		output = new JTextArea(20,40);
		scrollPane = new JScrollPane(output);
		add(scrollPane);
		
		//Disable editing
		output.setEditable(false);
		//Elsewhere â€“ as needed
		//Erase contents and replace with text
		output.setText("");
		//Append contents with additional text
		output.append("");
	}
	
	// what to do if insert button is pressed
	private class MyInner implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			//if button one 
			//accept the amount of money that is entered and pass it to the insertMoney method from slots
			//enable and disable buttons accordingly
			if (e.getSource() == button1) {
				String answer = text1.getText();
				double answer2 = Double.parseDouble(answer);
				slots.insertMoney(answer2);
				button1.setEnabled(false);
				button2.setEnabled(true);
				button3.setEnabled(true);
				text1.setEditable(false);
				
			}// end if button 1
			
			//begin if button 2 
			//show the spin message with the wheels and current price 
			if (e.getSource() == button2) {
				output.append(slots.play());
			 String[] newArray = slots.getWheelsStrings();
			 //set the texts to the individual wheels spun 
			 text2.setText(newArray[0]);
			 text3.setText(newArray[1]);
			 text4.setText(newArray[2]);
			 slots.resetStrings();
			}
			
			//begin if 3 button
			if (e.getSource() == button3) {
				output.append(slots.quit());
				output.setEnabled(false);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				text1.setEnabled(false);
				text2.setEnabled(false);
				text3.setEnabled(false);
				text4.setEnabled(false);
				
				
			}
			}// end action performed
}//end inner class
	}
