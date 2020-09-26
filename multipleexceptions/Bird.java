/**
 * 
 */
package beginerjava.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.file.FileAlreadyExistsException;




/**
 * @author prafullakumarsahu
 *
 */
public class Bird {
	public static void fly() throws FileNotFoundException, UnknownHostException, IOException {
		int number = 1;
		switch(number) {
			case 1:
				throw new FileNotFoundException("File not found");
		case 2:
				throw new UnknownHostException();
		case 3:
			throw new IOException();
		default:
				System.out.println("Bird is flying.");
		}
	}
}
