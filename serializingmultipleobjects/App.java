/**
 * 
 */
package beginerjava.serializingmultipleobjects;

import java.util.ArrayList;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person1 = new Person("Jon Jones", 32);
		Person person2 = new Person("israel adesanya", 31);
		
		Person[] people = {person1, person2};
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		
		WriteObjects.write(people);
		WriteObjects.writArayList(persons);
		
		ReadObjects.read(System.getProperty("user.dir") + "//src//beginerjava//serializingmultipleobjects//people.log");
	}

}
