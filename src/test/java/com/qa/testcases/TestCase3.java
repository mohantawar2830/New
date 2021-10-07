package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends TestBase {

	@Test (priority=2,dependsOnMethods="doUserReg",groups= {"functional,smoke"})
	public void doLogin()
	{
		System.out.println("Executing do Login Test");
	}
	
	@Test(priority=1,groups= {"functional,smoke"})
	public void doUserReg() {
		System.out.println("Executing do Registeration Test ");
		Assert.fail("user registeration not successful");
	}
	@Test(priority=3,dependsOnMethods="doUserReg",alwaysRun=true,groups={"functional,smoke"})
	public void thirdTest()
	{
		System.out.println("executing third test");
	}
	@Test(groups="bvt")
	public void test4()
	{
		System.out.println("executing test four");
	}
}
