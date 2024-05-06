package Pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// If TestNg then main method is not required as execution is controlled by TestNg

public class GoogleSearch_TestNg2 {
	static WebDriver driver = null;
	
	// To run at begning. Before Test
	@BeforeTest
	public void SetupTest() {
		// find the project path with user.dir. In any system it gives that particular system path
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
			
		//chrome driver inside folder in framework refer to that. Then take the path of project using user.dir and use it from there give path to folder in framework
		//so this will work in any machine
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		 driver=new ChromeDriver();		
		
	}
@Test	
	public static void GoogleSearch2() {
				// go to google.com
				driver.get("https://www.google.com");
				//enter text in search 
				driver.findElement(By.name("q")).sendKeys("XYZ");
				//click search button
				//driver.findElement(By.name("btnk")).click();
				driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
				
	}
@Test	
public static void GoogleSearch3() {
			// go to google.com
			driver.get("https://www.google.com");
			//enter text in search 
			driver.findElement(By.name("q")).sendKeys("ABCD");
			//click search button
			//driver.findElement(By.name("btnk")).click();
			driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
			
}
// at the end of test after test
@AfterTest
	public void EndTest() {
		//close browser
	//	driver.close();
		//driver.quit();
		System.out.println("Test successfull");			

	}

}
