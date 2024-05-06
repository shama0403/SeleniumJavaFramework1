package Pck1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgParallelDemo {

	WebDriver driver=null;
	@Test
	public void test1() {
		System.out.println("I am inside Test1"+Thread.currentThread().getId());
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
			
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		 driver=new ChromeDriver();	
		 driver.get("https://www.google.com");
		// Thread.sleep(3000);
		 driver.close();
	

	}
	@Test
	public void test2() {
		System.out.println("I am inside Test2"+Thread.currentThread().getId());
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
			
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		 driver=new ChromeDriver();	
		 driver.get("https://www.amazon.com");
		 //Thread.sleep(3000);
		 driver.close();
		
	}
	@Test
	public void test3() {
		System.out.println("I am inside Test2"+Thread.currentThread().getId());
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
			
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		 driver=new ChromeDriver();	
		 driver.get("https://www.flipkart.com");
		 //Thread.sleep(3000);
		 driver.close();
		
	}

}
