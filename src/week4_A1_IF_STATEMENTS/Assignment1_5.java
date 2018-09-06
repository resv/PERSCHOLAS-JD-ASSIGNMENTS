//		WEEK 4 ASSIGNMENT 1 - IF STATEMENTS
//		5.	DAY OF THE WEEK
//			- Create a method that accepts an integer and returns a string with the corresponding day of the week.
//			- Create a main that prompts the user to enter a number between 1-7, passes that number to
//			  your method in order to get the weekday, and then outputs that weekday.
//			- Your output could be the following:
//				Please enter an integer (1-7):
//				>2
//
//				Weekday 2 is Tuesday!
		
		
//		---------------------------------------------------------------------------------------------------
		

package week4_A1_IF_STATEMENTS;

import java.util.Scanner;

public class Assignment1_5 {

	public static void main(String[] args) {
		
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
		
//		QUESTION FOR USER TO ANSWER
			System.out.println("Please enter an integer (1 - 7)");
			Integer num = reader.nextInt();
		
//		IF STATEMENTS TO TEST USER'S VALUE
			if (num == 1) {
				System.out.println("Weekday " + num + " is Monday!");
			} else if (num == 2) {
				System.out.println("Weekday " + num + " is Tuesday!");
			} else if (num == 3) {
				System.out.println("Weekday " + num + " is Wednesday!");
			} else if (num == 4) {
				System.out.println("Weekday " + num + " is Thursday!");
			} else if (num == 5) {
				System.out.println("Weekday " + num + " is Friday!");
			} else if (num == 6) {
				System.out.println("Weekday " + num + " is Saturday!");
			} else if (num == 7) {
				System.out.println("Weekday " + num + " is Sunday!");
			} else {
				System.out.println("YOU DID NOT ENTER A VALID INTEGER FROM 1 - 7!");
			}
//		CLOSES SCANNER
			reader.close();		
	}
}