// WEEK 6 ASSIGNMENT 5 - LINKEDLIST

package week6_A5_LINKEDLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Assignment5_Q1to15 {

	public static void main(String[] args) {
		// INITIALIZE LINKEDLIST
		LinkedList<String> colors = new LinkedList<String>((Arrays.asList
		("Blue", "Yellow","Red", "Green", "Orange", "White", "Black")));

		// CALLING ALL METHODS, ONE AFTER ANOTHER
		append(colors, "Green");
		iterate(colors);
		iterateAt(colors, 3);
		iterateReverse(colors);
		insertAt(colors, 5, "Brown");
		insertFirstLast(colors,"Brown", "Gray");
		insertFirst(colors, "Brown");
		insertLast(colors, "Brown");
		insertFewAt(colors, 3, "Brown", "Gray");
		getFirstLast(colors);
		removeFirstLast(colors);
		removeAll(colors);
		swapTwo(colors, 3,6);
		convert(colors);
		isEmpty(colors);
		
	}

	// 1. Write a Java program to append the specified element to the end of a linked list.
	private static void append(LinkedList<String> list, String newColor) {
		System.out.println("\nQUESTION 1 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD TO APPEND ELEMENT TO THE END OF LinkedList
		list.add(newColor);
		
		//PRINT NEW CHANGES
		System.out.println("New appended array :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Appended [" + newColor +"] at the end of the LinkedList)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}

	
	// 2. Write a Java program to iterate through all elements in a linked list.
	private static void iterate(LinkedList<String> list) {
		System.out.println("\nQUESTION 2 -----------------------");
		
		//METHOD TO ITERATE THROUGH ALL THE ELEMENTS OF THE LINKEDLIST
		for (String elements : list) {
			System.out.printf(elements + " ");
		}	
		
		//USER NOTIFICATION
		System.out.println("\r\n(Iterating through the LinkedList)");
	}
	
	
	// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
	private static void iterateAt(LinkedList<String> list, int index) {
		System.out.println("\nQUESTION 3 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD TO REMOVE A CERTAIN AMOUNT OF ELEMENTS THEN TO ITERATE FROM THERE
		//ITERATOR METHOD CAN BE USED INSTEAD BUT USED THIS METHOD FOR CRITICAL THINKING
		for (int i = 0; i < index; i++) {
			list.removeFirst();	
		}
		
		//PRINT NEW CHANGES
		System.out.println("The LinkedList now iterating starting at " + index + " :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Iterating through the LinkedList at starting at index " + index + ")");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}
	
	// 4. Write a Java program to iterate a linked list in reverse order.
	private static void iterateReverse(LinkedList<String> list) {
		System.out.println("\nQUESTION 4 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//FOR LOOP TO PUSH ELEMENT TO THE LAST INDEX AND TO POP THE FIRST ELEMENT
		for (int i = 0, k = list.size() - 1; i < k; i++) {
			list.add(i, list.remove(k));
		}
		
		//PRINT NEW CHANGES
		System.out.println("New reversed order : ");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Reversed the original LinkedList)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}

	// 5. Write a Java program to insert the specified element at the specified position in the linked list.
	private static void insertAt(LinkedList<String> list, int index, String element) {
		System.out.println("\nQUESTION 5 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " ");
		
		//METHOD USED TO INSERT AT SPECIFIC INDEX
		list.add(index, element);	
		
		//PRINT NEW CHANGES
		System.out.println("\r\nNew LinkedList order is : ");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Inserted element " + "[" + element + "] at index "+ index +")");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}
	
	
	// 6. Write a Java program to insert elements into the linked list at the first and last position.
	private static void insertFirstLast(LinkedList<String> list, String elementFirst, String elementLast) {
		System.out.println("\nQUESTION 6 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD USED TO INSERT TO FIRST & LAST INDEX
		list.addFirst(elementFirst);
		list.addLast(elementLast);
		
		//PRINT NEW CHANGES
		System.out.println("New appended array :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Inserted [" + elementFirst +  "] to the front & [" + elementLast + "] to the end)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}
	
	
	// 7. Write a Java program to insert the specified element at the front of a linked list.
	private static void insertFirst(LinkedList<String> list, String element) {
		System.out.println("\nQUESTION 7 -----------------------");
	
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD USED TO INSERT AT TO THE FIRST INDEX
		list.addFirst(element);
		
		//PRINT NEW CHANGES
		System.out.println("New appended array :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Inserted [" + element +  "] to the front)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}	
	

	// 8. Write a Java program to insert the specified element at the end of a linked list.
	private static void insertLast(LinkedList<String> list, String element) {
		System.out.println("\nQUESTION 8 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
			
		//METHOD USED TO INSERT AT END OF ENDEX INDEX
		list.addLast(element);	
			
		//PRINT NEW CHANGES
		System.out.println("New appended array :");
		System.out.println(list);
			
		//USER NOTIFICATION
		System.out.println("(Inserted [" + element +  "] to the end of LinkedList)");
				
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}	
		
	
	// 9. Write a Java program to insert some elements at the specified position into a linked list.
	private static void insertFewAt(LinkedList<String> list, int index, String element1, String element2) {
		System.out.println("\nQUESTION 9 -----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
					
		
		list.add(index, element1);
		list.add(index+1, element2);
		
		//PRINT NEW CHANGES
		System.out.println("The new LinkList order is : ");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Added [" + element1 + "] and [" + element2 + "] at index " + index + ")");
				
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
		
	}
	
	// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	private static void getFirstLast(LinkedList<String> list) {
		System.out.println("\nQUESTION 10 ----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD USED TO GET THE FIRST AND LAST ELEMENTS IN THE LINKEDLIST
		String first = list.getFirst();
		String last = list.getLast();
		
		//PRINT NEW CHANGES
		System.out.println("The first element is [" + first + "] and [" + last + "] is the last.");
		
		//USER NOTIFICATION
		System.out.println("(Displaying the first and last element in the LinkedList)");
		
	}
	
	// 11. Write a Java program to remove first and last element from a linked list.
	private static void removeFirstLast(LinkedList<String> list) {
		System.out.println("\nQUESTION 11 ----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD USED TO REMOVE FIRST AND LAST ELEMENTS OF THE LinkedList
		list.remove(list.getFirst());
		list.remove(list.getLast());
		
		//PRINT NEW CHANGES
		System.out.println("New appended array :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Removed the first & last index from the LinkedList)");
				
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));		
	}
	
	
	// 12. Write a Java program to remove all the elements from a linked list.
	private static void removeAll(LinkedList<String> list) {
		System.out.println("\nQUESTION 12 ----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//WHILE LOOP TO REMOVE FIRST UNTIL THERE IS NO ELEMENTS
		while (list.size() > 0) {
			list.removeFirst();
		}
		
		//PRINT NEW CHANGES
		System.out.println("The LinkedList now contains :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Removed all elements from the LinkedList)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
	}
	
	// 13. Write a Java program of swap two elements in an linked list
	private static void swapTwo(LinkedList<String> list, int element1, int element2) {
		System.out.println("\nQUESTION 13 ----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
	
		//METHOD TO SWAP ELEMENTS IN A LINKEDLIST
		String element1Value = list.get(element1);
		String element2Value = list.get(element2);
		
		list.remove(element1);
		list.add(element1, element2Value);
		list.remove(element2);
		list.add(element2, element1Value);
		
		//PRINT NEW CHANGES
		System.out.println("The new LinkedList order is :");
		System.out.println(list);
		
		//USER NOTIFICATION
		System.out.println("(Swapped " + element1Value + " with " + element2Value + " in the LinkedList)");
		
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Blue", "Yellow","Red", "Green", "Orange", "White", "Black"));
		
	}
	// 14. Write a Java program to convert a linked list to array list.
	private static void convert(LinkedList<String> list) {
		System.out.println("\nQUESTION 14 ----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//METHOD TO CONVERT LINKEDLIST TO AN NORMAL ARRAY
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
		//METHOD TO CONVERT LINKED LIST INTO A LINKED LIST
		ArrayList<String> arrList = new ArrayList<String>();
		for (String element : list) {
			arrList.add(element);
		}
	
		//PRINT NEW CHANGES
		System.out.println("The normal Array now contains :");
		System.out.println(Arrays.toString(arr));
		System.out.println("The ArrayList now contains :");
		System.out.println(arrList);
		
		//USER NOTIFICATION
				System.out.println("(Converted LinkedList into an Array & ArrayList)");
	}
	
	// 15. Write a Java program to test an linked list is empty or not.
	private static void isEmpty(LinkedList<String> list) {
		System.out.println("\nQUESTION 15 ----------------------");
		
		//DISPLAY CURRENT ORDER OF LINKEDLIST
		System.out.println("Currently the LinkedList order is : ");
		System.out.println(list + " \r\n");
		
		//IF STATEMENT WITH BOOLEAN PARAMETER METHOD USED TO CHECK IF EMPTY
		if (list.isEmpty()) {
			System.out.println("The array is EMPTY!");
		} else {
			System.out.println("The array is NOT EMPTY!");
		}
		
		//USER NOTIFICATION
		System.out.println("(Checking if LinkedList is empty)");
	}

}
