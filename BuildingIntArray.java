/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class BuildingIntArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values;
		values = new int[3];
		
		System.out.println(values[0]); //default value 0
		System.out.println(values[1]); //default value 0
		System.out.println(values[2]); //default value 0
		
		values[0] = 100;
		values[1] = 200;
		values[2] = 300;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		int[] numbers = {1000, 2000, 3000};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
