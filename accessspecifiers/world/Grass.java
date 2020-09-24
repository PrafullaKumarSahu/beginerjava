/**
 * 
 */
package beginerjava.accessspecifiers.world;

import beginerjava.accessspecifiers.Plant;

/**
 * @author prafullakumarsahu
 *
 */
public class Grass extends Plant{

	/**
	 * 
	 */
	public Grass() {
		this.name = "Oak";
		//this.type = "tree"; //private not visible
		this.size = "medium"; //protected visible in child class out side the package
		//this.height = 10; //no-access specifier or package level - not visible outside package
	}

}
