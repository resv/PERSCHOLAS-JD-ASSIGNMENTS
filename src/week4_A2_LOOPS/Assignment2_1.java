//		WEEK 4 ASSIGNMENT 2 - LOOPS
//		1.  THE LEGENDARY FIZZBUZZ
//			Write a program that prints the numbers from 1 to 100.
//			But for multiples of three print "Fizz" instead of the number.
//			For the multiples of five print "Buzz".
//			For numbers which are multiples of both three and five print "FizzBuzz".
		
		
//		---------------------------------------------------------------------------------------------------
				

package week4_A2_LOOPS;

public class Assignment2_1 {

	public static void main(String[] args) {
		
//		BASIC FOR LOOP TO PRINT 1-100
			for (int i = 1; i <= 100; i++) {
//		IF WILL CHECK IF THE NUMBER IS MULTIPLE OF 3
				if ((i % 3 == 0 ) && ( i % 15 == 0)) {
					System.out.println("FizzBuzz");
					;				
//		ELSE IF WILL CHECK OF MULTIPLE OF 5
				}else if (i % 5 == 0) {
					System.out.println("Buzz");
					;
//		ELSE IF WILL CHECK FOR BOTH MULTIPLES OF 3 AND 5    
				}else if (i % 3 == 0) {
					System.out.println("Fizz");
					;
//		IF NO CONDITIONS ARE TRUE THEN WILL BREAK INTO ELSE
				}else {
					System.out.println(i);
				}
		}	
	}	
}
