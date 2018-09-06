package week5_A3_INTERFACE_ACTIVITY;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
				
//	KID // CREATE INSTANCE		
		KidUser kid = new KidUser();
		
//	KID // PASS REGISTER ACCOUNT METHOD WITH INT AGE		
		kid.registerAccount(10);
		kid.registerAccount(18);
		
		System.out.println();	//	PRNT LINE FOR BETTER VIEWABILITY
		
//	KID // PASS REQUEST BOOK METHOD WITH BOOK TYPE STRING
		kid.requestBook("Kids");
		kid.requestBook("Fiction");
		
		
		System.out.println();	//	PRNT LINE FOR BETTER VIEWABILITY
		System.out.println();	//	PRNT LINE FOR BETTER VIEWABILITY
		
		
//	ADULT // CREATE INSTANCE
		AdultUser adult = new AdultUser();
		
//	ADULT // PASS REGISTER ACCOUNT METHOD WITH INT AGE
		adult.registerAccount(5);
		adult.registerAccount(23);

		System.out.println(); 	//	PRNT LINE FOR BETTER VIEWABILITY
	
//	ADULT // PASS REQUEST BOOK METHOD WITH BOOK TYPE STRING
		adult.requestBook("Kids");
		adult.requestBook("Fiction");		
	}
}
