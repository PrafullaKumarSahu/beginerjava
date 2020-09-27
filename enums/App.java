/**
 * 
 */
package beginerjava.enums;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal = Animal.LION;
		switch(animal) {
		case CAT:
			System.out.println("This is a cat.");
			break;
		case DOG:
			System.out.println("This is a dog");
			break;
		case LION:
			System.out.println("This is a lion");
			break;
		case TIGER:
			System.out.println("This is a tiger");
			break;
		default:
			System.out.println("This is not an animal");
			break;
		
		}
		
		System.out.println(animal);
		System.out.println(Animal.DOG.getClass());
		System.out.println(animal instanceof Animal);
		System.out.println(Animal.TIGER instanceof Animal);
		
		System.out.println("This bird is called: " + Bird.CHICKEN);
		System.out.println("Name of this bird is: " + Bird.EAGEL.getName()); // Name property of enum constant
		System.out.println("Name of this bird is: " + Bird.EAGEL.name()); //Name of enum constant
		
		Bird kabib = Bird.valueOf("EAGEL"); // Property of enum constant, actually using toString method
		System.out.println("Kabib is " + kabib);
	}

}
