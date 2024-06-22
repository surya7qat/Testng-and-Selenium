package testNG1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listenerExample implements ITestListener {
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("test failure");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("skipped");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("success");
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}

}



