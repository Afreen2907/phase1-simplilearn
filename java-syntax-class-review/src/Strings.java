
public class Strings {

	public static void main(String[] args) {
		char letter = 'a';
		
		//these lines of codes are bad practice
//		String s1 = new String("Hello");
//		String s2 = new String("Hello");
		//why? when the object is created, heap memory will be filled and it will reduce the performance
		
//		String s1 = "Hello";
//		String s2 = "Hellow"; //best practice 
		//Why is it a best practice?
//		in the heap memory, only one object will be used by string pool and it does not reduce the performance
		
		String string1 = "Hello";
		String string2 = "World";
		String string3 = "";
		string3 = string1 + string2; //concatenate strings
		
		System.out.println("Output: " + string3 + " " + letter) ;
		//String objects are immutable

	}

}
