package listeners;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//user @Listeners annotation(packagename.classname.class)
//remove this if using testNg xml and calling listners and calling class there
//@Listeners(listeners.TestNgListners.class)

public class TestNgListnerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
			
		//chrome driver inside folder in framework refer to that. Then take the path of project using user.dir and use it from there give path to folder in framework
		//so this will work in any machine
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://www.google.com");
	//failing deliberately by giving wrong name
	driver.findElement(By.name("qqqqq")).sendKeys("selenium tutorial");
	driver.close();

		
		//failing for demo purpose using assert
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		System.out.println("I am inside Test3");
		//demo purpose skip exception of testng
		throw new SkipException("This test is skipped");
	}


}
