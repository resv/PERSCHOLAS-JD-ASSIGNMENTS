////	WEEK 4 ASSIGNMENT 2 - LOOPS
//		7.	Create a program using nested loops that would generate the following output:
//				1.
//				88888888
//				88888888
//				88888888
//				88888888
//				88888888
//				2.
//				8888
//				888
//				88
//				8
//				3.
//				        8 (begins with 8 black spaces)
//				       8
//				      8
//				     8
//				    8
//				   8
//				  8
//				 8
//				8
		
		
//		---------------------------------------------------------------------------------------------------


package week4_A2_LOOPS;

public class Assignment2_7 {

	public static void main(String[] args) {

//		1.	NESTED LOOP 1 (EASY METHOD)
				System.out.println("NESTED LOOP 1");
				
//			GIVEN REQUIREMENT VALUES FROM QUESTION STATED
				String block = "88888888";
				int i = 0;
				
//			BASIC NESTED WHILE LOOP WITH A FOR LOOP
				while (i < 5) {
					for (i = 0; i < 5; i++) {
						System.out.println(block);
					}
					break;
				}
				System.out.println();
			
//		2.	NESTED LOOP 2 (HASH METHOD/ CS50 MARIO.C METHOD)
				System.out.println("NESTED LOOP 2");
	
//			GIVEN REQUIREMENT OF HEIGHT FROM QUESTION STATED IN VARIABLES
				int height = 4;
				int row;
//			WHILE LOOP TO CHECK HEIGHT
					while (height > 0) {
						row = height;
//			NESTED WHILE LOOP TO CHECK ROW COUNT AND PRINTF ACCORDINGLY
						while (row > 0) {
							System.out.printf("8");
							row--;
							}
//			LINE BREAK ROWS AND KEEPS DEINCREMENTING TO BREAK HEIGHT OUT OF INFINITE LOOP
						System.out.println();
						height--;
				}
				System.out.println();
				
//		3.	NESTED LOOP 3 (HASH METHOD/ CS50 MARIO.C HIGHER DIFFICULTY)
				System.out.println("NESTED LOOP 3");
				
//			GIVEN REQUIREMENT OF HEIGHT FROM QUESTION STATED IN VARIABLES
				int heights = 9;
				int rows;
				
//			WHILE LOOP TO CHECK HEIGHT
				while (heights > 0) {
					rows = heights;
					
//			NESTED WHILE LOOP TO CHECK ROW COUNT AND PRINTF BLANK SPACES ACCORDINGLY
					while (rows > 1) {
						System.out.printf(" ");
						rows--;
						}
//			WE PRINT "8" BEFORE LINE BREAK AND MODIFY HEIGHT TO BREAK OUT OF INFINITE LOOP
					System.out.printf("8");
					System.out.println();
					heights--;
				}
	}
}
