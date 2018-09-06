//	WEEK 5 ASSIGNMENT 1 - BASIC CLASSES AND METHODS
//	2.	GETTING MORE ADVANCED
//		Create an array of type Student with three positions.
//		Read in their info just like before.
//		Print out the names of those students, their grades, and their GPAs.
//		Then, print out the average GPA of all three students.

		
//		---------------------------------------------------------------------------------------------------
		

//		1.create student class
//		2.create instances of student (1,2,3)
//		3.enter student info (name,grade,gpa) into an array student_Array
//		4.print student using student_Array
//		5.print avg gpa of all students (1,2,3)	

package week5_A1_CLASSES_AND_METHODS.week5_A1_Q2_CLASSES_AND_METHODS;

import java.util.Scanner;

public class MainStudent {
	  
//	METHOD TO FETCH VALUES FOR EACH STUDENT, WHICH SETS THE VALUE INTO THE STUDENT CLASS
		public static void inputInfo(Student[] allStudentList) {	
			Scanner reader = new Scanner(System.in);
			for (int i = 0; i < allStudentList.length; i++) {
				allStudentList[i] = new Student();
				System.out.println("What is the student's name?");
				String name = reader.next();
				name += reader.nextLine();
				allStudentList[i].setName(name);
				System.out.println("What is the student's grade?");
				char grade = reader.next().charAt(0);
				allStudentList[i].setGrade(grade);
				System.out.println("What is the student's GPA?");
				double gpa = reader.nextDouble();
				allStudentList[i].setGpa(gpa);			
			}
			reader.close(); 
		} 
		  
//	METHOD TO PRINT ALL INFO OF A STUDENT, LOOPED TO PRINT ALL STUDENTS	
		public static void printInfo(Student[] allStudentList) {
			for (int k = 0; k < allStudentList.length; k++) {
				System.out.println("Student's Name : " + allStudentList[k].getName());
				System.out.println("Student's Grade : " + allStudentList[k].getGrade());
				System.out.println("Student's GPA : " + allStudentList[k].getGpa());
			}
		}
//	METHOD TO GET AVG OF ALL STUDENTS	
		public static void getAvg(Student[] infoList) {
				double avg;
				avg = ((infoList[0].getGpa() + infoList[1].getGpa() + infoList[2].getGpa()) / 3);
				System.out.println("Average GPA of Students : " + String.format("%.2f", avg));
			}
	
//		------------------------------- MAIN ---------------------------------------------------------	
	
		public static void main(String[] args) {
		
//	STUDENT TYPE, NAME OF ARRAY, NEW ARRAY WITH INDEX OF NUM STUDENT VARIABLE
		Student[] allStudentList = new Student[3];

//	3 METHODS WE CALL TO PRNT OUT OUR INFO	
		inputInfo(allStudentList);
		printInfo(allStudentList);
		getAvg(allStudentList);
	}
}
