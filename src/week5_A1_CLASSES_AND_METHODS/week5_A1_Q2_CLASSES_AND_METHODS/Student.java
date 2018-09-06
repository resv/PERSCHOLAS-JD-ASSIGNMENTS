//	WEEK 5 ASSIGNMENT 1 - BASIC CLASSES AND METHODS
//	2.	GETTING MORE ADVANCED
//		Create an array of type Student with three positions.
//		Read in their info just like before.
//		Print out the names of those students, their grades, and their GPAs.
//		Then, print out the average GPA of all three students.

		
//		---------------------------------------------------------------------------------------------------


package week5_A1_CLASSES_AND_METHODS.week5_A1_Q2_CLASSES_AND_METHODS;

public class Student {

//	INSTANCIATE THE VARIABLES BEING USED	
		private String name;
		private char grade;
		private double gpa;
		
//	SETTERS AND GETTERS FOR STUDENT CLASS
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getGrade() {
			return grade;
		}
		public void setGrade(char grade) {
			this.grade = grade;
		}
		public double getGpa() {
			return gpa;
		}
		public void setGpa(double gpa) {
			this.gpa = gpa;
		}
		
}
