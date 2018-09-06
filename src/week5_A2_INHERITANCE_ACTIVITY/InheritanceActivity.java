package week5_A2_INHERITANCE_ACTIVITY;

public class InheritanceActivity {

	public static void main(String[] args) {
		

//	CREATING CONSTRUCTOR FOR MANAGER
		Manager manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		
//	PRINTING OUT REFERENCE MESSAGE FOR MANAGER'S CALCULATESALARY METHOD THEN EXECUTES
		System.out.printf("The salary for the manager is : $ ");
		manager1.calculateSalary();
		System.out.printf("The transport allowance for manager1, named " + manager1.getEmployeeName() + " is : $ ");
		manager1.calculateTransportAllowance();
		
		
		
		
		
		
//	SPACING FOR RESULTS
		System.out.println();
		
		
		
		
		
		

//	CREATING CONSTRUCTOR FOR TRAINEE
		Trainee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
//	PRINTING OUT REFERENCE MESSAGE FOR TRAINEE'S CALCULATE SALARY & TRANSPORT ALLOWANCE METHOD THEN EXECUTES
		System.out.printf("The salary for the trainee is : $ ");
		trainee1.calculateSalary();
		System.out.printf("The transport allowance for trainee1, named " + trainee1.getEmployeeName() + " is : $ ");
		trainee1.calculateTransportAllowance();
	}
}

