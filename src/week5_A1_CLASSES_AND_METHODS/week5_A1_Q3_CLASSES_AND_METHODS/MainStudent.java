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

import java.util.Scanner;

import week5_A1_CLASSES_AND_METHODS.week5_A1_Q2_CLASSES_AND_METHODS.Student;

public class MainStudent {

//	METHOD TO GET THE NUMBER OF STUDENTS FROM USER
		public static int getNumber() {
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
			System.out.println("How many students?");
			return reader.nextInt();
		}
	
//	METHOD TO FETCH VALUES FOR EACH STUDENT, WHICH SETS THE VALUE INTO THE STUDENT CLASS
		public static void inputInfo(Student[] allStudentList) {
			Scanner reader = new Scanner(System.in);
			for (int i = 0; i < allStudentList.length; i++) {
				allStudentList[i] = new Student();
				System.out.println("What is the student's name?");
				String name = reader.nextLine();
				allStudentList[i].setName(name);
				System.out.println("What is the student's grade?");
				char grade = reader.next().charAt(0);
				allStudentList[i].setGrade(grade);
				System.out.println("What is the student's GPA?");
				double gpa = reader.nextDouble();
				allStudentList[i].setGpa(gpa);
				reader.nextLine();
			}
			reader.close();
		} 

//	METHOD TO PRINT ALL INFO OF A STUDENT, LOOPED TO PRINT ALL STUDENTS
		public static void printInfo(Student[] allStudentList) {
			for (int k = 0; k < allStudentList.length; k++) {
				System.out.println("Student Name : " + allStudentList[k].getName());
				System.out.println("Student Grade : " + allStudentList[k].getGrade());
				System.out.println("Student GPA : " + allStudentList[k].getGpa());
			}
		}
	
//	METHOD TO GET AVG OF ALL STUDENTS
		public static void getAvg(Student[] allStudentList) {
			double sumTotal = 0;
				for (int m = 0; m < allStudentList.length; m++) {
					sumTotal += allStudentList[m].getGpa();
				}
			double avg = sumTotal / allStudentList.length;
			System.out.println("Student averages = " + Math.round(avg * 100.0)/100.0);
		}
	
	
//	MAIN--------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
//	ASSIGN VARIABLE TO METHOD
		int numStudents = getNumber();
//	STUDENT TYPE, NAME OF ARRAY, NEW ARRAY WITH INDEX OF NUM STUDENT VARIABLE
		Student[] allStudentList = new Student[numStudents];
//	CALLING METHODS WITH ARRAYNAME 
		inputInfo(allStudentList);
		printInfo(allStudentList);
		getAvg(allStudentList);
	}
}
