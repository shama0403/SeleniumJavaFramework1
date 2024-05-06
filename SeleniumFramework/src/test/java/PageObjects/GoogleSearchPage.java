package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Here only objects we are identified and returned 

public class GoogleSearchPage {
	/* write function for button
	 * get instance from test case about driver
	 * assign webelement to string and return
	 * as we are returning web element it should be public statis WebElement not void
	 * define WebElement as class variable to use in call functions
	 */
	private static WebElement element=null; // for only this class
	
	public static WebElement textbox_search(WebDriver driver) {
		element=driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		element=driver.findElement(By.name("btnk"));
		return element;
	}

}
