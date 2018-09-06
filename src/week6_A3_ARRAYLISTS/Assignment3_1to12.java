//	WEEK 6 ASSIGNMENT 3 - ARRAYLISTS

package week6_A3_ARRAYLISTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment3_1to12 {

	public static void main(String[] args) {

		// 1.STARTING SMALL

		// INITIALIZING THE ARRAYLIST & REGULAR ARAY
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		ArrayList<String> blankArr = new ArrayList<String>();
		String[] regArr = { "These", "elements", "came", "from", "a", "regular", "array" };

		// ADDING ELEMENTS (COLORS)
		colors.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
		colors2.addAll(Arrays.asList("Yellow", "Blue", "Pink", "Black"));

		// PRINTING ARRAYLIST
		System.out.println("\nQUESTION 1 -----------------------");
		System.out.println(colors);
		System.out.println("(Printed all elements in the ArrayList)");

		// CALLING ALL METHODS, ONE AFTER ANOTHER
		iterating(colors);
		updating(colors);
		removing(colors);
		searching(colors, "Red");
		sorting(colors);
		reversing(colors);
		copying(colors, blankArr);
		comparing(colors, colors2);
		appending(colors, colors2);
		looping(colors);
		converting(regArr);

	}

	// 2.ITERATING : WRITE A JAVA METHOD TO ITERATE THROUGH ALL ELEMENTS IN THE
	// PREVIOUS ARRAYLIST.
	// PRINT EACH COLOR OUT IN THE FORMAT OF: "Today's Color is [color]!"
	private static void iterating(ArrayList<String> list) {
		System.out.println("\nQUESTION 2 -----------------------");
		for (String elements : list) {
			System.out.println("Today's Color is " + elements + "!");
		}
		System.out.println("(Printed all elements as a sentence)");
	}

	// 3.UPDATING : WRITE A METHOD TO CHANGE THE 5TH ELEMENT OF ARRAYLIST TO
	// "Magenta"
	private static void updating(ArrayList<String> list) {
		System.out.println("\nQUESTION 3 -----------------------");
		list.set(4, "Magenta");
		System.out.println(list);
		System.out.println("(5th element was changed to \"Magenta\")");
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

	}

	// 4.REMOVING : WRITE A METHOD TO REMOVE THE THIRD ELEMENT OF YOUR ARRAYLIST
	private static void removing(ArrayList<String> list) {
		System.out.println("\nQUESTION 4 -----------------------");
		list.remove(2);
		System.out.println(list);
		System.out.println("(3rd element \"Orange\" was removed)");
		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
	}

	// 5.SEARCHING : WRITE A METHOD TO SEARCH YOUR ARRAYLIST FOR A SPECIFIED COLOR.
	private static void searching(ArrayList<String> list, String colorToFind) {
		System.out.println("\nQUESTION 5 -----------------------");

		// USING BOOLEAN AS A FLAG TO PRINT OUT FOUND NOTICIATION
		Boolean exists = false;
		System.out.println("Current list contains : " + list);
		for (String colors : list) {
			if (colorToFind.equalsIgnoreCase(colors)) {
				System.out.println(colorToFind + " was searched and found!");
				exists = true;
				break;
			}
		}
		if (exists == false) {
			System.out.println(colorToFind + " was not found in the ArrayList");
		}
		System.out.println("(Searched \"" + colorToFind + "\" in the colors ArrayList)");
	}

	// 6.SORTING : WRITE A METHOD TO SORT YOUR ARRAYLIST FROM A-Z
	private static void sorting(ArrayList<String> list) {
		System.out.println("\nQUESTION 6 -----------------------");

		// USING COLLECTIONS FOR EFFICIENCY
		System.out.println("Current Order of ArrayList : " + list);
		Collections.sort(list);
		System.out.println("A-Z order of ArrayList : " + list);
		System.out.println("(Sorted list in A-Z order)");

		// IMPLEMENTED TO RESET ARRAY FOR NEXT METHOD TO TEST
		list.clear();
		list.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

	}

	// 7.REVERSING : WRITE A METHOD TO REVERSE YOUR ARRAYLIST
	private static void reversing(ArrayList<String> list) {
		System.out.println("\nQUESTION 7 -----------------------");

		// PUSHING THE LAST INDEX, POPPING THE LAST INDEX OF ARRAY.SIZE()
		System.out.println("Current ArrayList order : " + list);

		for (int i = 0, k = list.size() - 1; i < k; i++) {
			list.add(i, list.remove(k));
		}
		System.out.println("New reversed order..." + list);

		// RESETTING ARRAY TO ORIGINAL ORDER FOR RETESTING PURPOSES
		list.clear();
		list.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
		System.out.println("(Printed out array in reverse order)");

		// "Collections.reverse(list)" WOULD DO ALL OF THIS IN ONE LINE!
		// BUT I WANTED TO TRY TO USE RECURSION
	}

	// 8.COPYING : WRITE A METHOD THAT WILL COPY THE CONTENTS OF ONE ARRAYLIST TO
	// ANOTHER.
	private static void copying(ArrayList<String> list, ArrayList<String> blankList) {
		System.out.println("\nQUESTION 8 -----------------------");

		// ENSURING THE NEW ARRAY EXISTS AND IS CLEAR OF ANY VALUES
		blankList.clear();

		// FOR EACH LOOP TO ITERATE THROUGH list ARRAYLIST AND THEN ADDING TO NEW LIST
		for (String elements2copy : list) {
			blankList.add(elements2copy);
		}
		System.out.println(blankList); // PRINTING OUT COPIED LIST
		System.out.println("(Copied elements from an ArrayList into a blank ArrayList)");

		// BE ADVISED addAll() WILL POINT TO AND NOT ASSIGN VALUES, THERE FOR AVOIDED
		// USE
		// IMPLEMENTED TO RESET blankList ARRAY TO RESET TEST
		blankList.clear();

	}

	// 9.COMPARING : WRITE A METHOD THAT WILL COMPARE TWO ARRAYLISTS, PRINTING OUT
	// WHICH ELEMENTS THEY HAVE IN COMMON.
	private static void comparing(ArrayList<String> list, ArrayList<String> list2) {
		System.out.println("\nQUESTION 9 -----------------------");

		// FOR ENHANCED LOOPS FOR BOTH ARRAYS AND COMPARING THEM THEN PRINTING IF
		// .equalsIgnoreCase()
		for (String elements1 : list) {
			for (String elements2 : list2) {
				if (elements1.equalsIgnoreCase(elements2)) {
					System.out.println("\"" + elements1 + "\" Has been matched in both ArrayLists!");
				}
			}
		}
		System.out.println("(Printing out all matching elements in two ArrayLists)");
	}

	// 10.APPENDING : WRITE A METHOD THAT WILL APPEND THE CONTENTS OF ONE ARRAYLIST TO ANOTHER.
	private static void appending(ArrayList<String> list, ArrayList<String> list2) {
		System.out.println("\nQUESTION 10 -----------------------");
		
		//ONE METHOD TO COMPLETE THIS REQUIREMENT
		list.addAll(list2);
		System.out.println(list);
		System.out.println("(Appended both ArrayList)");
		
		// IMPLEMENTED TO RESET list2(colors2) ARRAY TO RESET TEST
		list2.clear();
		list2.addAll(Arrays.asList("Yellow", "Blue", "Pink"));
	}

	// 11.LOOPING : WRITE A METHOD THAT WILL PRINT OUT EACH ELEMENT OF YOUR ARRAYLIST USING A FOR-EACH LOOP.
	private static void looping(ArrayList<String> list) {
		System.out.println("\nQUESTION 11 -----------------------");

		// FOR LOOP IS USED FOR ADDING COMMAS, BUT THERE IS
		// A CORRECT NESTED FOR EACH LOOP TO SATISFY REQUIREMENT
		int counter = 1;
		for (String element : list) {
			String comma = ". ";
			if (counter != list.size()) {
				comma = ", ";
			} else if (counter == list.size()) {
				System.out.printf("and ");

			} else {
				comma = ".";
			}
			System.out.printf(element + comma);
			counter++;
		}
		System.out.println("\r\n(Printed out all the elements in the ArrayList)");
	}

	// 12.CONVERTING : WRITE A METHOD THAT WILL CONVERT A REGULAR ARRAY TO AN
	// ARRAYLIST.
	private static void converting(String[] regularArray) {
		System.out.println("\nQUESTION 12 -----------------------");
		ArrayList<String> newArrList = new ArrayList<String>(Arrays.asList(regularArray));
		System.out.println(newArrList);
		System.out.println("(Converted a regular Array to an ArrayList)");
		// IMPLEMENTED TO RESET newArrList ARRAY TO RESET TEST
		newArrList.clear();
	}
}
