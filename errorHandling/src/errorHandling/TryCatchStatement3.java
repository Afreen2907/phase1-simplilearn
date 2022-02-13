package errorHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchStatement3 {

	public static void main(String[] args) {
		System.out.println("About to open a file");
		try (InputStream in = new FileInputStream("missingFile3.txt")){
			
			System.out.println("File Open");
			
			int data = in.read();
			in.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Quitting");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
