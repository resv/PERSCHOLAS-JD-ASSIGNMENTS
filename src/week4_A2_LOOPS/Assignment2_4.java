//		WEEK 4 ASSIGNMENT 2 - LOOPS
//		4.	COORDINATES IN A PLANE
//			Create a program that takes two integers: [x] and [y].
//			In that program, print out all possible coordinates of (0-x, 0-y)
//			Note that 0-y means 0 through y in this case.
//			Your output could look like the following:
//			What is the maximum x?
//			>2
//			What is the maximum y?
//			>3
//			Here are your possible coordinates:
//			(0,0)
//			(0,1)
//			(0,2)
//			...
//			(2,3)
		
		
//		---------------------------------------------------------------------------------------------------
		

package week4_A2_LOOPS;

import java.util.Scanner;

public class Assignment2_4 {

	public static void main(String[] args) {
		
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
			
//		QUESTIONS FOR USER TO ANSWER	
			System.out.println("I can print out all the possible coordinates of (X,Y)!");
			System.out.println("Please tell me your coordinates!");
			System.out.println("What is the maximum of \"X\"?");
			Integer x = reader.nextInt();
			System.out.println("What is the maximum of \"Y\"?");
			Integer y = reader.nextInt();
			
//		NESTED FOR LOOP TO GET ALL VALUES OF X AND Y AND ITERATES EVERY POSSIBLE RESULT
			for (int i = 0; i <= x; i++) {
				for (int k = 0; k <= y; k++) {
					System.out.println( "(" + i + "," + k + ")" );
				}
			}
			System.out.println("All your possible coordinates, are displayed above!");
//		CLOSES SCANNER
			reader.close();
	}
}