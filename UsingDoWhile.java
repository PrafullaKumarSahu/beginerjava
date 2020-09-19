/**
 * 
 */
package beginerjava;

import java.util.Scanner;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		
		while(input.nextInt() != 5) {
			System.out.println("Please enter a number");
			input = new Scanner(System.in);
		}
		
		System.out.println("got 5!");
		*/
		
		/* We can remove the repetition of statements doing same job */
		Scanner scannerInput = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.println("Please enter a number");
			input = scannerInput.nextInt();
		} while(input != 5);
		System.out.println("Got 5!");
		scannerInput.close();
	}

}
