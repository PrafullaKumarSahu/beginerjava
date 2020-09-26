/**
 * 
 */
package beginerjava.exceptionthrowing;

/**
 * @author prafullakumarsahu
 *
 */
public class Animal {

	public static void eatGrass() throws CanNotEatGrassException {
		int a;
		a = 5;
		if (a > 2) {
			throw new CanNotEatGrassException("This is a lion, it do not eat grass.");
		}
		System.out.println("It is eating grass.");
	}

}
