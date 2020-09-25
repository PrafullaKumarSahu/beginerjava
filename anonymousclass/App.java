package beginerjava.anonymousclass;

public class App {
	public static void main(String[] args) {
		
		//Anonymous class extending a class
		Animal rabbit = new Animal() {
			@Override public void walk() {
				System.out.println("Rabbit is walking.");
			}
		};
		rabbit.walk();
		
		//Anonymous class implementing an interface
		LivingBeings man = new LivingBeings() {

			public void getOld() {
				System.out.println("I am growing old.");
			}
			
		};
		
		man.getOld();
	}
}
