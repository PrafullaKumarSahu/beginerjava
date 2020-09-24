/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class NumericalCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue; // explicit conversion
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue); // Implicit conversion
		
		floatValue = intValue;
		System.out.println(floatValue);
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//will not work as expected
		byteValue = (byte)128; //128 is too big for a byte
		System.out.println(byteValue);
		
	}

}
