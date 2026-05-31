package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportmanager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
public void onStart(ITestContext context) {
	    
	sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myreport.html");
	sparkReporter.config().setDocumentTitle("Automation report");
	sparkReporter.config().setReportName("Functional Testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Computer Name", "localhost");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Testet Name", "Venkat");
	extent.setSystemInfo("os", "windows10");
	extent.setSystemInfo("Browser Name", "Chrome");
	
	
	  }
	
	 
	 
	 public void onTestSuccess(ITestResult result) {
		 test = extent.createTest(result.getName()) ;
		 test.log(Status.PASS, "Test case is PASSED is:"+result.getName());
		 
		    
		  }
	 public void onTestFailure(ITestResult result) {
		 
		 test = extent.createTest(result.getName()) ;
		 test.log(Status.FAIL, "Test case is FAILED is:"+result.getName());
		 test.log(Status.FAIL, "Test case is FAILED caused is:"+result.getThrowable());

		    
		  }
	 public void onTestSkipped(ITestResult result) {
	test = extent.createTest(result.getName());
	test.log(Status.SKIP, "Test Case SKIPPED is:"+result.getName());
		 
		  
		  }
	 public void onFinish(ITestContext context) {
		
		 extent.flush();
		   
		  }
	

}
