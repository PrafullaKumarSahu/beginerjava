/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class BuildingStrArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] colors = {
				"Blue",
				"Green",
				"Red",
				"Yellow",
				"White",
				"Black"
		};//colors is a address of the memory where all these strings are stored
		
		for(String color: colors) {
			System.out.println(color);
		}
		
		String[] texts= new String[2]; // It is going to hold String objects/reference
		System.out.println(texts[0]); // Default value of reference null
		System.out.println(texts[1]); // Default value of reference null
		
		texts[0] = "Some text"; // left side is reference and right side is value
		texts[1] = "Another text"; // we can access these values using these reference
		
		System.out.println(texts[0]);
		System.out.println(texts[1]);
	}

}
