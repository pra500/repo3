package com.qa.extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpencartTest {
  @Test
  public void fTest() {
	  
	  //ve used extentreport vers. 3
	  //mukesh video
	  //ref doc:  https://www.extentreports.com/docs/versions/3/java/index.html#examples
	  //4 lines of code we need to remember 
	  
	  
	  
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
	    
     
      ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
      
      
      ExtentTest logger = extent.createTest("loginTest", "logggg"); 
      
      logger.log(Status.INFO, "login to app");      
      extent.flush();
      
      ExtentTest logger1 = extent.createTest("productTest", "productdd"); 
      logger1.log(Status.PASS, "product page");
      extent.flush();
      
      
      ExtentTest logger3 = extent.createTest("myaccount", "loghhhht");
      logger3.log(Status.FAIL, "myaccountpage");
      extent.flush();
      
      
     
      ExtentTest logger4 = extent.createTest("logoff", "loghhhh");
      logger4.log(Status.FAIL, "logoff page");
      extent.flush();
  }
}
