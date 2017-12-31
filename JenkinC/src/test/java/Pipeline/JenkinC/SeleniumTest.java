package Pipeline.JenkinC;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Test
public class SeleniumTest {
  
	@Test
	public void testfun1()
	{
		System.out.println("SeleniumTest");
		System.setProperty("webdriver.gecko.driver", "D://Souvik//Selenium//geckodriver-v0.19.1-win64//geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		System.out.println(d.getPageSource());
		System.out.println(d.getWindowHandle());
		//d.quit();
		
		
	}
	
}
