//		WEEK 4 ASSIGNMENT 2 - LOOPS
//		3.  LETTER AT A TIME
//			Try using to print the character and position number for every character in a string from user input!
		

//		---------------------------------------------------------------------------------------------------
		

package week4_A2_LOOPS;

import java.util.Scanner;

public class Assignment2_3 {

	public static void main(String[] args) {

//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
			
//		QUESTION FOR USER TO ANSWER
			System.out.println("Hello!, type a word or sentence and I will display each letter of what you typed in a new line!");
			String word = reader.nextLine();
//		FOR LOOP THAT WILL FETCH EACH LETTER OF THE STRING, PRINT THEN LINE BREAK
			for (int i = 0; i < word.length(); i++) {
				System.out.println(word.charAt(i));
			}
//		CLOSES SCANNER
			reader.close();
	}

}