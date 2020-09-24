/**
 * 
 */
package beginerjava.accessspecifiers;

/**
 * @author prafullakumarsahu
 *
 */
public class Oak extends Plant{

	/**
	 * 
	 */
	public Oak() {
		this.name = "Oak";
		//this.type = "tree"; //private not visible
		this.size = "medium"; // protected visible in child class in the same package 
		this.height = 10; // no-access specifier is visible in child class in the same package
	}

}
