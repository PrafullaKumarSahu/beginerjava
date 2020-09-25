package beginerjava.generics;

public class Rabbit extends Animal {

	@Override
	public String toString() {
		return "This is a rabbit";
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		super.message();
		System.out.println("This is a rabbit");
	}
	
	public void run() {
		System.out.println("Rabbit is running.");
	}
}
