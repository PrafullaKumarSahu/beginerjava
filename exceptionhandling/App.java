/**
 * 
 */
package beginerjava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File path = new File("file.txt");
		try {
			FileReader file = new FileReader(path);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void openFile() throws FileNotFoundException {
		File path = new File("file.txt");
		FileReader file = new FileReader(path);
	}

}
