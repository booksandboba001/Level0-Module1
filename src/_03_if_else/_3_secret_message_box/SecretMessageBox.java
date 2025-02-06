package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

public class SecretMessageBox{

	// // 0. Make a main method and put steps 1-5 inside it

	public static void main(String[] args){
		String password = JOptionPane.showInputDialog("What will the password be?");
		String message = JOptionPane.showInputDialog("What will the secret be?");
		String guess = JOptionPane.showInputDialog("What is the password?");
		if(guess.equals(password)){
			JOptionPane.showMessageDialog(null, message);
		}
		else{
			JOptionPane.showMessageDialog(null, "WRONG INTRUDER!!!!!!!");
		}
	}
	
}
