package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends TestBase {

	@Test(groups="smoke")
	public void validateTitle()
	{
		String actual = "Google";
		String expected = "Google.com";
		
/*	if(expected.equals(actual))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Falied");
		}
*/
		/*Assert class will provide verification for validating test case
		 * and also it will generate fail report 
		 * but if we simply write if else it will give only msg 
		 * not gives the result
		 * assertTrue is best example of method overloading
		 * 
		 */
		// isElementPresent("xpath") returns true or false condition
//		Assert.assertEquals(actual, expected);
		//Assert.assertTrue(false, "element not found");
		//Assert.fail("failing the test as condition is not met");
		
		/*
		 * if we want to validate multiple failure report within single 
		 * test then we use SoftAssert
		 * and finally we use assertAll method to fail the testcase
		 */
		SoftAssert softassert = new SoftAssert();
		System.out.println("validating title ");
		softassert.assertEquals(actual, expected);
		softassert.assertTrue(false);
		System.out.println("validating checkbox");
		softassert.assertEquals(false, true,"img is not present");
		softassert.assertEquals(false, true,"text is not present");
		System.out.println("ending");
		softassert.assertAll();
		
	}
}
