/**
 * 
 */
package beginerjava.upanddowncasting;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Machine machine = new Machine();
		Camera camera = new Camera();
		
		machine.start();
		camera.start();
		camera.snap();
		
		//Up casting
		Machine machine2 = camera; // Up casting is implicit
		machine2.start(); //camera will start
		//error: machine2.snap();
		
		//Down casting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3; //Down casting needs explicit type conversion, as original object is of type Camera, it is allowed
		camera2.snap();
		
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4; // ClassCastException: machine can not be cast to Camera, not allowed 
		//exception: camera3.start();
		//exception: camera3.snap();
	}

}
