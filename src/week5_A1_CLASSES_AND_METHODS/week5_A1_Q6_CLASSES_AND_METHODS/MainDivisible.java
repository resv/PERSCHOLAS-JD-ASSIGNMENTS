//	WEEK 5 ASSIGNMENT 1 - BASIC CLASSES AND METHODS
//	6.	DIVISIBLE BY...
//
//		Create two functions:
//		public static boolean isEven( int n )
//		The function should return the value true if n is an even number (divisible by 2) and false otherwise.
//		And
//		public static boolean isDivisibleBy3( int n )
//		The function should return the value true if n is evenly divisible by 3 and false otherwise.
//		Write a main() that contains a for loop to generate all the numbers from 1 to 20. Use if statements 
//		inside the loop to mark the number with a "<" if it's even, with a "=" if it's evenly divisible by 3, 
//		and with both if it's divisible by both 2 and 3.
//		For example, numbers 1-6 would look like this:
//		1
//		2 <
//		3 =
//		4 <
//		5
//		6 <
//		6 =


//		---------------------------------------------------------------------------------------------------


package week5_A1_CLASSES_AND_METHODS.week5_A1_Q6_CLASSES_AND_METHODS;

public class MainDivisible {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			if ( isEven(i) ) {
				System.out.println(i + "<");
			} if ( isDivisibleBy3(i) ) {
				System.out.println(i + "=");
			} if ( isEven(i) == false && isDivisibleBy3(i) == false){
				System.out.println(i);
			}
		} 
	}


	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isDivisibleBy3(int n) {
		if (n % 3 == 0) {
			return true;
		}
		return false;
	}
	
}
