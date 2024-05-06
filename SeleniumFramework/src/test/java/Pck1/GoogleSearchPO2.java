package Pck1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GSearchPage;

public class GoogleSearchPO2 {
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
			// to call other functions	
		GoogleSearchTest();
	}
	
	public static void GoogleSearchTest() {
		// find the project path with user.dir. In any system it gives that particular system path
		String projectpath = System.getProperty("user.dir");
		//System.out.println(projectpath);
			
		//chrome driver inside folder in framework refer to that. Then take the path of project using user.dir and use it from there give path to folder in framework
		//so this will work in any machine
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		driver= new ChromeDriver();
		
		//creating object for the calss (having elements and methods )
		GSearchPage SearchPageObj = new GSearchPage(driver);
		
		driver.get("https://www.google.com");
		
		//call search page object and action function
		
		SearchPageObj.SettextInsearchbox("Selenium Tutorial");
		//call search button object and funtion
		SearchPageObj.clicksearchbutton();
		driver.close();
		
		
	}

}
