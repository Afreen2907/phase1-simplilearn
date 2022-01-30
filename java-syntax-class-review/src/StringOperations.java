
public class StringOperations {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello"); //string builder is mutable
		System.out.println("string sb: " + sb);

		sb.append(" world");
		System.out.println("string sb: " + sb);
		
		sb.append("!").append(" are").append(" you?");
		
		sb.insert(12, " How ");
		
		System.out.println(sb);
		System.out.println("Length: " + sb.length());
		
		//Get SubString
		System.out.println("Sub: " + sb.substring(0, 5));
	}

}
