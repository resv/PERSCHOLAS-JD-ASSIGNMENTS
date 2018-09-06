//		WEEK 4 ASSIGNMENT 3 - ARRAYS
//		3.	LARGEST VALUE
//			Create an integer array of length 10 and fill it up with random numbers.
//			Print the values in the array for the user to see.
//			Locate the largest number in the array and print out that number and its position.

		
//		---------------------------------------------------------------------------------------------------
		
	
package week4_A3_ARRAYS;

import java.util.Arrays;

public class Assignment3_3 {

	public static void main(String[] args) {
	
//		INITIALIZING ARRAY INDEX OF 10 WITH RANDOM INT VALUES PER ELEMENT, AND HIGHEST VARIABLE TO BE USED IN LOOP
			int[] arr1 = {764,11,2,243,56,851,351,1,664,42};
			int highest = 0;
				
//		VERIFYING IF ARRAYS HAVE BEEN FILLED
			System.out.println("The array consists of:");
			System.out.println(Arrays.toString(arr1));
			System.out.println();
			
//		LOOPING THROUGH THE ARRAY TO FIND THE LARGEST VALUE
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i] > highest) {
					highest = arr1[i];
				}
			}
			
//		PRINTING OUT THE HIGHEST VALUE FOUND IN THE ARRAY
			System.out.println(highest + " is the highest value element found in the array index!");
	}
}
