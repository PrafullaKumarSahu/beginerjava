/**
 * 
 */
package beginerjava.UsingPolymorphism;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		Plant plant2 = tree;
		plant2.grow(); // the type of variable is Plant, but actually the reference pointing to Tree type, so it will call tree's grow method
		tree.shedLeaves(); // can access
		//plant2.shedLeaves(); // can not access
		
		/*
		Plant plant3;
		plant3.grow();
		*/ //Type of variable decides what methods can be accessible, but type of object will decide which will be executed.
		
		doGrow(tree);
	}

	private static void doGrow(Plant plant) {
		plant.grow();
	}

}
