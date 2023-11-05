/**
 * 
 */
package utills;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * 
 */
public class ExtentReportsCalss {
	
	public static ExtentSparkReporter sparkReport;
	public static ExtentReports extent;
	
	
	@BeforeSuite
	public void setUpReport() {
		String timeStamp=new SimpleDateFormat("dd-MM-yyy-hh-mm-ss").format(new Date());
		String path=System.getProperty("user.dir")+"/src/test/resources/extent-reports/report_"+timeStamp+".html";
		
		sparkReport=new ExtentSparkReporter(path);
		sparkReport.config().setDocumentTitle("E-Commerse Mobile App Testing Report");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setReportName("E-Commerse Mobile App Functional Testing");
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReport);
		
		extent.setSystemInfo("Application Name", "E-Commerce Mobile Application");
		extent.setSystemInfo("Automation Toll", "Appium");
		extent.setSystemInfo("Operating System", "Windows");
		extent.setSystemInfo("Tester Name", "Anusha");
		
		
	}
	
	@AfterSuite
	public void tearDownReports() {
		extent.flush();
	}

}
