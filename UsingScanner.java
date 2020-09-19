/**
 * 
 */
package beginerjava;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


/**
 * @author prafullakumarsahu
 *
 */
public class UsingScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Ask for user input
		System.out.println("Enter something");
		
		//Read the line from command line
		String line = input.nextLine();
		
		//Print the input
		System.out.println("You entered: " + line);
		
		
		//Reading 1st line from url
		Scanner stream;
		try {
			stream = new Scanner(new URL("https://example.com").openStream());
			String firstLine = stream.nextLine();
			System.out.println("Reading example.com: \n" + firstLine);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reading content from url
		try {
			@SuppressWarnings("resource")
			String doc = new Scanner(new URL("https://example.net").openStream(), "UTF-8").useDelimiter("\\A").next();
			System.out.println("Reading example.com: \n" + doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reading file
		try {
			File file = new File(System.getProperty("user.dir") + "/src/beginerjava/file.txt");
			Scanner scannedFile = new Scanner(file);
			scannedFile.useDelimiter("\\Z");
			System.out.println(scannedFile.next());
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
