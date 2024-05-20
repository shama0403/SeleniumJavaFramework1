package Pck1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelWaitDemo {
	
	public static void main(String[] args) {
		seleniumwaits();
	}
	
	public static void seleniumwaits() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//###############implicitylyWait with timeunit.seconds is deprecated so use Duration of
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		// for 10 secs it will keep polling or waiting before gives exception. The default poll time or frequency of implicti wait is 250ms
		driver.get("https://www.google.com");
		//example it polls every 250 ms for 10seconds
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
				
		//deprecated
		//WebDriverWait wait = new WebDriverWait(driver, 20);
				
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		// there are many conditions
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		//some element which is not there . it will throw exception
		//
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
	}

}
