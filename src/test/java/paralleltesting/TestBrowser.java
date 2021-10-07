package paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	
	@Parameters({"browser"})
	@Test
	public void launchbrowser(String b)
	{
//		Date d = new Date();
//		System.out.println("launchinb browser--"+b+"--"+d);
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
	}

}
