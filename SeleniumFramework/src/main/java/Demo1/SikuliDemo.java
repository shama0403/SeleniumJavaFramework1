package Demo1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliDemo {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/search?q=youtube+selenium+raghav+pal&sca_esv=4798f66b03e5dfbb&sca_upv=1&sxsrf=ADLYWIIEgK9cG1xU9XAuvzqTIFhxBN-o7w%3A1714720327246&ei=R440ZpLHDuqbnesPrs-qmAk&ved=0ahUKEwjShvr_9vCFAxXqTWcHHa6nCpMQ4dUDCBA&uact=5&oq=youtube+selenium+raghav+pal&gs_lp=Egxnd3Mtd2l6LXNlcnAiG3lvdXR1YmUgc2VsZW5pdW0gcmFnaGF2IHBhbDIFECEYoAEyBRAhGKABMgUQIRifBUjyGFD1A1jaFnABeAGQAQCYAaIBoAGlC6oBBDAuMTG4AQPIAQD4AQGYAgygAt0LwgIKEAAYsAMY1gQYR8ICExAuGIAEGLADGNEDGEMYxwEYigXCAgUQABiABMICBhAAGBYYHsICBxAhGKABGAqYAwCIBgGQBgmSBwQxLjExoAeUTg&sclient=gws-wiz-serp#fpstate=ive&vld=cid:06bb4c9d,vid:HjYEjKWSbe8,st:0");
		System.out.println("completed");
	}

}
