/**
 * 
 */
package beginerjava.transientandserialversionuids;

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
			Person person = (Person)os.readObject();
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
