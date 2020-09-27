/**
 * 
 */
package beginerjava.innerclasses;

/**
 * @author prafullakumarsahu
 *
 */
public class Robot {
	private Integer ID;

	/**
	 * @param iD
	 */
	public Robot(Integer iD) {
		ID = iD;
	}
	
	public class Brain{
		public void think() {
			System.out.println("Robot-" + ID + " is thinkking.");
		}
	}
	
	public static class Battery{
		public void charge() {
			System.out.println("Battery charging!!");
		}
	}
	
	public void start() {
		System.out.println("Robot-" + this.ID + " is starting.");
		Battery battery = new Battery();
		battery.charge();
		Brain brain = new Brain();
		brain.think();
		
		class Song{ // can not access outside this method, can not use access specifier
			public void sing() {
				System.out.println("Robot-" + ID + " is singing.");
			}
		}
		
		Song song = new Song();
		song.sing();
	}
}