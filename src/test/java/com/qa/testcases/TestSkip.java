package com.qa.testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void isSkip()
	{
		throw new SkipException("skipping the test as condition is not met");
	}

}
