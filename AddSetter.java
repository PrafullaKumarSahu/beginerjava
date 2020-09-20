/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Frog {
	private String name;
	private int age;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name; //this refers to instance variable
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class AddSetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.setName("Bertie");
		frog.setAge(11);
		
		System.out.println(frog.getName() + " is " + frog.getAge() + ".");
		
		frog.setInfo("Tertie", 11);
		System.out.println(frog.getName() + " is " + frog.getAge() + ".");
	}

}
