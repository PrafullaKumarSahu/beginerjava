package beginerjava.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void write(Person person) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "//src//beginerjava//serialization/people.log"))){
			os.writeObject(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
