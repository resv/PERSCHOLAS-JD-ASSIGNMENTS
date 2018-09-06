//		WEEK 4 ASSIGNMENT 3 - ARRAYS
//		4.	HOW MANY TIMES
//			Create an integer array of length 10 and fill it up with random numbers.
//			Print the values in the array for the user to see.
//			Ask the user for a value they'd like you to search for.
//			Search through the array.
//			Tell the user how many times that value appears in the array.
		
		
//		---------------------------------------------------------------------------------------------------


package week4_A3_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3_4 {

	public static void main(String[] args) {		
		
//		INITIALIZING ARRAY INDEX OF 10 WITH RANDOM INT VALUES PER ELEMENT, AND HIGHEST VARIABLE TO BE USED IN LOOP
			int[] arr1 = {764,11,2,243,56,851,351,1,664,664};
			int counter = 0;
				
//		VERIFYING IF ARRAYS HAVE BEEN FILLED
			System.out.println("The array consists of:");
			System.out.println(Arrays.toString(arr1));
			System.out.println();
			
//		OPENS SCANNER, ASKS USER FOR VALUE/S
			Scanner reader = new Scanner(System.in);
			System.out.println("Hello, I can search through the array and tell you how many times that value appears!");
			System.out.println();
			System.out.println("Which integer value found in the array would you like me to search for?");
			Integer element = reader.nextInt();
			System.out.println();
			
//		LOOPING THROUGH THE ARRAY TO FIND THE LARGEST VALUE
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i] == element) {
					counter++;
				}
			}
			
//		PRINTING OUT THE HIGHEST VALUE FOUND IN THE ARRAY
//		ADJUSTING MESSAGE IF ONLY FOUND ONCE
//		ADJUSTING MESSAGE IF VALUE DOES NOT EXIST AT ALL
			if (counter > 1) {
				System.out.println(element + " appears " + counter + " TIMES in the array!");
			} else if (counter == 1) {
				System.out.println(element + " only appears ONCE in the array!");
			} else {
				System.out.println("You did not input a valid value that exists in the array!");
			}
			
//		CLOSES SCANNER	
			reader.close();
	}
}