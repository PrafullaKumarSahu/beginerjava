/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Animal {
	public String name;
	public static String description;
	
	public static int countOfAnimal = 0;
	
	public static int id;
	
	public static final int NUMBER_OF_KING = 1;
	
	public Animal() {
		id = ++countOfAnimal;
	}
	
	public void displayName() {
		System.out.println("I am " + this.name);
	}
	
	public static void displayDescirpion() {
		System.out.println(description);
	}
}
public class UsingClassVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal lion = new Animal();
		lion.name = "Shera";
		Animal.description = "I am the king of the jungle.";
		
		lion.displayName();
		Animal.displayDescirpion();
		
		Animal tiger = new Animal();
		tiger.name = "Baghira";
		tiger.displayName();
		Animal.displayDescirpion();
		
		System.out.println("Number of animals saying they are king: " + Animal.id);
		
		System.out.println("Actual number of king: " + Animal.NUMBER_OF_KING);
	}

}
