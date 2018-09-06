package if_ELSE_LOOPS;

import java.util.Scanner;

public class DayTwoSlidePage7Q3and4 {

	public static void main(String[] args) {

//		QUESTION 3
//			Randomly select an integer 0, 1, 2 or 3 and set a string variable to a card suit (Hearts, Clubs, Spades or Diamonds) based
//			on the random selection. Display the results
//		QUESTION 4
//			Given the String variable suit holding the name of a card suit (Hearts, Clubs, Spades
//			or Diamonds) set an int variable to 0, 1, 2 or 3 based on the selection. 
	
//		OPENS SCANNER
		Scanner reader = new Scanner(System.in);
		
		int rdm = (int)(Math.random() * 4);
		String suit;
		
		System.out.println("I will randomly pick a number from 0-3.");
		System.out.println("Each number represents a card suit!");
		System.out.println();
		System.out.println();
		
//		QUESTION 4 VARIABLES STATED
		int spades = 0;
		int hearts = 1;
		int clubs = 2;
		int diamonds = 3;
		

		if (rdm == 0) {
			suit = "Spades, and did you know the Ace of Spades is the highest value!";

		} else if (rdm == 1) {
			suit = "Hearts, I love you.";

		} else if (rdm == 2) {
			suit = "Clubs, and unless its 4 clovers it's not lucky.";

		} else {
			suit = "Diamonds, and diamonds are forever.";

		}
				
		System.out.println("The random number was " + rdm);
		System.out.println(rdm + " represents " + suit);
		System.out.println();
		
//		QUESTION 4 IS SATISFIED HERE BY CALLING THE VARIABLES
		System.out.println("Spades = " + spades);
		System.out.println("Hearts = " + hearts);
		System.out.println("Clubs = " + clubs);
		System.out.println("Diamonds = " + diamonds);
		
//		CLOSES SCANNNER
		reader.close();
		
		
	}

}
