package paralleltesting;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelTestDataProvider {
	
	@Test(dataProvider="getdata")
	public void launchbrowser(String b)
	{
		Date d = new Date();
		System.out.println("launchinb browser--"+b+"--"+d);
	}
	
	@DataProvider(parallel=true)
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][1];
		data[0][0]="chrome";
		data[1][0]="firefox";
		return data;
	}

}
