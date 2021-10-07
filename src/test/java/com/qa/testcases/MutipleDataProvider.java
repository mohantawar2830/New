package com.qa.testcases;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class MutipleDataProvider {

	
//	@Test(dataProvider="dp1")
//	
//	public void doLogin(String username,String password)
//	{
//		System.out.println(username+"---"+password);
//	}
//	
	@DataProvider(name="dp1")
	public static Object[][] getdata(Method m)
	{
		Object[][]data=null;
		if(m.getName().equals("doLogin"))
		{
		data = new Object[2][2];
		data[0][0]="mohan";
		data[0][1]="pawan";
		data[1][0]="savan";
		data[1][1]="bhagwan";
		}
		else if (m.getName().equals("doUserReg"))
		{
			data = new Object[2][3];
			data[0][0]="mohan ";
			data[0][1]="tawar";
			data[0][2]="abc@gmail.com";
			data[1][0]="savan";
			data[1][1]="tawar";
			data[1][2]="xyz@gmail.com";
		}
		return data;
	}
//	@DataProvider(name="dp2")
//	public static Object[][] getdata2()
//	{
//		Object[][]data = new Object[2][3];
//		data[0][0]="mohan";
//		data[0][1]="tawar";
//		data[0][2]="abc@gmail.com";
//		data[1][0]="savan";
//		data[1][1]="tawar";
//		data[1][2]="xyz@gmail.com";
//		return data;
//	}
}
