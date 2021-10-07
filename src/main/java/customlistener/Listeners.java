package customlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener
{
	@Override  
	public void onTestStart(ITestResult result) {  
	// TODO Auto-generated method stub  
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	// TODO Auto-generated method stub  
	//System.out.println("Success of test cases and its details are : "+result.getName());
		System.out.println("Test case passed :"+result.getName());
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
	//System.out.println("Failure of test cases and its details are : "+result.getName());
	    System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href = \"D:\\selenium_Screenshot\\facebook1.png\"target=\"blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href = \"D:\\selenium_Screenshot\\facebook1.png\"target=\"blank\"><img heigh =100 width=200 src =\"D:\\selenium_Screenshot\\facebook1.png\"></a>");
		System.out.println("capturing the screenshot of failed test case--"+result.getName());
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onStart(ITestContext context) {  
	// TODO Auto-generated method stub  
	}  
	  
	@Override  
	public void onFinish(ITestContext context) {  
	// TODO Auto-generated method stub  
	}  

}
