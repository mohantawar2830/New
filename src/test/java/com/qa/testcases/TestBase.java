package com.qa.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	@BeforeSuite
	public void setup()
	{
		System.out.println("Initializing everything");
		
	}
	@AfterSuite
	public void teardown()
	{
		System.out.println("quitting everything");
	}
}
