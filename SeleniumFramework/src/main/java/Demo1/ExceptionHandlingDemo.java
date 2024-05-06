package Demo1;

import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello selenium");
			
			//create an exception statement
			
			int i=1/0;
			
			System.out.println("Completed");

		}
		
		// we should have catch or finally after try. We ca have one or multiple catch
		//catch(IOException)
		//catch(ArithmeticException)
		//catch(Exception)
		// any exception in try it will come to catch block
		catch(Exception exp) {
			System.out.println("I am inside catch block");
			//trouble shoot exception. Get cause and message of the exception
			System.out.println("Message is "+exp.getMessage());
			System.out.println("Cause is "+exp.getCause());
			//give line of code error and etails entire stack trace
			exp.printStackTrace();
		}
		//finally will execute in any case , even if exception is there or not
		
		finally {
			System.out.println("I am inside finally block");
		}
	}

}
