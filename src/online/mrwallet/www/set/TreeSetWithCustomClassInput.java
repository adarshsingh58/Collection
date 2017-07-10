package online.mrwallet.www.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithCustomClassInput {

	public static void main(String[] args) {
		/*
		 * Here insetad of adding String as States we will add a class called
		 * States into Tree Set and see how natural Order Happens
		 */

		/*
		 * Now when we add our own class into TreeSet, we must eb sure to
		 * override toCompare() from comparable interface, because based on that only
		 * TreeSet sorts this class in natural order. FOr String and other basic Java Classes it is already defined. For custom classes
		 * we need to IMPLEMENTS Comparable and override tocompare which will define the natural order else we will get exception:
		 * Exception in thread "main" java.lang.ClassCastException: online.mrwallet.www.set.States cannot be cast to java.lang.Comparable
		 */
		treeSet();

	}

	private static void treeSet() {

		System.out.println("\n TreeSet----------------------");
		Set<States> states = new TreeSet<>();
		states.add(new States("UP"));
		states.add(new States("AP"));
		states.add(new States("Karnataka"));
		states.add(new States("Delhi"));
		states.add(new States("Maharashtra"));
		states.add(new States("Punjab"));
		states.add(new States("Kashmir"));

		System.out.println(
				"Order of data will be in Natural Order of input type of Set. In this case String. and Natural order of String is ascending order");
		for (States state : states) {
			System.out.println(state.getName());
		}

	}

}
