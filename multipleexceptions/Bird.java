/**
 * 
 */
package beginerjava.multipleexceptions;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;
import java.nio.file.FileAlreadyExistsException;




/**
 * @author prafullakumarsahu
 *
 */
public class Bird {
	public static void fly() throws FileNotFoundException, UnknownHostException {
		int number = 1;
		switch(number) {
			case 1:
				throw new FileNotFoundException("File not found");
		case 3:
				throw new UnknownHostException();
		default:
				System.out.println("Bird is flying.");
		}
	}
}
