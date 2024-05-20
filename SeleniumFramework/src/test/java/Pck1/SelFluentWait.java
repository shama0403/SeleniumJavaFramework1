package Pck1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SelFluentWait {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("abc");		
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		//driver.findElement(By.linkText("ABCD-test")).click();
		//fluent wait
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		//timeout with pooling frequence and ignoring option then use fluent wait
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(2))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    WebElement  linkelement= driver.findElement(By.id("driver.findElement(By.linkText(\"ABCD-test\"))"));
		    
		    //wait till element is enabled
		    if (linkelement.isEnabled()){
		    	System.out.println("Element found");
		    	}
		    return linkelement;
		     }
		   });
		   element.click();
		 
		driver.close();
		driver.quit();
	}

}
