/*	WEEK 5 ASSIGNMENT 1 - BASIC CLASSES AND METHODS
	5.	AREA CALCULATOR
		Create four methods to calculate the area for different objects.	
		Your method declaration will look something like this:
		public static double area_circle()   // returns the area of a circle
		public static int area_rectangle()   // returns the area of a rectangle
		public static int area_square()      // returns the area of a square
		public static double area_triangle() // returns the area of a triangle
		
		The equations for each are as follows:
		Circle = pi * radius^2
		Rectangle = length * width
		Square = side^2
		Triangle = 0.5 * base * height
		Note: you can use Math.PI for the value of pi.
		Create a main method that asks the user which object they would 
		like to get the area of.
		It will then direct them to that method.
		Each method will then ask the user to input the value of each variable required.
		For example, area_circle() will ask the user to input the radius.
		The main method will then return the results. */


//		---------------------------------------------------------------------------------------------------


package week5_A1_CLASSES_AND_METHODS.week5_A1_Q5_CLASSES_AND_METHODS;

import java.util.Scanner;

public class Main_Area {

//	METHOD TO GET SHAPE FROM USER
		public static void getRequest() {
			Scanner reader = new Scanner(System.in);
			System.out.println("Please tell me what SHAPE you would like to get the area for : ");
			String choice = reader.nextLine();
			choice = choice.toLowerCase();
			selectShape(choice);
			reader.close();
		}
		
//	METHOD CHOOSER, FETCH VALUES FROM USER
		public static void selectShape(String choice) {
			Scanner reader = new Scanner(System.in);
			switch (choice) {
			case "circle" : 
				System.out.println("Circle!?, tell me the value of the radius?");
				double radius = reader.nextDouble();
				calcCircle(radius);		
				break;
			case "rectangle" :
				System.out.println("Rectangle you say, what is the value of the length?");
				double rlength = reader.nextDouble();
				System.out.println("Got it, what about the value of the width?");
				double rwidth = reader.nextDouble();
				calcRect(rlength, rwidth);
				break;
			case "square" :
				System.out.println("Square!!, tell me the length of one of the sides?");
				double slength = reader.nextDouble();
				calcSquare(slength);
				break;
			case "triangle" :
				System.out.println("Triangle?!, tell me the base value of the triangle?");
				double base = reader.nextDouble();
				System.out.println("got the base, now tell me the value of the height?");
				double height = reader.nextDouble();
				calcTriangle(base, height);			
				break;
			}
			reader.close();
		}
		
		
//	CIRCLE METHOD TO GET AREA
		private static void calcCircle(double radius) {
			double areaCircle = (radius * radius) * Math.PI;
			System.out.println("The area of that circle is : " + areaCircle);		
		}
		
//	RECTANGLE METHOD TO GET AREA
		private static void calcRect(double rlength, double rwidth) {
			double areaRect = rlength * rwidth;
			System.out.println("The area of the rectangle is : " + areaRect);
			}
		
//	SQUARE METHOD TO GET AREA
		private static void calcSquare(double slength) {
		double areaSquare = slength * slength;
		System.out.println("The area of the rectangle is : " + areaSquare);
		}
		
//	TRIANGLE METHOD TO GET AREA
		private static void calcTriangle(double base, double height) {
			double areaTriangle = (base * height) * 0.5;
			System.out.println("The area of a triangle is : " + areaTriangle);
			}
		
//	MAIN ---------------------------------------------------------------------------------------
		
		public static void main(String[] args) {
			
			System.out.println("Hello I can find the area of a circle, rectangle, square, or triangle!");
			getRequest();
		}
	}
