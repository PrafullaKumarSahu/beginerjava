/**
 * 
 */
package beginerjava.encaptulation;

/**
 * @author prafullakumarsahu
 *
 */
public class Plant {
	public static final int ID = 10;
	private String name;
	
	/**
	 * @return the name
	 */
	public String getName() {
		StringBuilder sb = new StringBuilder();
		String name = sb.append(this.name).append(calculateGrowthForcast()).toString();
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	private int calculateGrowthForcast() {
		return 9;
	}
	
}
