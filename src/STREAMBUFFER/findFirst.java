package STREAMBUFFER;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class findFirst {

	public static void main(String[] args) {
		
 
//		Stream.of("a1","a2","a3").findFirst().ifPresent(s -> System.out.println(s));

//		Stream.of("d2","a2","b1","b3","c")
//		.filter(s -> {
//			System.out.println("filter: " + s);
//			return true;})
//		.forEach(s-> System.out.println("forEach: " + s));
//		
		
//		-------------------------------------
		
		//TRIED TO USE LIST WITH STREAM but you must use collect(Collectors.toList());
//		
//		List<String> list = new ArrayList<String>();
//			list.add("d2");
//			list.add("a2");
//			list.add("b1");
//			list.add("b3");
//			list.add("c");
//		
//		list.stream().filter(s -> {
//			System.out.println("filter: " + s);
//			return true;
//			});
////		.forEach(s-> System.out.println("forEach: " + s));	
////		-----------------------------------------
//		
//		
//		Stream.of("d2","a2","b1","b3","c")
//		.filter(s -> {
//			System.out.println("filter: " + s);
//			return s.startsWith("a");});
//		
//		
		
		//INTERMEDIATE OPERATION AND TERMINAL OPERATION
		
		
//		https://www.baeldung.com/
//		All intermediate operations return Stream (can be chained), while terminal operations don't. 
//				filter(Predicate<T>) 
//				map(Function<T>) 
//				flatmap(Function<T>) 
//				sorted(Comparator<T>) 
//				peek(Consumer<T>) 
//				distinct() 
//				limit(long n) 
//				skip(long n)
//
//
//				Terminal Operations: (MANY)
//				forEach 
//				toArray 
//				reduce 
//				collect 
//				min 
//				max 
//				count 
//				anyMatch 
//				allMatch 
//				noneMatch 
//				findFirst 
//				findAny
		
		
		//useful to know
		String ex = "1+5+8+3+4";
		List<String> expression = Arrays.asList(ex.split("\\+"));
		
		IntStream.range(0,expression.size()).forEach((s) -> {
			System.out.println(s);
		});
		
		
		
		
	}
}
