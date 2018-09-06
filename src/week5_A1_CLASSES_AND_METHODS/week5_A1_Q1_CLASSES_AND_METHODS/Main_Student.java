//	BASIC CLASSES AND METHODS
//	1.	STUDENTS
//		Create a Student class to store information about a student.
//		This includes a Name, a Grade, and a GPA.
//		Create three instances of type Student. Read the values for those students from user input.
//		Print out the names of those students, their grades, and their GPAs.
//		Then, print out the average GPA of all three students.


//		---------------------------------------------------------------------------------------------------


package week5_A1_CLASSES_AND_METHODS.week5_A1_Q1_CLASSES_AND_METHODS;

import java.util.Scanner;

public class Main_Student {

	public static void main(String[] args) {
		 
//	CREATE STUDENT OBJECTS
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
				
//	RUN THROUGH QUESTIONAIR TO FETCH VALUES FROM USER
//	STUDENT 1
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Student 1's name : ");
		student1.setName(reader.nextLine());
		System.out.println("Enter Student 1's grade: ");
		student1.setGrade(reader.next().charAt(0));
		System.out.println("Enter Student 1's GPA : ");
		student1.setGpa(reader.nextDouble());
		reader.nextLine();
		
//	STUDENT 2
		System.out.println("Enter Student 2's name : ");
		student2.setName(reader.nextLine());
		System.out.println("Enter Student 2's grade: ");
		student2.setGrade(reader.next().charAt(0));
		System.out.println("Enter Student 2's GPA : ");
		student2.setGpa(reader.nextDouble());
		reader.nextLine();
		
//	STUDENT 3
		System.out.println("Enter Student 3's name : ");
		student3.setName(reader.nextLine());
		System.out.println("Enter Student 3's grade: ");
		student3.setGrade(reader.next().charAt(0));
		System.out.println("Enter Student 3's GPA : ");
		student3.setGpa(reader.nextDouble());
		reader.nextLine();
				
//	THIS WILL PRINT OUT ALL STUDENT INFO FOR ALL 3 STUDENTS
		System.out.println("Student 1\'s Name : " + student1.getName() + " // Grade : " 
							+ student1.getGrade() + " // GPA : " + student1.getGpa());	
		
		System.out.println("Student 2\'s Name : " + student2.getName() + " // Grade : " 
				+ student2.getGrade() + " // GPA : " + student2.getGpa());	

		System.out.println("Student 3\'s Name : " + student3.getName() + " // Grade : " 
				+ student3.getGrade() + " // GPA : " + student3.getGpa());
		
//	PRINT OUT AVERAGE OF GPA FOR ALL 3 STUDENTS
		double avg = (student1.getGpa() + student2.getGpa() + student3.getGpa()) / 3;
		
		System.out.println("The average GPA of all three students put together is: " + avg);
		
//	CLOSES SCANNER	
		reader.close();
	}
}
