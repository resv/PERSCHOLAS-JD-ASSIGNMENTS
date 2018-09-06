package if_ELSE_LOOPS;

public class DayTwoSlidePage23Q1Q2 {

	public static void main(String[] args) {

	//HW#1: Create a for loop for each output that display the
	//following sequences:
	//OUTPUT: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
	//OUTPUT: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
		
	//HW#2: Create a while loop for each output that display the
	//following sequences
	// OUTPUT: 1, 15, 225, 3375, 50625
	// OUTPUT: 2, 6, 18, 54, 162
		
		
		
		
//		QUESTION #1 / HW #1
		int i;

		
System.out.println("QUESTION #1 / HW #1 / PART 1 Prints even below:");
		for (i = 0; i < 20; i++) {
			i = i + 1;
			System.out.println(i);
		}
		System.out.println();
		
System.out.println("QUESTION #1 / HW #1 / PART 2 Prints even below:");
		for (i = 1; i < 20; i++) {
			i = i + 1;
			System.out.println(i);
		}
		System.out.println();
		
//		QUESTION #2 / HW #2
System.out.println("QUESTION #2 / HW #2 / PART 1 Prints even below:");
		for (i = 1; i < 50625; ) {
			i = i * 15;
			System.out.println(i);
		}
		System.out.println();

System.out.println("QUESTION #2 / HW #2 / PART 2 Prints even below:");
		for (i = 1; i < 162;) {
			i = i * 3;
			System.out.println(i);
		}
		System.out.println();
	}
}