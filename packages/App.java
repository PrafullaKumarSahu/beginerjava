/**
 * 
 */
package beginerjava.packages;

import com.prafullakumarsahu.oceangames.AquariumGame;

import beginerjava.packages.ocean.Crocodile;
import beginerjava.packages.ocean.fish.Salmon;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Crocodile croco = new Crocodile();
		
		Salmon salmon = new Salmon();
		
		AquariumGame aquarium = new AquariumGame();
	}

}
