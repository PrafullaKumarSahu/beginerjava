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
	private int age; // keeping the properties private 
	// and using getter, setter helps in encapsulating the original data and allow communication through methods
	
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
		this.name = name; //this.name refers to instance variable and name refers to parameter passed
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age; // instance is not required, but can be used as this.age
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public void setInfo(String name, int age) {
		setName(name); // instance is not required, but can be written as this.setName(name 
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
