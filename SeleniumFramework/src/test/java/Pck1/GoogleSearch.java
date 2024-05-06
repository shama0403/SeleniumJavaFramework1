package Pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
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
				
				WebDriver driver= new ChromeDriver();
				
				// go to google.com
				driver.get("https//www.google.com");
				//enter text in search 
				driver.findElement(By.name("q")).sendKeys("selenium tutorial");
				//click search button
				//driver.findElement(By.name("btnk")).click();
				driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
				//close browser
				driver.close();
				
				System.out.println("Test successfull");
				
							
	}

}
