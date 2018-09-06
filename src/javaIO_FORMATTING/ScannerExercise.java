package javaIO_FORMATTING;

import java.util.Scanner;

public class ScannerExercise {

	public static void main(String[] args) {
				
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = reader.nextLine();
		System.out.println("Hi " + name + "!, How old are you?");
		Integer age = reader.nextInt();
		System.out.println("So your " + age + ", eh? Tha's not old at all!");
		System.out.println("How much money do you make, " + name + "?");
		Integer wage = reader.nextInt();
		System.out.println(wage + "! I hope that's per hour and not per year!");
		reader.close();
		
	}

}