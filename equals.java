/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */

class Vehicle{
	String name;
	Integer ID;
	/**
	 * @param name
	 * @param iD
	 */
	public Vehicle(String name, Integer iD) {
		this.name = name;
		ID = iD;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Vehicle other = (Vehicle) obj;
//		if (ID == null) {
//			if (other.ID != null)
//				return false;
//		} else if (!ID.equals(other.ID))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	
}
public class equals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle bike = new Vehicle("Bike", 420); //false
		Vehicle car = new Vehicle("Car", 4000); // false
		System.out.println(bike == car);
		System.out.println(bike.equals(car));
		Vehicle bike2 = bike;
		System.out.println(bike == bike2); //true
		System.out.println(bike.equals(bike2)); //true
		
		Vehicle bike3 = new Vehicle("Bike", 420);
		System.out.println(bike == bike3); // false
		System.out.println(bike.equals(bike3)); //true once we are implementing equals method without that it will return false
		
		//Integer
		Integer num1 = 40;
		Integer num2 = 40;
		System.out.println(num1 == num2); // true
		System.out.println(num1.equals(num2)); // true
		
		//Float
		Float f1 = 45.50f;
		Float f2 = 45.50f;
		System.out.println(f1 == f2); // false
		System.out.println(f1.equals(f2)); // true
		
		//Double
		Double d1 = 14.56;
		Double d2 = 14.56;
		System.out.println(d1==d2); // false
		System.out.println(d1.equals(d2)); // true
		
		//String
		String s1 = "String";
		String s2 = "String";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		
		//Char
		Character c1 = 'C';
		Character c2 = 'C';
		System.out.println(c1 == c2); // true
		System.out.println(c1.equals(c2)); // true
		
		String str1 = "Hello";
		String str2 = "Hellofadd".substring(0, 5);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
	}

}
