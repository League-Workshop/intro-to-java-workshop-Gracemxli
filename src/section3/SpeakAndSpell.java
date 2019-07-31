package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. 
		speak("spell the word mandlebrot");

		// 2. Catch the user's answer in a String
		 String input = JOptionPane.showInputDialog(null, "Please Spell");

		// 3. If the user spelled the word correctly, speak "correct"
if (input.contentEquals("mandlebrot")) {
	speak("correct");
	
}else {
	speak("wrong");
}
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
speak("spell the word supercalifragilisticexpialidocious");

// 2. Catch the user's answer in a String
 String input2 = JOptionPane.showInputDialog(null, "Please Spell");

// 3. If the user spelled the word correctly, speak "correct"
if (input2.contentEquals("supercalifragilisticexpialidocious")) {
speak("correct");

}else {
speak("you're bad");
}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


