//		WEEK 4 ASSIGNMENT 2 - LOOPS
//		2.  THE HALVING MACHINE
//			Create a loop that will take an integer from user input.
//			If the integer is odd, add 1 and then divide that by 2 and print the new number.
//			If the integer is even, just divide by 2 and print the new number.
//			Continue doing this until you reach 1.
//			If the user enters 0 or negative number, print out "HEY! That's against the rules." and end the program.

		
//		---------------------------------------------------------------------------------------------------	
	

package week4_A2_LOOPS;

import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
			
//		VARIABLES THAT WILL BE USED
			int evenNum;
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
//		QUESTIONS FOR USER TO ANSWER
			System.out.println("I will divide an even number down until we reach 1.");
			System.out.println();
			System.out.println("Pick a number from 1-100, what even number would you like to try?");
			System.out.println();
			System.out.println("if it's odd I will add 1 to make it even!");
			Integer num = reader.nextInt();	
			
//		CHECK IF INTEGER IS VALID WITHIN PARAMETERS OF 1-100
			if (num < 1 || num > 100) {
				System.out.println("HEY! That's against the rules.");
			} 
			
//		LOOP PORTION 
//		1. SINCE THIS IS A LOOP, WE WANT TO MAKE SURE IT STOPS WHEN IT REACHES THE VALUE OF 1
//		2. THE FIRST IF STATEMENT WILL LOOP TO MAKE ANY ODD NUMBER EVEN WITHIN THE LOOP
//		3. THE SECOND IF STATEMENT WILL DIVIDE THE EVEN NUMBER BY 2 WITHIN THE LOOP
			while (num > 1 && num < 101) {
				if (num % 2 != 0) {
				System.out.println("Since " + num + " is odd, let me add 1 and make it even");
				evenNum = num + 1;
				num = evenNum;
				System.out.println("Your new even number is now " + num);
				} else if (num % 2 == 0) {
					System.out.println("Since " + num + " is even, lets divide it by 2!");
					num = (num / 2);
					System.out.println("Your number divided by 2 = " + num);
				}
			}
//		ClOSES SCANNER
			reader.close();
	}

}
