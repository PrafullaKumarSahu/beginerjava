/**
 * 
 */
package beginerjava.serializingmultipleobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author prafullakumarsahu
 *
 */
public class ReadObjects {

	public static void read(String file) {
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(file))){
			Person[] People = (Person[])os.readObject();
		
			for (Person person: People) {
				System.out.println(person);
			}
			
			int num = os.readInt();
			
			for (int i=0; i<num; i++) {
				Person person = (Person)os.readObject();
				System.out.println(person);
			}
			
			@SuppressWarnings("unchecked")
			ArrayList<Person> persons = (ArrayList<Person>)os.readObject();
			
			for (Person person: persons) {
				System.out.println(person);
			}
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
