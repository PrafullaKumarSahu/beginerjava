/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class UsingForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// need a needle/loop counter to handle the control here it is i
		// it will take us through the initial value to final value
		// final value is determine based on 2nd statement of for loop, that is just after 1st semicolon
		// 2nd statement is a conditional to determine when to stop iteration/execution of inside operation
		// Pointing to next we need to change the needle, the 3rd statement is doing the job, which is after 2nd semicolon
		for (int i=0; i<10; i++) { 
			System.out.println(i);
		}
		
		//Infinite loops
		
		// without any needle/loop counter, we can not make a conditional and with out increment/decrement we can not change the needle
		// with out all these statements, we can not control the loop, for(;;) will make it infinite loop
		
		/*for(;;) {
			System.out.println("Hello");
		}*/
		
		// without conditional or increment/decrement also it will be infinite loop
		// It will take it as always true eg: for(int i=0;;)
		
		/*for(int i=0;;) {
			System.out.println(i);
		}*/
		
		/*
		for(int i=0; i<10;) {
			System.out.println(i);
		}*/
		
		/*
		for(int i=0; ;i++) {
			System.out.println(i);
		}*/
		
		/*for(int i=0; ;i=i) {
			System.out.println(i);
		}*/
		
	}

}
