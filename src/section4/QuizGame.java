package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String input=JOptionPane.showInputDialog("What is 2+2?");

		if(input.equals("4")) {
			JOptionPane.showMessageDialog(null, score+=1);
		
					
		}
		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
		String input1=JOptionPane.showInputDialog("What is 3+3?");
		if(input1.equals("6")) {
			JOptionPane.showMessageDialog(null, score+=1);
		
					
		}
	}
}
