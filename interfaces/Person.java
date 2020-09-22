/**
 * 
 */
package beginerjava.interfaces;

/**
 * @author prafullakumarsahu
 *
 */
public class Person implements Info {

	public void displayInfo() {
		System.out.println("I am person, I do not have version.");
	}
	
	public void greet() {
		System.out.println("Hello everyone!");
	}
}
