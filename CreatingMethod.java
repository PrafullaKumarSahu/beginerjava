/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Person { 
	String name;
	int age;
	
	public void speak() {
		System.out.println(name + " is speaking.");
	}
}

public class CreatingMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "person1";
		person.age = 30;
		person.speak();

	}

}
