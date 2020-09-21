/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Inefficient string concatenation
		String str = "Something";
		str += " ";
		str += "and something more.";
		System.out.println(str);
		
		//Efficient string concatenation
		StringBuilder sb = new StringBuilder("Something");
		sb.append(" ");
		sb.append("and something more.");
		System.out.println(sb.toString());
		
		// One liner
		StringBuilder stringBuildr = new StringBuilder();
		stringBuildr.append("Something").append(" ").append("and something more.").toString();
		System.out.println(stringBuildr);
		
		// String formatting
		System.out.println("This is a line with \t some text separated by tab. \n This is another line");
		
		System.out.printf("This is a number: %d\n", 100);
		
		for (int i=8; i<12; i++) {
			System.out.printf("%2d: Some nice formating magic. the serial numbers are well placed.\n", i);
		}
		
		System.out.printf("Total price: $%.2f\n", 150.534546f);

	}

}
