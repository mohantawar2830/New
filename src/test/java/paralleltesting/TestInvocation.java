package paralleltesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestInvocation extends BaseTest{
	//threadPoolSize
	@Test(invocationCount=3,threadPoolSize=3)
	public void executetest()
	{
		//System.out.println("Launching chrome browser");
		driver = getDriver("chrome");
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.quit();
//	}

}
