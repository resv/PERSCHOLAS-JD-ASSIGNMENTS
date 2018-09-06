//		WEEK 4 ASSIGNMENT 3 - ARRAYS
//		5.	COMMA SEPERATED VALUES
//			Ask the user to input multiple words seperated by commas (,)
//			Put those words into a String array, and print out that String array 
//			for the user to see.

		
//		---------------------------------------------------------------------------------------------------
		

package week4_A3_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3_5 {

	public static void main(String[] args) {
		
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
			
//		INSTRUCTIONS FOR USER AND FETCH USER'S STRING
			System.out.println("Hello, I can create an word array!");
			System.out.println("Just type in words seperated by commas (no spaces needed) and I'll print them out!");
			String elements = reader.nextLine();

//		METHOD USED TO SPLIT STRINGS BASED ON THE IDENTIFIER ","
			String[] arr1 = elements.split(",");
			
//		PRINTS OUT USER'S STRING INTO AN ARRAY
			System.out.println(Arrays.toString(arr1));
			
//		CLOSES SCANNER	
			reader.close();
	}
}
