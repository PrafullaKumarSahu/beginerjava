/**
 * 
 */
package beginerjava.enums;

/**
 * @author prafullakumarsahu
 *
 */
public enum Bird {
	EAGEL("eagel", 1), PARROT("parrot", 2), CHICKEN("chicken", 3);
	
	private String name;
	private Integer ID;
	
	Bird(String name, Integer ID) {
		this.name = name;
		this.ID = ID;
	}
	
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
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}