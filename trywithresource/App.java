/**
 * 
 */
package beginerjava.trywithresource;

import java.io.BufferedReader;
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
		try (Pet pet = new Pet()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//File reading
		String filePath = System.getProperty("user.dir") + "//src//beginerjava//trywithresource//file.txt";
		
		try(BufferedReader file = new BufferedReader(new FileReader(filePath)))	{
			String str;
			while ((str = file.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
