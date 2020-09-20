/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Robot {
	void speak(String text) {
		System.out.println(text);
	}
	
	void jump(int height) {
		System.out.println("Jumping: " + height + "meter.");
	}
	
	void move(String direction, int distance) {
		System.out.println("I am moving in " + distance + " in " + direction + " direction." );
	}
	
	void sing(String song) {
		System.out.println("I am singing a " + song + " song.");
	}
}
public class PassingParameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robo = new Robot();
		robo.speak("Hello, I am robo.");
		robo.jump(5); // method argument type should match the parameter type
		robo.move("east", 100); // order of arguments should match order of parameters
		
		String devotional = "devotional";
		robo.sing(devotional); // name of argument and parameter does not need to be matched
		//sometimes it is more meaningful to keep same name and sometimes not
	}

}
