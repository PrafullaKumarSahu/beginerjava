/**
 * 
 */
package beginerjava.innerclasses;


/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robo = new Robot(001);
		robo.start();
		
		Robot.Brain brain = robo.new Brain();
		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
