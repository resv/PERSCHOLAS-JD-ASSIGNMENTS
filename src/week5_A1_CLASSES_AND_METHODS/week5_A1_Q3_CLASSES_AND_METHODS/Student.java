//	WEEK 5 ASSIGNMENT 1 - BASIC CLASSES AND METHODS
//	3.	NOW WE'RE TALKING
//		Ask the user to input the number of students they would like to enter.
//		Store this in an integer named [numStudents].
//		Create an array of type Student with [numStudents] positions.
//		Read through their info via a loop.
//		Using a loop, print out the names of those students, their grades, and their GPAs.
//		Finally, print out the average GPA of all students.


//		---------------------------------------------------------------------------------------------------




package week5_A1_CLASSES_AND_METHODS.week5_A1_Q3_CLASSES_AND_METHODS;

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
