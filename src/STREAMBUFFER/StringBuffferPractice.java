package STREAMBUFFER;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class StringBuffferPractice {

	public static void main(String[] args) {

		// initializing, appending, inserting(also array)
//		slide1();
		
		// modified slide 1 with different array type
//		slide1modified();

		// deleting, deleting at, replacing
//		deleting();
		
		//appending and inserting STRING into string buffer
//		addStr();
		
//		testSetLength();
		
		//reversing
//		reverse();
		
		//STRING JOINER
//		strJoin();
		
		//STRING JOINER EX 2
		
		
		//Remove duplicate , YOU INSERT THE ARRAYLIST INTO A TREESET IN THE () AND SPIT IT BACK OUT AS A NEW ARRAY LIST
		// THE DUPLICATES WILL BE REMOVED BECAUSE TREESET CANNOT HAVE ANY DUPES
//		rmvDupes();
		
		//list of names of a cvs file, produce 2nd list with no dupes, count how many 
		//times it appears, output should be string number column name
//		rmvDupesWithCounter();
	}



	private static void slide1() {
		System.out.println("\r\n------slide1-(INITIALIZING, APPENDING, INSERTING (INCLUDING ARRAY)--");
		StringBuffer str = new StringBuffer("PerScholas");
		int len = str.length();
		int capt = str.capacity();
		System.out.println("length  = " + len);
		System.out.println("capacity = " + capt);

		System.out.println("------------");

		str.append("Platform");
		System.out.println(str);
		System.out.println("------------");

		str.append(1);
		System.out.println(str);
		System.out.println("------------");

		str.insert(5, "for");
		System.out.println(str);
		System.out.println("------------");

		str.insert(0, 5);
		System.out.println(str);
		System.out.println("------------");

		str.insert(3, true);
		System.out.println(str);
		System.out.println("------------");

		char geeks_arr[] = { 'b', 'y' };
		str.insert(2, geeks_arr);
		System.out.println(str);

	}

	private static void slide1modified() {
		System.out.println("\r\n------slide 1modifed-(TESTING OTHER ARRAY DATA TYPES------------");
		StringBuffer str = new StringBuffer("PerScholas");
		int len = str.length();
		int capt = str.capacity();
		System.out.println("length  = " + len);
		System.out.println("capacity = " + capt);

		System.out.println("----------------------------");

		str.append("Platform");
		System.out.println(str);
		System.out.println("------------");

		str.append(1);
		System.out.println(str);
		System.out.println("------------");

		str.insert(5, "for");
		System.out.println(str);
		System.out.println("------------");

		str.insert(0, 5);
		System.out.println(str);
		System.out.println("------------");

		str.insert(3, true);
		System.out.println(str);
		System.out.println("------------");

		int geeks_arr[] = { '1', '2' }; // USE CHAR TO INSERT, ANY OTHER TYPE WILL THROW ADDRESS
		str.insert(2, geeks_arr);
		System.out.println(str);
	}
	
	private static void deleting() {
		System.out.println("\r\n------slide 2-(DELETING AND REPLACING)--------------------");
		StringBuffer str = new StringBuffer("PerScholas");
		str.delete(0,3); // deletes 0-3 then puts the new string in pos 0
		System.out.println(str);
		str.deleteCharAt(4);
		System.out.println(str);
		str.replace(2,4,"by");
		System.out.println(str);
		
		
		str = new StringBuffer("PerScholas");
		str.replace(9, 10, "ADDED");
		System.out.println(str);
		
		int len = str.length();
		int capt = str.capacity();
		System.out.println("length  = " + len);
		System.out.println("capacity = " + capt);
	}
	
	private static void addStr() {
		System.out.println("\r\n------addStr-(ADDING STRING)--------------------------------");
		StringBuffer str = new StringBuffer("Perscholas");
		String adder = "ADDER";
		
		str.append(adder);
		System.out.println(str);
		System.out.println("--------------");
		
		str.insert(3, adder);
		System.out.println(str);
		System.out.println("--------------");
		
	}
	
	private static void testSetLength() {
		System.out.println("\r\n------ testSetLength-(testSetLength)--------------------------------");
		StringBuffer str = new StringBuffer("PerScholas");
		str.setLength(5);
		System.out.println(str);
		str.setLength(10);
		System.out.println(str);
		System.out.println("Once you set length to smaller than the string length, you will lose "
				+ "\rthat data, if you try to resize it back, you will not get that string that was "
				+ "\rdeleted back");
	}
	
	private static void reverse() {
		System.out.println("\r\n------REVERSE()-(reversing)--------------------");
		StringBuffer str = new StringBuffer("PerScholas");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		System.out.println("Reverses the string, cool!");
	}

	private static void strJoin() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Ram");
		al.add("Shyam");
		al.add("Alive");
		al.add("Bob");
		StringJoiner sj1 = new StringJoiner(",");
		sj1.setEmptyValue("sj1 is empty");
		System.out.println(sj1 + "prnting empty");
		
		sj1.add(al.get(0)).add(al.get(1));
		System.out.println(sj1);
		System.out.println("Length of sj1 : " + sj1.length());
		
		StringJoiner sj2 = new StringJoiner(":");
		sj2.add(al.get(2)).add(al.get(3));
		sj1.merge(sj2);
		System.out.println(sj1.toString());
		System.out.println("Length of new sj1 : " + sj1.length());
	}

	private static void rmvDupes() {
		
		ArrayList<String> al = new ArrayList<>();
		
			al.add("Ram");
			al.add("Ram");
			al.add("Alive");
			al.add("Alive");
			al.add("Alive");
			al.add("Bob");
			al.add("Bob");
			al.add("Bob");
			al.add("Bob");
		
		TreeSet<String> ts = new TreeSet<String>(al);
		
		ArrayList<String> al2 = new ArrayList<>(ts);
		
		System.out.println("ArrayList from treeset printed out : " + al2);
		
		StringJoiner sj = new StringJoiner(",");


		for (String element : al2) {
			sj.add(element);
		}
		
		System.out.println("String joiner printed out : " + sj);
		
	}

//	private static void rmvDupesWithCounter() {
//		
//		List<String> arrl = new ArrayList<String>();
//
//		HashMap<String, Integer> fixer = new HashMap<String, Integer>();
//
//		arrl.add("Ram");
//		arrl.add("Ram");
//		arrl.add("Alive");
//		arrl.add("Alive");
//		arrl.add("Alive");
//		arrl.add("Bob");
//		arrl.add("Bob");
//		arrl.add("Bob");
//		arrl.add("Bob");
//		
//		for (String element : arrl) {
//		fixer.put(element, Collection.frequency(arrl, element));
//		System.out.println(fixer);
//		}
//			
//			
//	}

}
