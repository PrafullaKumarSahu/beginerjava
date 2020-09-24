/**
 * 
 */
package beginerjava.accessspecifiers;

/**
 * @author prafullakumarsahu
 *
 */
public class Plant {
	public String name;
	public static final int ID = 8; //public is Acceptable if final
	private String type;
	protected String size;
	int height;
	
	public Plant() {
		this.name = "Freddy"; // public
		this.type = "tree"; // private
		this.size = "large"; // protected
		this.height = 8; //no access specifier OR package level visibility
	}
}
