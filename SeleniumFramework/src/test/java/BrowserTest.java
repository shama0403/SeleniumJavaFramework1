
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class BrowserTest {
	//create main method starting point for any java programme. main space bar it will create
	
	public static void main(String[] args) {
		// find the project path with user.dir. In any system it gives that particular system path
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		
		
		//
		//chrome driver inside folder in framework refer to that. Then take the path of project using user.dir and use it from there give path to folder in framework
		//so this will work in any machine
		System.setProperty("webdriver.chrome.driver",projectpath+"//drivers/chromedriver/chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

	}

}
