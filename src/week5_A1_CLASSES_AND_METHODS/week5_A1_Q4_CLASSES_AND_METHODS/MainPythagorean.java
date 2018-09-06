//	WEEK 5 ASSIGNMENT 1 - BASIC CLASSES AND METHODS
//	4.	PYTHAGOREAN THEORUM
//		Create a method that takes in two sides of a triangle 
//		and returns the length of the hypotenuse.
//		This can be found with the following equation:
//		c = sqrt(a^2 + b^2)
//		Create a main that calls this method with at least 3 different
//		sets of values and prints the results of each.


//		---------------------------------------------------------------------------------------------------


package week5_A1_CLASSES_AND_METHODS.week5_A1_Q4_CLASSES_AND_METHODS;

import java.util.Scanner;

public class MainPythagorean {

	  
//	TRIANGLES, FETCH VALUES
		public static void getSides(Sides[] pairValueSets) {
			Scanner reader = new Scanner(System.in);
			for (int i = 0; i < pairValueSets.length; i++) {
//	CAN'T FORGET THIS BAD BOY TO CREATE AN INSTANCE OF THE ARRAY
				pairValueSets[i] = new Sides();
				System.out.println("What is the value of triangle "+ (i+1) + ", side 1 : ?");
				Integer s1 = reader.nextInt();
				pairValueSets[i].setS1(s1);
				System.out.println("and value of triangle "+ (i+1) + ", side 2 : ?");
				Integer s2 = reader.nextInt();
				pairValueSets[i].setS2(s2);
			}
			reader.close();
		}
		
//	LOOP EACH SET OF VALUE SETS AND CALCULATES THE HYPOTHENUSE
		public static void prntCalc(Sides[] pairValueSets) {			
				for (int i = 0; i < pairValueSets.length; i++) {
					int squared1 = (pairValueSets[i].getS1() * pairValueSets[i].getS1());
					int squared2 = (pairValueSets[i].getS2() * pairValueSets[i].getS2());
						System.out.println();
						System.out.println("Triangle " + (i+1) + ": Side 1 squared = " + squared1 + ", Side 2 squared = " + squared2);
						System.out.println("The square root of (" + squared1 + " + " + squared2  + ") = hypothenuse");
						System.out.println("Hypothenuse side of Triangle " + (i+1) + " is " + Math.sqrt(squared1 + squared2));
						System.out.println();
				}	
		}
	
//	MAIN TO CALL EACH METHOD, ALSO WELCOME MESSAGE
		public static void main(String[] args) {
	
			System.out.println("Hello, I can solve 3 triangles for pythagorean theorum , please tell me two sides of each triangle!");
			
			Sides[] pairValueSets = new Sides[3];
			
			getSides(pairValueSets);
			prntCalc(pairValueSets);
			
		}
}