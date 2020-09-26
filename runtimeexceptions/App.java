/**
 * 
 */
package beginerjava.runtimeexceptions;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = null;
		System.out.println(str.length()); //will throw a run time NullPointerException
		
		int[] arr = {};
		System.out.println(arr[1]); //will throw a run time ArrayIndexOutOfBoundException
	}

}
