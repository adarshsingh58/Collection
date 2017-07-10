package online.mrwallet.www.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		hashSet();
		linkedHashSet();
		treeSet();

	}

	private static void treeSet() {
		System.out.println("\n TreeSet----------------------");
		Set<String> states = new TreeSet<>();
		states.add("UP");
		states.add("UP"); // we tried to add duplicate here but set doesnt allow
							// duplicate. No error will be thron but duplicate
							// will not be stored
		states.add("AP");
		states.add("Karnataka");
		states.add("Delhi");
		states.add("Maharashtra");
		states.add("Punjab");
		states.add("Kashmir");

		System.out.println(
				"Order of data will be in Natural Order of input type of Set. In this case String. and Natural order of String is ascending order");
		for (String state : states) {
			System.out.println(state);
		}

	}

	private static void linkedHashSet() {
		System.out.println("\n Linked hash Set----------------------");
		Set<String> states = new LinkedHashSet<>();
		states.add("UP");
		states.add("UP"); // we tried to add duplicate here but set doesnt allow
		// duplicate. No error will be thron but duplicate
		// will not be stored
		states.add("AP");
		states.add("Karnataka");
		states.add("Delhi");
		states.add("Maharashtra");
		states.add("Punjab");
		states.add("Kashmir");

		System.out.println("Order of data will be same as order of insertion");
		for (String state : states) {
			System.out.println(state);
		}

	}

	private static void hashSet() {
		System.out.println("\n Hash Set----------------------");
		Set<String> states = new HashSet<>();
		states.add("UP");
		states.add("UP"); // we tried to add duplicate here but set doesnt allow
		// duplicate. No error will be thron but duplicate
		// will not be stored
		states.add("AP");
		states.add("Karnataka");
		states.add("Delhi");
		states.add("Maharashtra");
		states.add("Punjab");
		states.add("Kashmir");

		System.out.println("Diferent order of data will occur then order of addition");
		for (String state : states) {
			System.out.println(state);
		}
	}
}
