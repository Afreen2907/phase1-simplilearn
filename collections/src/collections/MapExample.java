package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> partList = new TreeMap<>();
		
		partList.put("s0001", "Blue polo shirt");
		
		partList.put("s0002", "Black polo shirt");
		partList.put("h0001", "Duke Hat");
		
		partList.put("s0002", "Black  T-shirt");
		
		Set<String> keys = partList.keySet(); //returns the set
//		System.out.println(keys);
		for(String key: keys) {
			System.out.println("Part#: " + key + " " + partList.get(key));
		}

	}

}
