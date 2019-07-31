package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String Input = JOptionPane.showInputDialog(null, "Who do you not like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + Input);
		String Friend = JOptionPane.showInputDialog(null, "Who is your best friend?");
		JOptionPane.showMessageDialog(null, "Your best friend "+ Friend + " is as sweet as candy.");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		
		// 3. Ask the user for the name of their best friend

		// 4. Tell them their best friend is as sweet as candy

	} 
}



