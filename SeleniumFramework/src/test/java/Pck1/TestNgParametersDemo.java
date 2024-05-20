package Pck1;


import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class TestNgParametersDemo {

	@Test
	//pass parameters
	@Parameters({"testname1"})
	
	public void test(String name) {
		//to make the parameter optional. if you are not passing it will be null or give name to be taken if not given inside optional
//		public void test(@optional("optname") String name) {
		System.out.println("Name is "+name);
	}
	
}
