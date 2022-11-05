package com.Listeners1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class Base {
	

	public static WebDriver driver;
	
	public static void initialization()
	{
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Music\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("ruchi818@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("pra18@123");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		
				
	}
	
	
	
  public void screenshotoffailedtc() throws IOException  
  {
	  
	//Convert web driver object to TakeScreenshot
	  TakesScreenshot scrShot =((TakesScreenshot)driver);
	  //Call getScreenshotAs method to create image file
	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	  //Move image file to new destination
	  File DestFile=new File("C:\\Users\\dell\\eclipse-workspace\\FailedTCscreenshotonly\\myscreens\\failddd.jpg");
	//Copy file at destination
	  FileUtils.copyFile(SrcFile, DestFile);
	 
  }

}
