package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String answer1 =JOptionPane.showInputDialog("What is greater than God,\n" + //
								"more evil than the devil,\n" + //
								"the poor have it,\n" + //
								"the rich need it,\n" + //
								"and if you eat it, you'll die?");
			if (answer1.equals("nothing")){
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
				String answer2 = JOptionPane.showInputDialog("How many of each species did Moses take on the ark with him?");
				if (answer2.equals("Moses wasn't on the Ark, Noah was"));
					JOptionPane.showMessageDialog(null, "Correct!");
					score++;
					String answer3 = JOptionPane.showInputDialog("Alive without breath,\n" +//
										"As cold as death;\n" +//
										"Never thirsty, ever drinking,\n" +//
										"All in mail never clinking.\n");
				if (answer3.equals("Fish"));
					JOptionPane.showMessageDialog(null, "Correct!");
					score++;
				}
				else{
				JOptionPane.showMessageDialog(null, "NOOP >:)");
			}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer
		JOptionPane.showMessageDialog(null, "This is your score: "+ score);
	
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

