/**
 * 
 */
package beginerjava.passbyvalue;

/**
 * @author prafullakumarsahu
 *
 */
public class Pet {
	private String name;

	/**
	 * @param name
	 */
	public Pet(String name) {
		this.name = name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}
}
