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

public class Shape {

	private String shape;

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
}
