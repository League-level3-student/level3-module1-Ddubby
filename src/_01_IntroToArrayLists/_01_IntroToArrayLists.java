package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		strings.add("1");
		strings.add("2");
		strings.add("3");
		strings.add("4");
		strings.add("5");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}

		// 4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i += 2) {
			String s = strings.get(i);
			System.out.println(s);
		}
		// 6. Print all the Strings in reverse order.
		for (int i = strings.size() - 1; i >= 0; i--) {
			String s = strings.get(i);
			System.out.println(s);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		ArrayList<String> e = new ArrayList<String>();
		e.add("e");
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			Integer.parseInt(s);
			if (s == e.get(0)) {
				System.out.println(s);
			}
		}

	}
}
