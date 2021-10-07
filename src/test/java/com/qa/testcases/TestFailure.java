package com.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestFailure extends TestBase {
	
	@Test
	public void doLogin()
	{
		Assert.fail("failing the login");
		System.out.println("Capture Screenshot");
	}

}
