//		WEEK 4 ASSIGNMENT 1 - IF STATEMENTS
//		6.	SPACE WEIGHT
//			Create a program that will ask you for your current weight.
//			The program should then give you a list of planets and numbers that you can use to select them.
//			The program will then ask you for which planet you're selecting.
//			Then, the program will multiply your current weight by the relative gravity of that planet.
//			Finally, the program will output your relative weight on that planet (gravity * weight)

		
//		---------------------------------------------------------------------------------------------------
		

package week4_A1_IF_STATEMENTS;

import java.util.Scanner;

public class Assignment1_6 {

	public static void main(String[] args) {
			
//		VARIABLES STATED
		    double newWeight;
		    String planet;
		    
//		OPENS SCANNER
			Scanner reader = new Scanner(System.in);
			
//		QUESTIONS FOR USER TO ANSWER
			System.out.println("I am going to tell you your relative weight on a planet, what is your weight");
			Integer weight = reader.nextInt();
			reader.nextLine();
			System.out.println();
			System.out.println("Relative gravities of each planet are as follows, Please make a selection of the planet you are visiting.");
			System.out.println("A. (Venus) -> 0.78");
			System.out.println("B. (Mars) -> 0.39");
			System.out.println("C. (Jupiter) -> 2.65");
			System.out.println("D. (Saturn) -> 1.17");
			System.out.println("E. (Uranus) -> 1.05");
			System.out.println("F. (Neptune) -> 1.23");
			String answer = reader.nextLine();		
			System.out.println();

//		CASE STATEMENT WILL TEST FOR THE CASES THE USER GIVES US AND EXECUTES ACCORDINGLY
			switch(answer.toUpperCase()) {
			case "A" :
				planet = "Venus";
				newWeight = weight * .78;
				System.out.println("Your original weight is " + weight + ". Your new weight on " + planet + " is " + newWeight + ".");
				break;
			case "B" :
				planet = "Mars";
				newWeight = weight * .39;
				System.out.println("Your original weight is " + weight + ". Your new weight on " + planet + " is " + newWeight + ".");
				break;
			case "C" :
				planet = "Jupiter";
				newWeight = weight * 2.65;
				System.out.println("Your original weight is " + weight + ". Your new weight on " + planet + " is " + newWeight + ".");
				break;
			case "D" :
				planet = "Saturn";
				newWeight = weight * 1.17;
				System.out.println("Your original weight is " + weight + ". Your new weight on " + planet + " is " + newWeight + ".");
				break;
			case "E" :
				planet = "Uranus";
				newWeight = weight * 1.05;
				System.out.println("Your original weight is " + weight + ". Your new weight on " + planet + " is " + newWeight + ".");
				break;
			case "F" :
				planet = "Neptune";
				newWeight = weight * 1.23;
				System.out.println("Your original weight is " + weight + ". Your new weight on " + planet + " is " + newWeight + ".");
				break;
			default: break;
			}
//		CLOSES SCANNER
			reader.close();
	}
}

