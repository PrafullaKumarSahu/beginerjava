/**
 * 
 */
package beginerjava.transientandserialversionuids;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person("Khabib Nurmagomedov", 31);
		Person.setCount(29);
		
		System.out.println(person);
		
		WriteObjects.write(person);
		
		ReadObjects.read(System.getProperty("user.dir") + "//src//beginerjava//transientandserialversionuids//people.log");
	}

}
