/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		//Compiler do not create extra memory for same string
		String str1 = "Hello World";
		String str2 = "Hello World";
		System.out.println("Identity hashcode of string1 " + System.identityHashCode(str1));
		System.out.println("Identity hashcode of string1 " + System.identityHashCode(str2));
		
		//String is immutable?
		String str = "Say hello!";
		System.out.println("Identity hashcode of string str with initial value: " + System.identityHashCode(str));
		str = "Do not say hello!";
		System.out.println("Identity hashcode of string str after assigning a different value: " + System.identityHashCode(str));
		
		System.out.println(str);
		str1+=str;
		//str1 is a new string and stored in different location
		System.out.println("After concatination Identity hashcode of string1 is different now it is " + System.identityHashCode(str1));
		System.out.println("while Identity hashcode of string2 same as earlier " + System.identityHashCode(str2));
		
		
		//We can concatenate string objects
		String hello = "Hello";
		String blank = " ";
		String world = "World!";
		
		System.out.println(hello+blank+world);

	}

}
