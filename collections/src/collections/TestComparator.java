package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = new ArrayList<>();
		Comparator<Student> sortName = new StudentSortName();
		Comparator<Student> sortGpa = new StudentSortGpa();
		
		studentList.add(new Student ("Thomas Jefferson", 111, 3.8));
		studentList.add(new Student("John", 222, 3.9));
		studentList.add(new Student("George", 333, 3.4));
		
		Collections.sort(studentList, sortGpa);
		
		for(Student student: studentList) {
			System.out.println(student);
		}

	}

}
