package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports configureReports() {
		ExtentReports reports=new ExtentReports();
		ExtentSparkReporter htmlreporter=new ExtentSparkReporter("ExtentReports.html");
		reports.attachReporter(htmlreporter);
		reports.setSystemInfo("suitName","Regression");
		reports.setSystemInfo("CreatedBy","swara");
		return reports;
	}

}
