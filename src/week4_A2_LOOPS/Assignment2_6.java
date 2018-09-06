////	WEEK 4 ASSIGNMENT 2 - LOOPS
//		6.	Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7. 
//			The expressions are to be typed in by the user. The input always consist of a number, 
//			followed by an operator, followed by another number. The operators that are allowed 
//			are +, -, *, and /. Your program should read an expression, print its value, read another 
//			expression, print its value, and so on. The program should end when the user enters 0 as 
//			the first number on the line.
		

//		---------------------------------------------------------------------------------------------------
		

package week4_A2_LOOPS;

import java.util.Scanner;

public class Assignment2_6 {

	public static void main(String[] args) {
		
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
		
//		INSTRUCTIONS & QUESTION FOR USER TO ANSWER TO GRAB VALUES FOR VARIABLES
			System.out.println("Hello, I can perform basic calulations for +, -, *, and /");
			System.out.println("Tell me a problem to solve! For example, 1 + 2 = 3");
			System.out.println("(By typing 0 for the first value, You can cancel the calculation)");
			System.out.println();
			System.out.println("What would be the first value? (tell me an integer)");
			Integer t1 = reader.nextInt();
			reader.nextLine();
			
//		VARIABLES INITIALIZED
			int r;
			int flag = 0;
			
//		WE CHECK IF USER HAS CANCELLED THE CALCULATIONS OR NOT BEFORE WE PROGRESS FURTHER
			if (t1 == 0) {
				System.out.println("You selected 0, and I will cancel the calculation");
				flag = 1;
//		WE CLOSE SCANNER EARLY IF USER DECIDES TO CANCEL AND THE REST OF CODE DOES NOT EXECUTE
				reader.close();
			}
			
//		WHILE LOOP USED! IF USER DID NOT CANCEL WE WILL CONTINUE WITH THE WHILE LOOP
			while (flag != 1){	
			
			System.out.println("What type of operator? (+, -, *, /)");
			String o = reader.nextLine();
			System.out.println("What would be the second value? (tell me an integer)");
			Integer t2 = reader.nextInt();
			reader.nextLine();
					
//		SWITCH CASE WILL FIGURE OUT WHAT OPERATION THE USER WANTED
//		WE ALSO EXECUTE THE BASIC OPERATIONS WITHIN THE SWITCH CASE
//		WE CHANGE FLAG VALUE TO BREAK OUT OF INFINITE WHILE LOOP
			switch(o) {
			case "o" :
				r = t1 - t2;
				System.out.println(t1 + " " + o + " " + t2 + " = " + r);
				flag = 1;
				break;
			case "+" :
				r = t1 + t2;
				System.out.println(t1 + " " + o + " " + t2 + " = " + r);
				flag = 1;
				break;
			case "*" :
				r = t1 * t2;
				System.out.println(t1 + " " + o + " " + t2 + " = " + r);
				flag = 1;
				break;
			case "/" :
				r = t1 / t2;
				System.out.println(t1 + " " + o + " " + t2 + " = " + r);
				flag = 1;
				break;
			default :
				System.out.println("You did not giver a proper integer value or operator value!");
				flag = 1;
				break;
			}
		}
//		CLOSES SCANNER IF USER DIDN'T CANCEL BY INPUTTING "0" BEFORE
			reader.close();	
	}
}
