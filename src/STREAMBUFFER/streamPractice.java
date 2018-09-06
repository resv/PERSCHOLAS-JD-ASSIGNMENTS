package STREAMBUFFER;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class streamPractice {

	public static void main(String[] args) {

//-----------------------OLD METHOD ---------------------------------------
		List<String> names = new ArrayList<String>();
		names.add("Tristan");
		names.add("David");
		names.add("Adam");
		names.add("Kumar");
		names.add("Tanjim");
		names.add("Marcial");

		List<String> names2 = new ArrayList<String>();

		for (String element : names) {

			if (element.indexOf('T') == 0 || element.indexOf('A') == 0) {

				names2.add(element.toUpperCase());

			} else {
				names2.add(element);
			}
		}

		for (String element2 : names2) {
			System.out.println(element2);
		}

		TreeSet<String> treesorter = new TreeSet<String>(names2);
		System.out.println(treesorter);

//------------------------NEW METHOD--------------------------------------

		names.stream().filter(s -> s.startsWith("T") || s.startsWith("S")).map(String::toUpperCase).sorted()
				.forEach(s -> {

					System.out.println(s);
				});
	}
}
