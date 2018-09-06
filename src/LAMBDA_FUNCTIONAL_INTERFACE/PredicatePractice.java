package LAMBDA_FUNCTIONAL_INTERFACE;

import java.util.function.IntPredicate;

public class PredicatePractice {

	public static void main(String[] args) {

		
		IntPredicate predicate1 = a -> a > 0;
		IntPredicate predicate2 = a -> a == 10;

		System.out.println(predicate1.and(predicate2).test(5));
		
		System.out.println(predicate1.or(predicate2).test(12));
		
		
		
	}

}


