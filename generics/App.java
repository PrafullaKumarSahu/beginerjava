/**
 * 
 */
package beginerjava.generics;

import java.util.ArrayList;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<Animal>();
		animal.add(new Animal());
		animal.add(new Animal());
		
		ArrayList<Rabbit> rabbit = new ArrayList<Rabbit>();
		rabbit.add(new Rabbit());
		rabbit.add(new Rabbit());
		
		displayMessage(animal);
		displayMessage(rabbit);
		
		showMessage(animal);
		showMessage(rabbit);
		
		outputMessage(animal); //will work, but in that case Rabbit specific methods can not be called
		outputMessage(rabbit);
	}

	private static void displayMessage(ArrayList<?> objects) {
		for(Object value : objects) {
			System.out.println(value);
		}
	}
	
	private static void showMessage(ArrayList<? extends Animal> animals) {
		for(Animal animal : animals) {
			animal.message();
			//animal.run(); will not work
		}
	}
	
	private static void outputMessage(ArrayList<? super Rabbit> rabbits) {
		for(Object rabbit : rabbits) {
			System.out.println(rabbit);
			//((Rabbit) rabbit).run();// will work only for Rabbit object
			System.out.println(rabbit);
			
		}
	}

}
