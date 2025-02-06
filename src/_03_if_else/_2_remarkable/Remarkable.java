package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		
		String Elsie = "Can make a siren noise";
		String Evie = "Can make a series of strange noises and is dependable if you have a question about demon slayer";
		String Ella = "Will literally not run out of energy";
		String answer = JOptionPane.showInputDialog(null, "Enter a name from our class!");
		if (answer == "Elsie"){
			System.out.println(Elsie);
		}
		if (answer == "Ella"){
			System.out.println(Ella);
		}
		if (answer == "Evie"){
			System.out.println(Evie);
		}
		
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

