//	BASIC CLASSES AND METHODS
//	1.	STUDENTS
//		Create a Student class to store information about a student.
//		This includes a Name, a Grade, and a GPA.
//		Create three instances of type Student. Read the values for those students from user input.
//		Print out the names of those students, their grades, and their GPAs.
//		Then, print out the average GPA of all three students.


//		---------------------------------------------------------------------------------------------------


package week5_A1_CLASSES_AND_METHODS.week5_A1_Q1_CLASSES_AND_METHODS;

public class Student {

//	VARIABLES
		private String name;
		private char grade;
		private double gpa;
		
	
//	SETTERS AND GETTERS
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
		
		public void avgGpa(String text) {
			System.out.println(text);
		}
		
	}
