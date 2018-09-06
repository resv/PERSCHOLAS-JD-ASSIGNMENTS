package LAMBDA_FUNCTIONAL_INTERFACE.Calculator;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Hello, tell me your first number?");
		int num1 = reader.nextInt();
		System.out.println("What type of operation ? ( +, - , *, /)");
		String operation = reader.next();
		System.out.println("What is your second number?");
		int num2 = reader.nextInt();
		System.out.println("Calculating : ( " + num1 + " " + operation + " " + num2 + " )...");
		
		
		MyCalc x = new MyCalc();
		Integer adder = x.sum.compute(num1,num2);
		Integer subtracter = x.subtract.compute(num1,num2);
	// BECAUSE OF FLOW CONTROL THE NUM1 & NUM2 ONLY GET CHANGED AFTER WE SET THE ABOVE INTS
		Float num1f = Float.valueOf(num1);
		Float num2f = Float.valueOf(num2);
		
		Float multiplier = x.multiply.compute(num1f,num2f);
		Float divider = x.divide.compute(num1f,num2f);
	
		switch (operation) {
			case "+" : System.out.println("Result is : " + num1 + " " + operation + " " + num2 + " = " + adder);
						break;
			case "-" : System.out.println("Result is : " + num1 + " " + operation + " " + num2 + " = " + subtracter);
						break;
			case "*" : System.out.println("Result is : " + num1 + " " + operation + " " + num2 + " = " + multiplier);
						break;
			case "/" : System.out.println("Result is : " + num1 + " " + operation + " " + num2 + " = " + divider);
						break;
			default: System.out.println("Something went wrong");
		}
		
		reader.close();
	}
}
