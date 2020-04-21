package section3;

import javax.swing.JOptionPane;

public class Hello_World {	
	public static void main(String[] args) {
		System.out.println("Hello world");
		JOptionPane.showMessageDialog(null, "Henlo");
		String input=JOptionPane.showInputDialog("whats your name");
		JOptionPane.showMessageDialog(null, "hello "+input);
		
	}

}
