package listeners;


import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import junit.framework.Assert;

//user @Listeners annotation(packagename.classname.class)
//remove this if using testNg xml and calling listners and calling class there
//@Listeners(listeners.TestNgListners.class)

public class TestNgListnerDemo3 {
	
	@Test
	public void test4() {
		System.out.println("I am inside Test4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside Test5");
		
		//failing for demo purpose using assert
			}

	@Test
	public void test6() {
		System.out.println("I am inside Test6");
		//demo purpose skip exception of testng
		throw new SkipException("This test is skipped");
	}


}
