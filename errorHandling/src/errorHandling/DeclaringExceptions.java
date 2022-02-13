package errorHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DeclaringExceptions {

	public static int readByteFromFile() throws IOException{
		try(InputStream in = new FileInputStream("a.txt")){
			System.out.println("File Open");
			return in.read();
		}
	}
	
	public static void main(String[] args) {
		try {
			int data = readByteFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
