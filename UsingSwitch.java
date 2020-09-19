/**
 * 
 */
package beginerjava;

import java.util.Scanner;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter the command!");
		Scanner scanInput = new Scanner(System.in);
		String input = scanInput.nextLine();
		scanInput.close();
		
		switch (input) {
			case "start":
				System.out.println("System is started!");
			break;
			case "stop":
				System.out.println("System is stop!");
			break;
			default: //Default case
				System.out.println("Could not recognized the command, please retry!");
				//can be considered as false case, when nothing matches how you would like to handle it
				// we can consider throwing an exception here and handle it later when we are calling this	
		}
	}

}
