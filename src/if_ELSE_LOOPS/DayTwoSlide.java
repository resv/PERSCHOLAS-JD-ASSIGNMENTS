package if_ELSE_LOOPS;
import java.util.Scanner;

public class DayTwoSlide {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("What is the correct way to declare a "
				+ "variable to store an integer value in Java?");
		System.out.println("A = int x=10;");
		System.out.println("B = int 1_x=10;");
		System.out.println("C = float x=10.0f;");
		System.out.println("D = string $x=\"10\";");
		System.out.println("E = none of the above;");
		
		String answer = reader.nextLine();
		
		switch(answer.toUpperCase()) {
		case "A" :
			System.out.println("Sorry, A is INCORRECT!");
			break;
		case "B" :
			System.out.println("Sorry, B is INCORRECT!");
			break;
		case "C" :
			System.out.println("Sorry, C is INCORRECT");
			break;
		case "D" :
			System.out.println("Sorry, D is INCORRECT!");
			break;
		case "E" :
			System.out.println("That's right, E is the CORRECT answer!");
			break;
		default: break;
		}
		reader.close();
	}

}

