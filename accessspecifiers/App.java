/**
 * 
 */
package beginerjava.accessspecifiers;

/**
 * @author prafullakumarsahu
 *
 */

/**
 * private:- only within the class
 * protected:- on same package as well as on  child class
 * no-access specifier:- only on same package
 * public:- from any where
 *
 * */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		//System.out.println(plant.type); private can not be accessed outside the class
		System.out.println(plant.size); // protected - visible in same package
		System.out.println(plant.height); // no-access specifier / package level access specifier, visible inside package
	}

}
