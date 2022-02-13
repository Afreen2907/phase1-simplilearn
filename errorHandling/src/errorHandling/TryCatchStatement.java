package errorHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchStatement {

	public static void main(String[] args) {
		InputStream in = null;
		try {
			System.out.println("About to open a file");
			in = new FileInputStream("missingFile1.txt");
			System.out.println("File Open");
			
			int data = in.read();
			in.close();
		}
		catch(IOException e) {
			System.out.println(e.getClass().getName());
			System.out.println("Quitting");
		}finally {
			try {
				if( in != null) in.close();
			} catch(IOException e) {
				System.out.println("Failed to close file");
			}
		}

	}

}
