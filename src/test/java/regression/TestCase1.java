package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

//@test annotation is used before every test case in testng
// @BeforeMethod will execute before every test case
// we can give priority to test case also in testng using keyword priority
// @aftermethod will execute after every test case	
// @Beforetest method will execute first at first time
	@BeforeTest
	public void createDB()
	{
		System.out.println("creating database connection");
		
	}
	@AfterTest
	public void closeDB()
	{
		System.out.println("closing database connection");
	}
	@BeforeMethod
	public void browserLaunch()
	{
		System.out.println("Launching browser");
	}
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("Closing browser");
		
	}
	@Test (priority=2)
	public void doLogin()
	{
		System.out.println("Executing do Login Test");
	}
	
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Executing do Registeration Test ");
	}
}
