package hashTables;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTablesDS {
	public static void main(String[] args) {
		/**************
		 * // HashMap - unique keys only, may have one null key and multiple null
		 * values, non-synchronized, maintains no order, default capacity is 16
		 *************/
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, null);
		map.put(4, "Grapes");
		map.put(1, "Grapes"); // trying duplicate key - will replace data
		map.putIfAbsent(3, "Banana"); // if absent

		// map.putAll(hashMap);

		map.remove(1); // key or value based removal
		map.remove(3, "Banana"); // key and value both

		map.replace(2, "Krunal");

		map.replaceAll((k, v) -> "Krunal");

		System.out.println("Iterating Hashmap...");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		/**************
		 * // LinkedHashMap - same as hashMap but maintain insertion order
		 *************/

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		/**************
		 * // TreeMap - can not have null key, but can have multiple null values,
		 * non-synchronized, maintain ascending order
		 *************/

		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(100, "Amit");
		map2.put(102, "Ravi");
		map2.put(101, "Vijay");
		map2.put(103, "Rahul");

		for (Map.Entry<Integer, String> m : map2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		// SortedMap<Integer,String> map=new TreeMap<Integer,String>();

		// Maintains descending order
		System.out.println("descendingMap: " + map2.descendingMap());

		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("headMap: " + map2.headMap(102, true));

		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map2.tailMap(102, true));

		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map2.subMap(100, false, 102, true));

		/**************
		 * // HashTable - it is array of list, does not allow null key or value,
		 * synchronized, default capacity is 11
		 *************/

		Hashtable<Integer, String> hm2 = new Hashtable<Integer, String>();

		hm2.put(100, "Amit");
		hm2.put(102, "Ravi");
		hm2.put(101, "Vijay");
		hm2.put(103, "Rahul");

		hm2.getOrDefault(101, "Not Found");
		hm2.putIfAbsent(104, "Krunal");

		for (Map.Entry<Integer, String> m : hm2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
