package errorHandling;

import java.io.FileNotFoundException;

public class ThrowException {

	public void readFiles(String file) throws FileNotFoundException {
		boolean found = findFile (file);
		
		if (!found) {
			throw new FileNotFoundException("missing file");
		} else {
			// code to read file
		}
	}

	private boolean findFile(String file) {
		// TODO Auto-generated method stub
		return false;
	}
}
