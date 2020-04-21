package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String mess=JOptionPane.showInputDialog(null, "Who is the person you hate the most");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "you totally have a crush on "+mess );
		String input=JOptionPane.showInputDialog("whats your best friend's name");
		JOptionPane.showMessageDialog(null, input+" is as sweet as candy.");
		// 3. Ask the user for the name of their best friend
		
		
		// 4. Tell them their best friend is as sweet as candy

	} 
}



