package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is the capitol of China?");
		
		// 3.  Use an if statement to check if their answer is correct
				if (answer.contentEquals("Beijing")) {
					JOptionPane.showMessageDialog(null, "correct");
					score = score + 1;
					
				}
		
		// 4.  if the user's answer was correct, add one to their score 
				String answer2 = JOptionPane.showInputDialog("What is the square root of negative one?");
				
				// 3.  Use an if statement to check if their answer is correct
						if (answer2.contentEquals("i")) {
							JOptionPane.showMessageDialog(null, "correct");
							score = score + 1;
							
						}
		JOptionPane.showMessageDialog(null, score +" is your final score");
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
