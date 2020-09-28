/**
 * 
 */
package beginerjava.transientandserialversionuids;

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
	private transient Integer ID; // avoid serializing field by using transient keyword
	private static int count;
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
		return "Person [name=" + name + ", ID=" + ID + ", COUNT=" + count+ "]";
	}



	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Person.count = count;
	}
	
	
}
