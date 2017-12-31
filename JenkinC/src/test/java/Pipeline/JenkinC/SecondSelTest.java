package Pipeline.JenkinC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class SecondSelTest {

	public void SelTe()
	{
		
		System.out.println("SecondSelTest");
		System.setProperty("webdriver.gecko.driver", "D://Souvik//Selenium//geckodriver-v0.19.1-win64//geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		System.out.println(d.getPageSource());
		System.out.println(d.getWindowHandle());
		
	}
	
}
