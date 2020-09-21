/**
 * 
 */
package beginerjava.inheritance;

/**
 * @author prafullakumarsahu
 *
 */
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car started.");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped.");
	}

	public void wipeWindShiled() {
		System.out.println("Wipe Wind Shield");
	}
	
	public void showVersion() {
		System.out.println(this.version);
	}
}
