package Demo1;

import java.io.IOException;

public class ExceptionHandlingDemo_throw {

	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			System.out.println("catching error in calling function");
			e.printStackTrace();
		}
	}
	
	// If we dont want to handle to exception inside function then we can throw and later it can be handled in calling funciton
	// with funciton name use throws and exception type
	//as soon u throw it will give error in calling funciton to use try catch
	public static void demo() throws Exception {

			System.out.println("Hello selenium");
			
			//create an exception statement
			
			int i=1/0;
			
			System.out.println("Completed");

	}

}
