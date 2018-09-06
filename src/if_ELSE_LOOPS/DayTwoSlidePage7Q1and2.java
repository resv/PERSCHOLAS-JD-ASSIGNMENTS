package if_ELSE_LOOPS;

import java.util.Scanner;

public class DayTwoSlidePage7Q1and2 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pick any number 1 - 7.");
		Integer number = reader.nextInt();
		
		switch(number){
			case 1 :
				System.out.println("The number " + number + " represents Monday");
				break;
			case 2 :
				System.out.println("The number " + number + " represents Tuesday");
				reader.close();
				break;
			case 3 :
				System.out.println("The number " + number + " represents Wednesday");
				break;
			case 4 :
				System.out.println("The number " + number + " represents Thursday");
				break;
			case 5 :
				System.out.println("The number " + number + " represents Friday");
				break;
			case 6 :
				System.out.println("The number " + number + " represents Saturday");
				break;
			case 7 :
				System.out.println("The number " + number + " represents Sunday");
				break;
			default : 
				System.out.println("You did not enter a proper value!");
				break;
		}
		
////		RTN empty lines on the console for better user view
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		Scanner reader2 = new Scanner(System.in);
		System.out.println("Type any day of the week. MON, TUES, WED, THURS, FRI, SAT, or SUN.");
		String day = reader2.next();
		String DAY = day.toUpperCase();
		
		switch (DAY){
		case "MON" :
			System.out.println(DAY + " is represented as day #1");
			break;
		case "TUES" :
			System.out.println(DAY + " is represented as day #2");
			break;
		case "WED" :
			System.out.println(DAY + " is represented as day #3");
			break;
		case "THURS" :
			System.out.println(DAY + " is represented as day #4");
			break;
		case "FRIDAY" :
			System.out.println(DAY + " is represented as day 5");
			break;
		case "SAT" :
			System.out.println(DAY + " is represented as day #6");
			break;
		case "SUN" :
			System.out.println(DAY + " is represented as day #7");
			break;
	}
		reader.close();
		reader2.close();
		
	}

	
	
	
}
