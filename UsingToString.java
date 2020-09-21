/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Pet {
	private String name;
	private int id;
	
	public Pet(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.id).append(": ").append(this.name);
		System.out.println(sb.toString());
	}
	
	public void show() {
		String show = String.format("%d: %s", this.id, this.name);
		System.out.println(show);
	}
}
public class UsingToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pet dog = new Pet("Browny", 1);
		Pet cat = new Pet("Chiki", 2);
		
		dog.display();
		cat.display();
		
		dog.show();
		cat.show();
	}

}
