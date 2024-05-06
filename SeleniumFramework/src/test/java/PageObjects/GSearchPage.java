package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GSearchPage {
	// identifying elements
	static WebDriver driver=null;
	By textbox_search=By.name("q");
	
	By button_search=By.name("btnk");
	
	//create constructor
	//we have to take driver from test case. So defining here when ever this function is called take driver instance from calling function
	
	public GSearchPage(WebDriver driver) {
		//using driver above also so telling this.driver
		//we can use driver=driver1 and in function GSearchPage(WEbDriver driver1)
		this.driver = driver;
	}
	
	//add methods for objects above
	//function for text box action
	public void SettextInsearchbox(String text) {
		//ext from test case not hardcoding here
		driver.findElement(textbox_search).sendKeys(text);
	}
	//function for button action
	public void clicksearchbutton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
