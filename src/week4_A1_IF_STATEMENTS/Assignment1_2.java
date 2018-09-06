//		WEEK 4 ASSIGNMENT 1 - IF STATEMENTS
//		2.	LEGAL PROBLEMS
//			- Make a program which displays a different message depending on the age given. 
		
		
//-----------------------------------------------------------------------------------------		
		

package week4_A1_IF_STATEMENTS;
import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		
//	Scanner named "reader" will be initiated to request user input values.
		Scanner reader = new Scanner(System.in);
		
//	Scanner will "ask" the name of user.
		System.out.println("Hey, what's your name?");
		
//	System will record the value from user and place it in "name" variable.
		String name = reader.nextLine();
		
//	Scanner will "ask" the age of user.
		System.out.println("Ok, " + name + " how old are you?");
		
//	System will record the value from user and place it in "age" variable.
		Integer age = reader.nextInt();
		
		
//	The age variable will be compared with the following arguments below.
//	Depending the age of the user, will determine which if statement will fire. 
			if (age < 16) {
				System.out.println("You can't drive.");
			} else if (age < 18) {
				System.out.println("You can't vote.");
			} else if (age < 25) {
				System.out.println("You can't rent a car.");
				
//	We don't necessarily have to write a condition for (age >= 25) because
//	we will assume that the user if 25 or over if no prior IF statements were 
//	satisfied. 
			} else {
				System.out.println("You can do anything that's legal.");
			}
		
//	This will close the scanner
		reader.close();
	}

}
