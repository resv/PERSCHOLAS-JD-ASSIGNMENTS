//		WEEK 4 ASSIGNMENT 1 - IF STATEMENTS
//		3.	CARS OR BUSES
//			- Create three integers named [people], [cars], and [buses].
//		WHAT YOU SHOULD DO ON YOUR OWN
//				1. What do you think else if and else are doing? Answer in a comment.
//				2. Remove the else from one of your else if statements. What differences does that make? Why?
		
		
//		---------------------------------------------------------------------------------------------------
	

package week4_A1_IF_STATEMENTS;

public class Assignment1_3 {

	public static void main(String[] args) {	
		
//		RESPONSE TO QUESTIONS:
//		1.	"IF" and "ELSE IF" statements are executing the conditions stated within the parenthesis.
//			If the "IF" expression is true then the block inside the said statement will execute.
//      	IF the "IF" expression is false then the next "ELSE IF" statement will test condition if true or false.
//			The expression in the "ELSE IF" is true then it will execute the code inside the block, 
//			The expression in the "ELSE IF" is false then the next "ELSE IF" statement (assuming it exists), will be tested. 
//			This process continues until there is a condition to be found true in the upcoming "ELSE IF" statements.
//			The"ELSE" statement is used as a default option to break out the code if no conditions prior are true;		
		
//		2.	Removing the else statements for these particular "IF" statements cause an issue when conditions
//			display an equal value nor true or false. For example if there are an equal amount of cars and people,
//			the code "ELSE" code should execute, however, removing these will result in the "IF" statement to not print
//			any of the responses to the terminal.
		
		
//		---------------------------------------------------------------------------------------------------
		
//	IF STATEMENTS:
		
//	We introduce the variables, that can be changed to get different println results
		int people = 1;
		int cars = 2;
		int buses = 3;
		
//	FIRST SET OF IF STATEMENTS
		if (cars > people) {
			System.out.println("We should take the cars.");
		} else if (cars < people) {
			System.out.println("We should not take the cars.");
		} else {
			System.out.println("We can't decide.");
		}
		
//	SECOND SET OF IF STATEMENTS
		if (buses > cars) {
			System.out.println("That's too many buses.");
		} else if (buses < cars) {
		System.out.println("Maybe we should take the buses.");
		} else {
			System.out.println("We still can't decide.");
		}
		
//	THIRD SET OF IF STATEMENTS
		if (people > buses) {
			System.out.println("Alright, let's just take the buses.");
		} else {
			System.out.println("Let's just take the cars.");
		}		
	}

}
