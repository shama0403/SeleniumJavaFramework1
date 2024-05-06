package Pck1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportWithTestNg {

	static WebDriver driver=null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	
//@BeforeTest - use if only one test case. 
//Before Suite - If multiple test cases to be run between in @ Test then use suite. even if single tc is there it holds good
@BeforeSuite   
public void Setup() {
	//create all references
	extent = new ExtentReports();
	
	// we can create give any name to html file and variable. results are created in this file. we can specify path of htmel file
	spark = new ExtentSparkReporter("spark.html");
	// to extent report attach this html report
	extent.attachReporter(spark);
	String projectpath = System.getProperty("user.dir");
	System.out.println(projectpath);
	
	System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
	
	driver= new ChromeDriver();

	
}

@Test
public void test1() {
	// Now start test and log information. This will be title and description of the report
	ExtentTest test1 = extent.createTest("Google Search Test1","This test is to validate google search functionality");

		//using test1 variable and create log 
		
		
		test1.log(Status.INFO,"Starting Test case1 google search");
		driver.get("https://www.google.com");
		test1.pass("Navigated to google");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
		test1.pass("Entered text in search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("clicked on search button");
		test1.info("Test1 completed");

}
@Test
public void test2() {
	
	// Now start test and log information. This will be title and description of the report
	ExtentTest test2 = extent.createTest("Amazon page Test2","This test is to validate amazon page");

		//using test1 variable and create log 
		
		
		test2.log(Status.INFO,"Starting Test case 2, amazon");
		driver.get("https://www.amazon.com");
		test2.pass("Navigated to amazon");
		
		test2.info("Test2 completed");

		

}

//@AfterTest - after every test case
@AfterSuite
public void teardown() {
	driver.close();
	driver.quit();
	System.out.println("quitting the browser");
	
}
//after all the test suite create report
@AfterSuite
public void createreport() {
	extent.flush();
	
}


}
