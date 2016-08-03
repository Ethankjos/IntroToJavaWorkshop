package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You must be looking for a relationship.");
		JOptionPane.showMessageDialog(null, "So for us to set you up we must ask you a few questions");
		String gender = JOptionPane.showInputDialog("First we need to know if you are a boy or a girl.");
		JOptionPane.showMessageDialog(null, "Okay, so you are a " + gender + ". We may have somebody for you.");
		String phone = JOptionPane.showInputDialog("We just need your phone number quickly");
		String mom = JOptionPane.showInputDialog("We only need your mom's maiden name now.");
		String bank = JOptionPane.showInputDialog("The final thing we need before we tranfer you to your future soulmate is your bank account.");
		JOptionPane.showMessageDialog(null, "//Your conversation has been transferred//");
		JOptionPane.showInputDialog("Hey beautiful");
		JOptionPane.showInputDialog("Before I can talk to you any longer I need to get a picture of you");
		JOptionPane.showMessageDialog(null, "Gotta go babe, will talk to you tommorow ;) <3");

	}
}
