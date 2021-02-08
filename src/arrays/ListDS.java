package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListDS {

	public static void main(String[] args) {
		/********************
		 * // ArrayList
		 ********************/

		ArrayList<String> list = new ArrayList<String>();// Creating arrayList
		list.add("Mango");// Adding object in arrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Printing the arrayList object
		System.out.println(list);

		// using iterator
		Iterator<String> itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}

		// Enhanced for loop
		for (String fruit : list) {
			System.out.println(fruit);
		}

		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		list.set(1, "Dates");

		Collections.sort(list);

		/********************
		 * // Set - uses mechanism of hashing, unique elements only, allow null values,
		 * non-synchronized, does not maintain insertion order, best approach for search
		 * operation, initial capacity is 16
		 ********************/
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Two"); // will be ignored

		System.out.println("List: " + set);

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);

		System.out.println("Updated List: " + set);

		set.removeAll(set1);

		set.removeIf(str -> str.contains("Vijay"));

		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);

		/********************
		 * // LinkedHashSet - non-synchronized, allow null elements, maintain insertion
		 * order
		 ********************/
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("One");
		set2.add("Two");
		set2.add("Three");
		set2.add("Four");
		set2.add("Five");
		Iterator<String> i = set2.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		/********************
		 * // TreeSet - non-synchronized, does not allow null elements, retrieval time is
		 * quiet fast, store in ascending order
		 ********************/
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		// Traversing elements
		Iterator<String> itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
