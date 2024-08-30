package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import utility.Reports;
import utility.Screenshot;

public class Listeners extends BaseTest implements ITestListener{
	
	public void onStart(ITestResult Result) {
		reports=Reports.configureReports();
	}
	public void onFinish(ITestResult Result) {
		reports.flush();
	}
	
	public void onTestStart(ITestResult Result) {
		System.out.println("Test Started"+Result.getName());
	}
	public void onTestSuccess(ITestResult Result) {
				test.log(Status.PASS, Result.getName());
			
	}
	public void onTestFailure(ITestResult Result) {
		test.log(Status.FAIL, Result.getName());
		System.out.println("Test Failed"+Result.getName());
		
			try {
				Screenshot.TakescreenShot(driver, Result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void onTestSkip(ITestResult Result) {
				test.log(Status.SKIP, Result.getName());
		System.out.println("Test Skipped"+Result.getName());
	}

}
