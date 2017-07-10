package online.mrwallet.www.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Main {

	public static void main(String[] args) {
		
		hashMap();
		duplicateKeyWillOverwriteValue();
		oneNullKeyAllowedIn__HashMap();
		linkedHashMap();
		treeMap();
		weakHashMap();
		fullySynchronizedMap();

	}

	private static void oneNullKeyAllowedIn__HashMap() {
		System.out.println("\n One Null Key Allowed In HashMap----------------");
		
		Map<String, String> map = new HashMap<>();
		map.put(null, "1");
		map.put(null, "2");// This will override previous null value as only one is allowed
		System.out.println(map.get(null));
	}

	private static void duplicateKeyWillOverwriteValue() {
		System.out.println("\n Duplicate Key Will Overwrite Value----------------");
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("1", "2");
		System.out.println(map.get("1"));
	}

	/**
	 * We can always ise HAshTable for a synchronized map but if we already have
	 * a HAshMap and we want it be a synchronized map then Collections utility
	 * class offers us a method synchronizedMap() which does this job
	 */
	private static void fullySynchronizedMap() {

		System.out.println("\n FullySynchronizedMap----------------");
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "A");
		map.put("2", "a");
		map.put("3", "K");
		map.put("4", "N");
		map.put("5", "D");
		map.put("6", "E");
		map.put("7", "Z");
		map.put("8", "P");
		map.put("9", "Q");
		map.put("10", "Z");
		
		map=Collections.synchronizedMap(map);// This will turn our non=synchronized ma to synchronized one
		

	}

	/**
	 * In WeakHashMap if Key used has a weak reference i.e. no var is assigned
	 * for the refernece thn after garvage colelction the entry is removed i.e.
	 * collected by garbage
	 */
	private static void weakHashMap() {
		System.out.println("\n WeakHashMap----------------");
		Map<String, String> map = new WeakHashMap<>();
		map.put(new String("1"), "1");
		map.put(new String("2"), "2");
		map.put("3", new String("3"));

		System.out.println("\n Before garbage collection");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.gc();
		System.out.println("\n after garbage collection");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	/**
	 * Natural sorting in order of keys. Here coz key is String and we are
	 * putting 1,2,3.. here. We must know that 10 will come after 1 but before 2
	 * or 3 or 4 or .... Reason being , key is a string so it will evaluate
	 * numbers based on theor positions, first will come 1 then 10, then 11,
	 * then all starting with 2 and so on..
	 */
	private static void treeMap() {
		System.out.println("\n TreeMap----------------");
		Map<String, String> map = new TreeMap<>();
		map.put("1", "A");
		map.put("2", "A");
		map.put("3", "K");
		map.put("4", "N");
		map.put("5", "D");
		map.put("6", "E");
		map.put("7", "Z");
		map.put("8", "P");
		map.put("9", "Q");
		map.put("10", "Z");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	private static void linkedHashMap() {
		System.out.println("\n LinkedHashMap----------------");
		Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "A");
		map.put("2", "a");
		map.put("3", "K");
		map.put("4", "N");
		map.put("5", "D");
		map.put("6", "E");
		map.put("7", "Z");
		map.put("8", "P");
		map.put("9", "Q");
		map.put("10", "Z");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	private static void hashMap() {
		System.out.println("\n HashMap----------------");
		Map<String, String> map = new HashMap<>();
		map.put("1", "A");
		map.put("2", "a");
		map.put("3", "K");
		map.put("4", "N");
		map.put("5", "D");
		map.put("6", "E");
		map.put("7", "Z");
		map.put("8", "P");
		map.put("9", "Q");
		map.put("10", "Z");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
