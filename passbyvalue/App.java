/**
 * 
 */
package beginerjava.passbyvalue;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value = 0;
		System.out.println("1: " + value);
		show(value);
		System.out.println("4: " + value);
		
		Pet brownee = new Pet("Brownee");
		System.out.println("1: " + brownee);
		show(brownee);
		System.out.println("4: " + brownee);
	}

	private static void show(int value) {
		System.out.println("2: " + value);
		value = 1;
		System.out.println("5: " + value);
	}
	
	private static void show(Pet pet) {
		System.out.println("2: " + pet);
		pet.setName("skyl");
		System.out.println("3: " + pet);
		pet = new Pet("Black");
		System.out.println("4: " + pet);
	}

}
