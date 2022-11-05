package com.lis;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {	
	
	public static WebDriver driver;
	
	public static void initial()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Music\\chromedriver.exe");		
	  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jcpenney.com/");
		
	}

	
	public static void get2() throws IOException
	{
		
	TakesScreenshot ts=(TakesScreenshot) driver;
	File f1=ts.getScreenshotAs(OutputType.FILE);
	
	File f2=new File("C:\\Users\\dell\\eclipse-workspace\\FailedTCscreenshotonly\\myscreens\\scn1.jpg");
	FileUtils.copyFile(f1, f2);	
		
	}

}
