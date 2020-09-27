package beginerjava.serializingmultipleobjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjects {

	public static void write(Person[] people) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "//src//beginerjava//serializingmultipleobjects/people.log"))){
			os.writeObject(people);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writArayList(ArrayList<Person> persons) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "//src//beginerjava//serializingmultipleobjects/persons.log"))){
			os.writeObject(persons);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
