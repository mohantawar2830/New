package com.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterization {
	public static Utility utility=null;
	
	@Test(dataProvider="LoginData")
	public void doLogin(String username,String password)
	{
		System.out.println(username+ "---"+password);
	}

	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		if(utility==null)
		{
			utility = new Utility("D:\\TestNGData.xlsx");
		}
		int rows = utility.getRowCount("Sheet1");
		int cols = utility.getCellCount("Sheet1", 1);
		String logindata[][]=new String[rows][cols];

		for(int i=1;i<=rows;i++) //1
		{
			for(int j=0;j<cols;j++) //0
			{
				logindata[i-1][j]=utility.getCellData("Sheet1", i, j);
			}
				
		}
		return logindata;
		
	}
	
}
