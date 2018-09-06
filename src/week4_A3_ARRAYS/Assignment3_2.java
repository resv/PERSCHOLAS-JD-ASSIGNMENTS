//		WEEK 4 ASSIGNMENT 3 - ARRAYS
//		2.	FIND A VALUE IN AN ARRAY
//			Create an integer array of length 10 and fill it up with random numbers.
//			Print the values in the array for the user to see.
//			Ask the user for a value they'd like you to search for.
//			Search through the array.
//			If the value is in the array, tell them which position you found.
//			It's okay if the program prints the message more than once.


//		---------------------------------------------------------------------------------------------------


package week4_A3_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3_2 {

	public static void main(String[] args) {

//		INITIALIZING ARRAY INDEX OF 10 WITH RANDOM INT VALUES PER ELEMENT
			int[] arr1 = {764,11,2,243,56,851,351,1,664,42};
			int flag = 1;
			
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
			
//		INSTRUCTIONS FOR USER
			System.out.println("This is an array and they consist of numbers");
			System.out.println();
			System.out.println(Arrays.toString(arr1));
			System.out.println();
			System.out.println("Please type in an value you see in this array, I can search within the array and tell you its location index");
			Integer element = reader.nextInt();
		
//		USING A "FOR LOOP" TO ITERATE THROUGH THE ARRAY TO FIND THE USER'S VALUE THAT MATCH WITHIN THE ARRAY, THEN OUTPUTS INDEX OF THAT VALUE	
			for (int i = 0; i < arr1.length; i++) {
				if (element == arr1[i]) {
					System.out.println("-------------------------------------------------------------------");
					System.out.println("Your value has been found in the array!");
					System.out.println();
					System.out.println(element + " has an index of " + i + " or also written as arr1[" + i + "].");
					System.out.println();
					System.out.println("*Remember that an array index starts at 0 and not 1.");
					flag = 0;
				} 
			}			
//		IF NO MATCHING VALUE IS FOUND THE DEFAULT FLAG COUNTER IS AT 1 AND IT WILL WILL NOTIFY USER OF NO MATCHING VALUES.
			if (flag == 1) {
				System.out.println();
				System.out.println("No matching integer values were found within the array!");
			} 
//		CLOSES SCANNER
			reader.close();	
	}
}
