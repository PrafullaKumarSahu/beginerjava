/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Numbers
		
		int fooInt;
		
		fooInt = 5; //integer -> 32 bit 
		
		short fooShort = 500; //short -> 16 bit
		
		long fooLong = 50000; //long -> 64 bit
		
		float fooFloat = 35465466.66f; //float -> 32 bit
		
		double fooDouble = 4467655666788888888888.755; //double -> 64 bit
		
		
		System.out.println(fooInt + " is an integer and it is "+ Integer.BYTES + "bytes in java.");
		System.out.println(fooShort + " is an short integer and it is " + Short.BYTES + "bytes in java.");
		System.out.println(fooLong + " is an long integer and it is "+ Long.BYTES +"bytes in java.");
		System.out.println(fooFloat + " is an float and it is "+ Float.BYTES +"bytes in java.");
		System.out.println(fooDouble + " is an double and it is "+ Double.BYTES +"bytes in java.");
		
		
		//Characters
		char myChar = 'c';
		System.out.println("Single quoted single character is an character constant eg: " + myChar + ". It takes " + Character.BYTES);
		
		//Boolean
		boolean falseBool = false;
		boolean trueBool = true;
		System.out.println("Boolean is either " + falseBool + " or " + trueBool + ". Boolean takes 1byte in java.");
		
		//Byte
		byte fooByte = 127;
		System.out.println(fooByte + " is a byte, takes "+ Byte.BYTES +" byte in java.");
		
		
	}

}
