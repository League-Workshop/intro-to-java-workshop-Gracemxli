package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		int x = new Random().nextInt(4);
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable
		JOptionPane.showMessageDialog(null, x);

	// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog("Please enter something that you think is awesome");

	// 5. If the random number is 0
		if (x == 0) {
			JOptionPane.showMessageDialog(null, "That's awesome");
		}

	// -- tell the user whatever they entered is awesome!
		if (x == 1) {
			JOptionPane.showMessageDialog(null, "That's ok");
		}
		if (x == 2) {
			JOptionPane.showMessageDialog(null, "That's boring");
		}if (x == 3) {
			JOptionPane.showMessageDialog(null, "K.");
		}

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
}
}


