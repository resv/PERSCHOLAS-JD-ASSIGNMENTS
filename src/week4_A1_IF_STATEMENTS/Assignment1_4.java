//		WEEK 4 ASSIGNMENT 1 - IF STATEMENTS
//		4.	SPECIFIC LEGAL PROBLEMS
//			- Make a program which displays a different message depending on the age given. 
//			- NOTE: Unlike the original legal problems, this program must ONLY display exactly ONE message based on age.
		
//			Here are the possible responses:
//			age is less than 16, say "You can't drive."
//			age is less than 18, say "You can't vote."
//			age is less than 25, say "You can't rent a car."
//			age is 25 or over, say "You can do anything that's legal."
		
		
//		---------------------------------------------------------------------------------------------------
				

package week4_A1_IF_STATEMENTS;

public class Assignment1_4 {

	public static void main(String[] args) {
			
//		VARIABLES STATED HERE, CAN BE CHANGED TO CHANGE PRINTLN RESULTS
			int age = 5;
		
//		IF STATEMENTS:
//		*WE MUST STATE SPECIFIC RANGES BECAUSE WE DON'T WANT A USER TO ENTER -1 OR 0
//		ALSO BE AWARE OF AN AGE TO BE 16 BE ABLE TO DRIVE.
			if (age < 16 || age > 0) {
				System.out.println("You can't drive.");
		
//		*WE NEED TO BE SPECIFIC HERE AND ADD A RANGE BECAUSE A USER COULD BE UNDER 18
//		MEANING THAT A USER COULD ALSO WRITE 13 AND POSSIBLY GET THE INCORRECT PRINTLN
//		FROM THE PRIOR "IF" STATEMENT/S
//		*"AGE > 15" WAS USED INSTEAD OF "AGE >= 16" WHICH ULTIMATELY MEANS THE SAME THING,
//		THIS WAS A CHOICE OF PREFERENCE
			} else if (age < 18 || age > 15) {
				System.out.println("You can't vote.");
				
//		*BASIC PRECAUTIONS FROM PRIOR "IF" STATEMENTS WERE IMPLEMENTED HERE
			} else if (age < 25 || age >17) {
				System.out.println("You can't rent a car.");
				
//		*WE DON'T WANT AN "ELSE" STATEMENT HERE DUE TO THE FORMAT OF THE CODE, WE NEED
//		TO CONSTANTLY BE AWARE OF THE RANGE OF THE AGE SO IT IS GOOD PRACTICE TO NOT LEAVE A DEFAULT
//		"ELSE" STATEMENT TO BREAK OUT OF THE CODE
			} else if (age >= 25) {
				System.out.println("You can do anything that's legal.");
			}
		
	}

}
