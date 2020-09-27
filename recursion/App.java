/**
 * 
 */
package beginerjava.recursion;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int i) {
		if (i == 1) {
			return 1;
		}
		return (i-1) * i;
		
	}

}
