package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDS {

	public static void main(String[] args) {
		// single dimensional
		String[] fruits = new String[10];
//		String[] fruits = {"Fruit-1","Fruit-2"};

		// insertion - O(1)
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = "Fruit-" + (i + 1);
		}

		// look up - O(1)
		System.out.println("Access First item - " + fruits[0]);

		// search - O(n)
		System.out.println("Searching for Fruit-5");
		for (String s : fruits) {
			if (s.equals("Fruit-5"))
				System.out.println("Found - "+s);
		}

		// deletion - O(n)
		List<String> list = new ArrayList<>(Arrays.asList(fruits));
		list.remove(4);
		System.out.println("Removed Fruit-5 \n");
		fruits = list.toArray(new String[list.size()]);
		
		for (String s : fruits) {
			System.out.print(s+", ");
		}
	}
}
