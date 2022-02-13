package collections;

import java.util.*;

public class OldStyleArrayList {

	public static void main(String[] args) {
		List partList = new ArrayList();
		
		partList.add(new Integer(1));
		partList.add(new Integer(2));
		partList.add("a string");
		
		Iterator elements = partList.iterator();
		while(elements.hasNext()) {
			Integer PartListObject = (Integer) (elements.next());
			int partNumber = (int) PartListObject.intValue();
			
			System.out.println("Part Number: " + partNumber);
		}
	}

}
