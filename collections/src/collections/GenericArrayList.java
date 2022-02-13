package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
List<Integer> partList = new ArrayList<>();
		
		partList.add(1);
		partList.add(3);
//		partList.add("a string");
		partList.add(1, 2);
		
		for (Integer partnumberObj: partList) {
			int partNumber = partnumberObj;
			System.out.println("Part Number: " + partNumber); //autoboxing
		}
//		Iterator elements = partList.iterator();
//		while(elements.hasNext()) {
//			Integer PartListObject = (Integer) (elements.next());
//			int partNumber = (int) PartListObject.intValue();
//			
//			System.out.println("Part Number: " + partNumber);
//		}

	}

}
