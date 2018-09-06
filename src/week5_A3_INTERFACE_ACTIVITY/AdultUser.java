package week5_A3_INTERFACE_ACTIVITY;

public class AdultUser implements LibraryUser {

//	INTIALIZE VARIABLES
		int age;
		String bookType;
		
//	REGISTER ACCOUNT METHOD SATISFIES INTERFACE, LIBRARYUSER CONTRACT	
		public void registerAccount(int age) {
			this.age = age;
			if (age > 12) {
				System.out.println("You have successfully registered under an Adult Account.");
			} else {
				System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
			}
			
		}

//	REQUEST BOOK METHOD SATISFIES INTERFACE, LIBRARYUSER CONTRACT	
		public void requestBook(String bookType) {
			this.bookType = bookType;
			if (bookType == "fiction" || bookType == "Fiction") {
				System.out.println("Book Issued successfully, please return the book within 7 days.");
			} else {
				System.out.println("Oops, you are allowed to take only adult Fiction books.");
			}
			
		}
}
