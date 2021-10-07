package com.qa.testcases;

import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test(dataProvider="dp1",dataProviderClass= MutipleDataProvider.class,priority=2)
	public void doLogin(String username,String password)
	{
		System.out.println(username+"---"+password);
	}
	
	
	@Test(dataProvider="dp1",dataProviderClass= MutipleDataProvider.class,priority=1)
	public void doUserReg(String fname,String lname,String email)
	{
		System.out.println(fname+"---"+lname+"---"+email);
	}

}
