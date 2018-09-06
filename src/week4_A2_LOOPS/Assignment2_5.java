//		WEEK 4 ASSIGNMENT 2 - LOOPS
//		5.	Create a JAVA program to write the even numbers from 10 to 20, both included, except 16, in 3 different ways:
//			METHOD 1. Incrementing 2 in each step (use "continue" to skip 16)
//			METHOD 2. Incrementing 1 in each step (use "continue")
//			METHOD 3. With and endless loop (using "break" & "continue")
		

//		---------------------------------------------------------------------------------------------------


package week4_A2_LOOPS;

public class Assignment2_5 {

	public static void main(String[] args) {
		
//		METHOD 1,	WE INCREMENT BY 2 TO GET EVEN NUMBERS PRINTED AND CHECK TO AVOID "16"
		
			System.out.println("-----------METHOD 1------------");
				for (int i = 8; i < 20;) {
					i = i + 2;
					if (i == 16) {
						continue;
					}
					System.out.println(i);
				}
		
//		METHOD 2,	WE INCREMENT 1 AND CHECK IF VALUE IS EVEN, IF NOT WE CONTINUE, WE CHECK FOR "16" TO BE AVOIDED.
				
			System.out.println("-----------METHOD 2------------");
			for (int i = 8; i < 20;) {
				i = i + 1;
				if (i % 2 != 0) {
					continue;
				}
				if (i == 16) {
					continue;
				}
				System.out.println(i);
			}			
		
//		METHOD 3, 	-WHILE LOOP WILL CONTINUE UNTIL "i == 20", WE AVOID "16" AND INCREMENT VALUE.
//					-WE CHECK IF VALUE IS NOT EVEN, INCREMENT BY "1" AND CONTINUE.
//					-IF VALUE IS EVEN AND NOT 16, WE PRINT.
//					-WE BREAK WHILE LOOP ONCE WE REACH "20".
			
			System.out.println("-----------METHOD 3------------");
			int i = 10;
			while (i <= 20) {
				if (i == 16) {
					i++;
					continue;
				} else if (i % 2 != 0) {
					i++;
					continue;
				} else if (i % 2 == 0) {
					System.out.println(i);
					i++;
				} else {
					break;
				}
		}
	}
}






