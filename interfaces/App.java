/**
 * 
 */
package beginerjava.interfaces;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Machine mac = new Machine("2.0");
		mac.displayInfo();
		mac.displayVersion();
		
		Person cam = new Person();
		cam.displayInfo();
		cam.greet();
		
		Info info = new Machine("3.0");
		info.displayInfo(); // dispplayInfo() is declared in interface so interface instance can access it.
		// info.displayVersion() will not work, as Info interface do not have its signature.
		Info cam2 = cam;
		cam2.displayInfo();
		//cam2.greet(); will not work as cam2 is type of Info and not Person
		
		showInfo(mac);
		showInfo(info);
		showInfo(cam);
		showInfo(cam2);
	}

	private static void showInfo(Info info) {
		info.displayInfo();
	}

}
