/**
 * 
 */
package beginerjava.exceptionthrowing;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		try {
			Animal.eatGrass();
		} catch (CanNotEatGrassException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
