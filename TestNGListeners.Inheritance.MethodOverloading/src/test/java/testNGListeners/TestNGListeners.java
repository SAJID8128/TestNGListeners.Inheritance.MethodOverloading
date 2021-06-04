package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The test is starting : "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test was successfully executed/passed : "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test has FAILED : "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test was SKIPPED : "+ result.getName());
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("This test has failed but it is in defined success ratio." + result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("This test has failed with timeout" + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("I am the first one to be executed : "+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("I am the last one to be executed : "+ context.getName());
	}

}
