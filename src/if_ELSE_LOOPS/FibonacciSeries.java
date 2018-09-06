package if_ELSE_LOOPS;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		VARIABLE for the WHILE LOOP CONDITION
		int i = 0;
		
//		CONDITION DIAGRAM
//		t1 + t2 = r1
//		r1 + r2 = r2
		
	    int t1 = 0;
		int t2 = 1;
		int r1 = 2;
		
		
// 		FIBONACCI SOURCE CODE
		while (i < 10) {
			
		r1 = t1 + t2;
		System.out.println(t1);
		t1 = t2;
		t2 = r1;
					
			i++;
		}
	}
}
