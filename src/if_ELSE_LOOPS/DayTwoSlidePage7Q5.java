package if_ELSE_LOOPS;

import java.util.Scanner;

public class DayTwoSlidePage7Q5 {

	public static void main(String[] args) {
		
		
//		QUESTION 5
//			Read in an int variable month equal to 1, …, 12, 
//			set a string variable to the name of the month January, February, etc.
		
		
		
//		OPENS SCANNER
		Scanner reader = new Scanner(System.in);
		

		
		System.out.println("Tell me a number from 1 - 12");
		System.out.println();
		System.out.println("I will tell you the month it represents");
		Integer number = reader.nextInt();

		
//		IF INVALID NUMBER IS GIVEN WE WILL LET THE USER KNOW
		if (number < 1 || number > 12) {
			System.out.println("You did not tell me a number between 1 - 12");
		}
		
		
//		IF VALID VALUE IS GIVEN WE WILL EXEC THE FOLLOWING IF STATEMENTS
//		THESE IF STATEMENTS ALSO SATISFIES PART2 OF THE QUESTION
			if (number == 1) {
				String JAN = "JAN";
				System.out.println();
				System.out.println(number + " represents the month " + JAN);
			} else if (number == 2) {
				String FEB = "FEB";
				System.out.println();
				System.out.println(number + " represents the month " + FEB);
			} else if (number == 3) {
				String MAR = "MAR";
				System.out.println();
				System.out.println(number + " represents the month " + MAR);
			} else if (number == 4) {
				String APR = "APR";
				System.out.println();
				System.out.println(number + " represents the month " + APR);
			} else if (number == 5) {
				String MAY = "MAY";
				System.out.println();
				System.out.println(number + " represents the month " + MAY);
			} else if (number == 6) {
				String JUN = "JUN";
				System.out.println();
				System.out.println(number + " represents the month " + JUN);
			} else if (number == 7) {
				String JUL = "JUL";
				System.out.println();
				System.out.println(number + " represents the month " + JUL);
			} else if (number == 8) {
				String AUG = "AUG";
				System.out.println();
				System.out.println(number + " represents the month " + AUG);
			} else if (number == 9) {
				String SEP = "SEP";
				System.out.println();
				System.out.println(number + " represents the month " + SEP);
			} else if (number == 10) {
				String OCT = "OCT";
				System.out.println();
				System.out.println(number + " represents the month " + OCT);
			} else if (number == 11) {
				String NOV = "NOV";
				System.out.println();
				System.out.println(number + " represents the month " + NOV);
			} else if (number == 12) {
				String DEC = "DEC";
				System.out.println();
				System.out.println(number + " represents the month " + DEC);
			}
			
		
//		CLOSES SCANNNER
		reader.close();
		
	}

}