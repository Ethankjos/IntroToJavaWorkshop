package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Hey there, my name is Pat the robot. What's yours?");
		JOptionPane.showMessageDialog(null, "Hello there " + answer + "!");
		String pokemon = JOptionPane.showInputDialog("Do you like Pokemon Go?");
JOptionPane.showMessageDialog(null, pokemon " lol.");
	}
}
