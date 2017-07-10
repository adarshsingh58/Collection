package online.mrwallet.www.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		arrayList();
		linkedListAsImplementationOfList();
		linkedListAsImplementationOfQueue();
		linkedListAsImplementationOfDeQueue();
		
	}

	private static void linkedListAsImplementationOfDeQueue() {
	}

	private static void linkedListAsImplementationOfQueue() {
		System.out.println("\n LinkedList as an implementation of List-------");
		Queue<String> queue=new LinkedList<>();
		queue.add("Adarsh");
		queue.add("Akanksha");
		queue.add("Jatin");
		queue.add("Ritesh");
		queue.add("Prakhar");
		
		System.out.println("First Element in Queue:"+queue.peek());
		System.out.println("First Element is being removed, which is:"+queue.poll());
		System.out.println("After Polling,First Element in Queue:"+queue.peek());
		
		System.out.println("Adding name as last elemnt in Queue i.e. at tail");
		queue.offer("Last NAme");
		for(String name:queue)
		{
			System.out.println(name);
		}
	}

	private static void linkedListAsImplementationOfList() {
		System.out.println("\n LinkedList as an implementation of List-------");
		List<String> list=new LinkedList<>();
		list.add("Adarsh");
		list.add("Jatin");
		list.add("Akanksha");
		list.add("ritesh");
		list.add("Prakhar");
		
		for(String name:list)
		{
			System.out.println(name);
		}
	}

	private static void arrayList() {
		System.out.println("\n ArrayList-------");
		List<String> list=new ArrayList<>();
		list.add("Adarsh");
		list.add("Jatin");
		list.add("Akanksha");
		list.add("ritesh");
		list.add("Prakhar");
		
		for(String name:list)
		{
			System.out.println(name);
		}
	}
}