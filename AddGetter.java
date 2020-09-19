/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Bird {
	String name;
	
	String getName() {
		return this.name;
	}
}
public class AddGetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bird peacock = new Bird();
		peacock.name = "Mayur";
		
		System.out.println(peacock.getName());
	}

}
