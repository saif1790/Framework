package saif.alam.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListennerDemo implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		 
		System.out.println("This will execute when test case finished"+ result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		 
		System.out.println("This will execute when test case onStart"+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	 
		System.out.println("This will execute when test case fail"+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("This will execute when test case skipped"+ result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This will execute when test case started"+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This will execute when test case success"+ result.getName());
		
	}

}
