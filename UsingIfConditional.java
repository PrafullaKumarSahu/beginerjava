/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingIfConditional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		unNecessaryElse();
		conditionalValueAssignment();
		returnTheIndexedValue();
		
		//beside all these we can use using interface segregation principle of SOLID principle
		// and implementing strategy pattern also can do a brilliant job in eliminating if else
	}
	
	private static int unNecessaryElse() {
		int a = 10;
		int b = 5;
		
//		if (a<b) {
//			return a;
//		} else {
//			return b;
//		}
		
		//In above code else seems unnecessary and can be skipped
		if (a<b) {
			return a;
		}
		return b;
	}
	
	private static void conditionalValueAssignment() {
		int a = 10;
		int b = 5;
		int c;
		
		if (a > b) {
			c = a;
		} else if(a == b) {
			c = b;
		} else {
			c = 0;
		}
		
		System.out.println("Value of C is " + c);
		
		//We can set default value for c and eliminate else, we can separate the 2 ifs instead of else if
		c = 0;
		if (a > b) c = a;
		if (a == b) c = b;
		
		System.out.println("Value of C is " + c);
		
		//also we can use ternary operator, but using 2 ifs seems simple
		c = 0;
		c = (a > b) ? a : (a == b ? b : 0);
		
		System.out.println("Value of C is " + c);
		
	}
	
	private static void returnTheIndexedValue() {
		int a = 2;
		int b;
		
		if (a == 0) {
			b = 100;
		} else if (a == 1) {
			b = 200;
		} else if (a == 2) {
			b = 300;
		} else if (a == 3) {
			b = 400;
		}
		
		// instead put the values in an array
		// something like dictionary in Python, HashMap in java and associative array in PHP can perform this type of job efficiently
		int [] arr = {100, 200, 300};
		b = arr[a];
		System.out.printf("B is %d", b);
	}
}
