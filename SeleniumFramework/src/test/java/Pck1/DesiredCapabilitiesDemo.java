package Pck1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");

		DesiredCapabilities caps=new DesiredCapabilities(); 
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		// pass the setting done to browser 
		//WebDriver driver = new ChromeDriver(caps);		
		
		
		
		// driver.get("https://www.google.com");
		 //driver.findElement(By.name("q")).sendKeys("ABCD");
		// driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		// driver.close(); //driver.quit();
		 
	}

}
