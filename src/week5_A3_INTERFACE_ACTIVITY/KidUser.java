package week5_A3_INTERFACE_ACTIVITY;

public class KidUser implements LibraryUser{

//	INTIALIZE VARIABLES
		int age;
		String bookType;
	
//	REGISTER ACCOUNT METHOD SATISFIES INTERFACE, LIBRARYUSER CONTRACT	
		public void registerAccount(int age) {
			this.age = age;
			if (age < 12) {
				System.out.println("You have successfully registered under a Kids Account.");
			} else {
				System.out.println("Sorry, Age must be less than 12 years to register as a kid.");
			}
			
		}
	
//	REQUEST BOOK METHOD SATISFIES INTERFACE, LIBRARYUSER CONTRACT	
		public void requestBook(String bookType) {
			this.bookType = bookType;
			if (bookType == "Kids" || bookType == "kids") {
				System.out.println("Book Issued successfully, please return the book within 10 days.");
			} else {
				System.out.println("Oops, you are allowed to take only kids books.");
			}
		}
}
