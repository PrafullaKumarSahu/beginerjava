/**
 * 
 */
package beginerjava.filereaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		String path = System.getProperty("user.dir") + "/src/beginerjava/filereaders/file.txt";
		File file = new File(path);
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(FileNotFoundException e) {
			System.out.println(file.toString() + " not found.");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
