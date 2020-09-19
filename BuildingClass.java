/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Book { //Book represents the blue print of book objects, 
	//Book class is not a book itself, it is the idea of book, that presents the property and behavior of books in general
	
	// class will be having some data/state | here properties of book
	// and some methods/subroutines | how behavior of those properties changes
	
	String name;
	float price;
}
public class BuildingClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.name = "First Book";
		book1.price = 5.56f;
		
		Book book2 = new Book();
		book2.name = "First Book";
		book2.price = 5.00f;
		
		Book[] books = {book1, book2};
		
		for (Book book: books) {
			System.out.println(book.name + ": " + book.price);
		}
	}

}
