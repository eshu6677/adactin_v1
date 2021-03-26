package Utilities;

import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Repoting {
	
	
	
	 
	public ExtentSparkReporter  sparkReporter;
	public ExtentReporter extent;
    public ExtentTest test;
    
    @BeforeTest
    public void setExtent(){
    	
    	
    	sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"test-output/myReport.html");
    	
    	sparkReporter.config().setDocumentTitle("Automation Testing");//Title of the Report
    	sparkReporter.config().setReportName("Functional Report");//Name of the Report
    	
    	
    	
    }
}
