package Pipeline.JenkinC;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Test
public class SeleniumTest {
  
	public void testfun1()
	{
		System.setProperty("webdriver.gecko.driver", "D://Souvik//Selenium//Selenium Jar//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		System.out.println(d.getPageSource());
		System.out.println(d.getWindowHandle());
		//d.quit();
		
		
	}
	
}
