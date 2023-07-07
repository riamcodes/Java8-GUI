//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 8 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
import javax.swing.JFrame;
public class GUILauncher {
	public static void main(String[] args) {
		GUISlotMachine theGame = new GUISlotMachine();
		theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGame.setSize(650,450);
		theGame.setVisible(true);
	}

}
