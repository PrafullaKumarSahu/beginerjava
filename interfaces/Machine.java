/**
 * 
 */
package beginerjava.interfaces;

/**
 * @author prafullakumarsahu
 *
 */
public class Machine implements Info{
	
	private String version = "1.0";
	
	public Machine(String version) {
		this.version = version;
	}

	public void displayInfo() {
		System.out.println("I am a machine, I have different versions.");
	}
	
	public void displayVersion() {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("Current version").append(": ").append(version).toString());
	}

}
