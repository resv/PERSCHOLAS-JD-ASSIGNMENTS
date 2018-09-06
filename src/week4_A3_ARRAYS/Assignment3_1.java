//		WEEK 4 ASSIGNMENT 3 - ARRAYS		
//		1.	COPY AN ARRAY
//			Create an integer array of length 10 and fill it up with random numbers.
//			Create a second integer array of length 10.
//			Write a program that will copy the values of the first array into the second.
//			Print the values in both arrays at the end to prove your answer is valid.

		
//		---------------------------------------------------------------------------------------------------
		

package week4_A3_ARRAYS;

import java.util.Arrays;

public class Assignment3_1 {

	public static void main(String[] args) {
		
//		INITIALIZING THE ARRAYS WITH AN CAPACITY OF 10
			int[] arr1 = new int[10];
			int[] arr2 = new int[10];
			
//		FILLING THE ARRAY INDEX WITH DIFFERENT VALUES PER ARRAY
			Arrays.fill(arr1,1);
			Arrays.fill(arr2,2);
			
//		VERIFYING IF ARRAYS HAVE BEEN FILLED
			System.out.println("ARRAY 1 consists of:");
			System.out.println(Arrays.toString(arr1));
			System.out.println("ARRAY 2 consists of:");
			System.out.println(Arrays.toString(arr2));
			System.out.println();
			
//		NOTIFYING USER THAT COPYING OF ARRAYS WILL OCCUR	
			System.out.println("--- Copying array 1 to 2 ---");
			System.out.println();
		
//		COPYING ARRAY
			arr2 = arr1;
		
//		VERIFYING IF ARRAYS HAVE BEEN COPIED	
			System.out.println("Updated ARRAY 1 consists of:");
			System.out.println(Arrays.toString(arr1));
			System.out.println("Updated ARRAY 2 consists of:");
			System.out.println(Arrays.toString(arr2));
	}

}
