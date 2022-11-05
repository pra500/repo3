package com.Listeners1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener1.class)
public class OpencartTest extends Base{
	
	
	@BeforeClass
	public void beforeClass() {
		
		Base.initialization();
	
	}
	
	@Test(priority = 1)
	public void getTest()
	{	
		
		driver.findElement(By.xpath("//a[normalize-space()='Edit your account informat1ion']")).click();
				
			}
	
	
	
	@Test(priority = 2)
	public void get1Test()
	{
		Assert.assertEquals(12, 13);
	}
	
	
	@Test(priority = 3)
	public void get2Test()
	{	
		
		driver.findElement(By.xpath("//a[normalize-space()='View your return requaests']")).click();
				
			}
	

	
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
