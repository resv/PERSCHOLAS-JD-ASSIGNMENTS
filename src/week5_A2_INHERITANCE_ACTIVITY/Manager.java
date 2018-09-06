package week5_A2_INHERITANCE_ACTIVITY;

public class Manager extends Employee{

//	METHOD OVERLOADER CONSTRUCTOR FOR PARTICULAR OBJECT INSTRUCTORS WITH SALARY ADDED
		public Manager(long Id, String Name, String Address, long Phone, double Salary) {
			super(Id, Name, Address, Phone);
			super.basicSalary = Salary;
		}
		
		
		
//	METHOD OVERRIDING CALCULATE TRANSPORT ALLOWANCE METHOD SPECIFICALLY FOR MANAGER CLASS
			public void calculateTransportAllowance() {
				double transportAllowance = (15 * (basicSalary / 100));
				System.out.println(transportAllowance);
			}
}


	
	
	
	

