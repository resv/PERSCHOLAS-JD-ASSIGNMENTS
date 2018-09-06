package if_ELSE_LOOPS;

import java.util.Scanner;

public class DayTwoVerbalAssignment1 {

	public static void main(String[] args) {

//			VERBAL ASSIGNMENT
//			Fetch an int between 1-7 make sure keep asking for entry until u get the right number.
//			Then try to do a "do while" loop and "while" loop until the variable = 7;

					
			Scanner reader = new Scanner(System.in);
			System.out.println("Please input a number from 1- 7");
			Integer w = reader.nextInt();
			
			if (w > 1 || w < 7) {

//			WHILE LOOP		
			System.out.println("While loop prints out the following:");
					while(w < 7) {
						System.out.println(w);
						w++;
					}		
			} else {
				System.out.println("You did not input a valid value between 1-7");
			}
					
					
//			LINE SEPERATOR
			System.out.println("-------------------------------------");
			
//			DO WHILE LOOP
			System.out.println("Do While loop prints out the following:");
			int dw = 1;
				do {
					if (dw < 7) {
						dw++;
						System.out.println(dw);
					}
				} while (dw < 7);
			
				
			reader.close();
		}

	}

