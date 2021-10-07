package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterFromXML {

	
	@Parameters({"browser"})
	@Test(priority=1)
	public void getBrowser(String browser)
	{
		System.out.println(browser);
		
		
	}
}
