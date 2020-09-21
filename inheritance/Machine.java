/**
 * 
 */
package beginerjava.inheritance;

/**
 * @author prafullakumarsahu
 *
 */
public class Machine {
	private String name = "Machine X";
	protected String version = "1.0";
	
	public void start() {
		System.out.println("Machine started.");
	}
	
	public void stop() {
		System.out.println("Machine stopped.");
	}
	
	public void pause() {
		System.out.println("Machine is paused.");
	}
	
	public void resume() {
		System.out.println("Machine is resumed.");
	}
}
