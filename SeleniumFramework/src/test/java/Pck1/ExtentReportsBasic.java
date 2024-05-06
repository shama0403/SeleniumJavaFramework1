package Pck1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportsBasic {
	
private static WebDriver driver= null;

	public static void main(String[] args) {
		//create all references
		ExtentReports extent = new ExtentReports();
		
		// we can create give any name to html file and variable. results are created in this file. we can specify path of htmel file
		ExtentSparkReporter spark = new ExtentSparkReporter("spark.html");
		// to extent report attach this html report
		extent.attachReporter(spark);
		
		// Now start test and log information. This will be title and description of the report
		ExtentTest test1 = extent.createTest("Google Search Test1","This test is to validate google search functionality");

		//using test1 variable and create log 
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
		
		driver= new ChromeDriver();
		test1.log(Status.INFO,"Starting Test case");
		driver.get("https://www.google.com");
		test1.pass("Navigated to google");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
		test1.pass("Entered text in search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("clicked on search button");
		driver.close();
		driver.quit();
		test1.pass("closing the browser");

		test1.info("Test completed");
		
		// this is important which pushes all the information to report. without this there will be nothing in report
		extent.flush();
	}

}
