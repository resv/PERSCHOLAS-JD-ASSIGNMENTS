//		WEEK 4 ASSIGNMENT 1 - IF STATEMENTS
//      1.	WHAT IF...
//			QUESTION 1
//			- Create three integers: [people], [cats] and [dogs].
//			- Set these variable to whatever you see fit.
//			1. Comment above each if statement, saying what you think the purpose of that code is.
//			2. Change your values so that your output is completely different than what you first saw.
//			3. Change your values so that no output is given.
		
		
//		---------------------------------------------------------------------------------------------------
	

package week4_A1_IF_STATEMENTS;

public class Assignment1_1 {

	public static void main(String[] args) {	

//		ASSIGNMENT REQUIREMENT 1-3
//			1. You will find comments placed all over this code to satisfy requirement #1
//			2. Variable sets A-D are listed below to return unique results. 
//		 	  Please comment the old set and uncomment the new set you wish to run. 
//		 	  Each set of variables will run through the ordered list of printlns
//		 	  that requested on the assignment page respectively.
//			3. Set E of variables will return no output to satisfy requirement 3.
		
		
//		DIFFERENT VARIABLE SCENARIOS ARE DEFINED HERE FOR QUESTION 2, 
//		COMMENT CURRENT AND UNCOMMENT ANOTHER SET TO TEST NEW VALUES.
		
//		SET A FOR REQUIREMENT #2
			int people = 1; int cats = 3; int dogs = 2;
		
//		SET B FOR REQUIREMENT #2
//			int people = 3; int cats = 2; int dogs = 1;
		
//		SET C FOR REQUIREMENT #2
//			int people = 1; int cats = 1; int dogs = 3;
		
//		SET D FOR REQUIREMENT #2
//			int people = 3; int cats = 3; int dogs = 1;
		
//		SET E FOR REQUIREMENT #3
//			int people = 0; int cats = 0; int dogs = 0;
		
		
		
		
		
		
//		IF THERE ARE LESS PEOPLE THAN CATS, THE BELOW SYSOUT WILL BE RETURNED 
			if (people < cats) {
				System.out.println("Too many cats! The world is doomed!");
			}
			
//		IF THERE ARE MORE PEOPLE THAN CATS, THE BELOW SYSOUT WILL BE RETURNED 
			else if ( people > cats) {
				System.out.println("Too few cats! The world is saved for another day!");
			}
			
//		IF THERE ARE LESS PEOPLE THAN DOGS, THE BELOW SYSOUT WILL BE RETURNED 
			else if ( people < dogs) {
				System.out.println("The world is drooled on!");
			}
			
//		IF THERE ARE MORE PEOPLE THAN DOGS, THE BELOW SYSOUT WILL BE RETURNED 
			else if (people > dogs) {
				System.out.println("The world is dry!");
			}
			
//		IF NO IF'S ARE TRUE THIS LAST ELSE STATEMENT WILL EXECUTE, WE INTENTIONALLY LEFT THIS BLANK FOR REQ #3
			else {
				
			}
	}
		
}

