package Pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SelHeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		//headless chrome
		
				ChromeOptions options=new ChromeOptions();
				//options.addArguments("headless");
				options.addArguments("--headless=new");
				options.addArguments("--windows-size=1920,1080");
				
				//pass options to driver tell what kind it should be headless
				
		WebDriver driver=new ChromeDriver(options);
				
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("q")).sendKeys("abc");
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		System.out.println("completed");
		
	}

}
