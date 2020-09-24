package beginerjava.accessspecifiers.world;

import beginerjava.accessspecifiers.Plant;

public class App {

	public static void main(String[] args) {
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		//System.out.println(plant.type);// private can not be accessed outside the class
		//System.out.println(plant.size); // protected not accessible outside package
		//System.out.println(plant.height); // no-access specifier is not accessible outside the package
	}

}
