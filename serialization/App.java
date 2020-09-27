/**
 * 
 */
package beginerjava.serialization;

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
		
		System.out.println(person1);
		System.out.println(person2);
		
		WriteObjects.write(person1);
		WriteObjects.write(person2);
		
		ReadObjects.read(System.getProperty("user.dir") + "//src//beginerjava//serialization/people.log");
	}

}
