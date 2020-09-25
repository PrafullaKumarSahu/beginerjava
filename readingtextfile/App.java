/**
 * 
 */
package beginerjava.readingtextfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String path = System.getProperty("user.dir") + "/src/beginerjava/readingtextfile/file.txt";
		File file = new File(path);
		
		Scanner scannedFile = new Scanner(file);
		
		System.out.println(scannedFile.nextInt());
		scannedFile.nextLine();
		
		int count = 2;
		while (scannedFile.hasNextLine()) {
			System.out.print(count + ": ");
			System.out.println(scannedFile.nextLine());
			count++;
		}
		
		scannedFile.close();
	}

}
