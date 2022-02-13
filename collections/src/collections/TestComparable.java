package collections;

import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<ComparableStudent> studentList = new TreeSet<>();
		
		studentList.add(new ComparableStudent ("Thomas Jefferson", 111, 3.8));
		studentList.add(new ComparableStudent("John", 222, 3.9));
		studentList.add(new ComparableStudent("George", 333, 3.4));
		
		for(ComparableStudent student: studentList) {
			System.out.println(student);
		}

	}

}
