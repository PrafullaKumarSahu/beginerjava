/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Machine {
	private String name;
	private int version;
	
	public Machine() {
		System.out.println("Machine is up.");
	}
	
	public Machine(String name) {
		this(); // this refers to the constructor which needs no argument
		this.name = name;
		System.out.println(this.name + " is running.");
	}
	
	public Machine(String name, int version) {
		this("Y"); // this refers to constructor with argument
		this.name = name;
		this.version = version;
		System.out.println(this.name + " version is " + this.version);
	}
}
public class UsingConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Machine(); // constructor with no parameters
		new Machine("X"); // constructor with parameter
		new Machine("X", 1);
	}
	
	// The default constructor is inserted by compiler 
	// and has no code in it, 
	// on the other hand we can implement no-arg constructor in our class 
	// which looks like default constructor but we can provide any initialization code in it.

}
