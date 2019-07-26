package com.base.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest  {
	public ExtentReports extent;
	 public ExtentHtmlReporter htmlReporter;
	 public ExtentTest test;
	
	@BeforeTest
	public void setup() {
		// initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
		/*
		 * //To add system or environment info by using the setSystemInfo method.
		 * extent.setSystemInfo("OS", "Windows"); extent.setSystemInfo("Browser",
		 * "Chrome"); htmlReporter.config().setChartVisibilityOnOpen(true);
		 * htmlReporter.config().setDocumentTitle("Extent Report Demo");
		 * htmlReporter.config().setReportName("Test Report");
		 * htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 * htmlReporter.config().setTheme(Theme.STANDARD); htmlReporter.config().
		 * setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		 */
       
		
	}
	 @BeforeMethod
	    public void beforeTest(ITestResult result) {
	    	//to write or update test information to reporter
		 test=extent.createTest(result.getMethod().getMethodName());
	    }
	 
	 @AfterMethod
	    public void afterTest(ITestResult result) {
	    	//to write or update test information to reporter
		 extent.flush();
	    }
	 @AfterTest
	    public void tearDown() {
	    	//to write or update test information to reporter
	        extent.flush();
	    }
	
}
