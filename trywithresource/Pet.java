/**
 * 
 */
package beginerjava.trywithresource;

/**
 * @author prafullakumarsahu
 *
 */
public class Pet implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closed.");
	}

}
