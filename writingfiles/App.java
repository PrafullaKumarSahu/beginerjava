/**
 * 
 */
package beginerjava.writingfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(BufferedWriter file = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir") + "//src//beginerjava//writingfiles//file.txt")))){
			file.write("What is Lorem Ipsum?");
			file.newLine();
			file.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
			file.newLine();
			file.write("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n" + 
					"when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
			file.newLine();
			file.write("It has survived not only five centuries, but also the leap into electronic typesetting,\n" + 
					"remaining essentially unchanged.");
			file.newLine();
			file.write("It was popularised in the 1960s with the release of Letraset\n" + 
					"sheets containing Lorem Ipsum passages, and more recently with desktop publishing software\n" + 
					"like Aldus PageMaker including versions of Lorem Ipsum.\n" + 
					"");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
