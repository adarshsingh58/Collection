package online.mrwallet.www.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OverridingHashcoedAndEquals {

	public static void main(String[] args) {
//		String a=new String();
//		System.out.println(a.hashCode());
		
		Person person1=new Person("Adarsh", 24);
		System.out.println(person1.hashCode());

		Person person2=new Person("Jatin", 25);
		System.out.println(person2.hashCode());

		Person person3=new Person("Ritesh", 26);
		System.out.println(person3.hashCode());
		
		Map<Person, String> map=new HashMap<>();
		map.put(person1, "person1");
		map.put(person2, "person2");
		map.put(person3, "person3");
		
		long initialTime=System.nanoTime();
		for(Entry<Person, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("Time DIfference:"+(System.nanoTime()-initialTime));
	
	}
}
