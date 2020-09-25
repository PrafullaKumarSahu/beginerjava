/**
 * 
 */
package beginerjava.generics;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author prafullakumarsahu
 *
 */
public class Basic {

	public static void main(String[] args) {
		//Before Java5
		ArrayList fruits = new ArrayList();
		fruits.add("Banana");
		fruits.add("Apple");
		
		String apple= (String)fruits.get(1);
		System.out.println(apple);
		
		
		//Modern style
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Horse");
		animals.add("Bear");
		
		String horse = animals.get(1);
		System.out.println(horse);
		
		//Different types of arguments
		HashMap <Integer, String> map = new HashMap<Integer, String>();
		
		//Java7 style
		ArrayList<Integer> list = new ArrayList<>();
		
	}
}
