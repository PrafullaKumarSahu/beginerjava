/**
 * 
 */
package beginerjava.serializingmultipleobjects;

import java.io.Serializable;

/**
 * @author prafullakumarsahu
 *
 */
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4128787941018843653L;
	private String name;
	private Integer ID;
	/**
	 * @param name
	 * @param iD
	 */
	public Person(String name, Integer iD) {
		this.name = name;
		ID = iD;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + "]";
	}
	
	
}
