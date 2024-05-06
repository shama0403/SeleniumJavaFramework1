package Pck1;

import org.openqa.selenium.By;
//import google search page to refer the functions having elements
import PageObjects.GoogleSearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPO1 {
	//making class variable
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
				
		GoogleSearch();
	}
	
	public static void GoogleSearch() {
				// find the project path with user.dir. In any system it gives that particular system path
				String projectpath = System.getProperty("user.dir");
				System.out.println(projectpath);
					
				//chrome driver inside folder in framework refer to that. Then take the path of project using user.dir and use it from there give path to folder in framework
				//so this will work in any machine
				System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
				
				driver= new ChromeDriver();
				
				// go to google.com
				driver.get("https://www.google.com");
				//use function to identify 
				GoogleSearchPage.textbox_search(driver).sendKeys("Selenium Tutorial");
				//click search button
	
				GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
				//close browser
				driver.close();
				
				System.out.println("Test successfull");
				
							
	}

}
