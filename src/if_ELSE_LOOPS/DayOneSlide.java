package if_ELSE_LOOPS;
import java.util.Scanner;

public class DayOneSlide {

	public static void main(String[] args) {
		
//		Opens scanner names reader
		Scanner reader = new Scanner(System.in);
		
//		Requests grade of student
		System.out.println("what number is the grade between 0 and 100?");
		
//		Fetches user's grade
		Integer grade = reader.nextInt();
		
//		Conditions are executed to find the grade of the student
		if (grade <= 100 && grade >= 90) {
			System.out.println("The student gets an A");
		}
		else if (grade <= 89 && grade >= 80) {
			System.out.println("The student gets a B");
		}
		else if (grade <=79 && grade >= 70) {
			System.out.println("The student gets a C");
		}
		else if (grade <=69 && grade >= 65) {
			System.out.println("The student gets a D");
		}
		else if (grade < 65 && grade > 0) {
			System.out.println("The student gets a F");
		}
		else {
			System.out.println("error: You did not input a valid number");
		}
		
//		Closes scanner
		reader.close();

	}
}
