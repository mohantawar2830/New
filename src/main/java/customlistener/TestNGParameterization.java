package customlistener;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterization {
	public static Utility utility=null;
	
	@Test(dataProvider="LoginData")
	public void doLogin(Hashtable<String,String>logindata)
	{
		//System.out.println(username+ "---"+password);
	// System.out.println(logindata.get("password"));
	}

	@DataProvider(name="LoginData")
	public Object[][] getData() throws IOException
	{
		if(utility==null)
		{
			utility = new Utility("D:\\TestNGData.xlsx");
		}
		int rows = utility.getRowCount("Sheet1");
		int cols = utility.getCellCount("Sheet1", 1);
		Object logindata[][]=new Object[rows][1];//coloumn change to 1
		Hashtable<String,String>table = null;

		for(int i=1;i<=rows;i++) //1
		{
			 table= new Hashtable<String,String>();
			for(int j=0;j<cols;j++) //0
			{
				//logindata[i-1][j]=utility.getCellData("Sheet1", i, j);
				table.put(utility.getCellData("Sheet1",0 , cols), utility.getCellData("Sheet1", rows, cols));
				System.out.println(table.get(table));
			//	logindata[i-1][0]=table;
			}
				
		}
		return logindata;
		
	}
	
}
