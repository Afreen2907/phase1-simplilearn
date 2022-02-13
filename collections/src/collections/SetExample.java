package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(); //sorts in alphabetical order and duplicate elements are not added
		
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("three");
		
		for (String item: set) {
			System.out.println("Item: " + item);
		}

	}

}
