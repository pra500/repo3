package com.qa.extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportdemoTest {
  @Test
  public void fTest() {	    
	  
	  
	 	  
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./reports/rpt1.html");
	  ExtentReports extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	  
	  ExtentTest logger = extent.createTest("LoginTest", "login to app");
	  logger.log(Status.INFO, "login successfully");
	  extent.flush();
	  
	  
	  ExtentTest logger1 = extent.createTest("homeTest", "navigate to homepage");
	  logger1.log(Status.PASS, "navigate to homepage successfully");
	  extent.flush();
	  
	  
	  ExtentTest logger2 = extent.createTest("homeTest", "click on a product");
	  logger2.log(Status.FAIL, "navigate to product page unsuccessfully");
	  extent.flush();
	  
	  
	  

  }
}
