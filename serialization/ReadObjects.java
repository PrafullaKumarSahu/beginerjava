/**
 * 
 */
package beginerjava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author prafullakumarsahu
 *
 */
public class ReadObjects {

	public static void read(String file) {
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(file))){
			Person person1 = (Person)os.readObject();
			Person person2 = (Person)os.readObject();
			System.out.println(person1);
			System.out.println(person2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
