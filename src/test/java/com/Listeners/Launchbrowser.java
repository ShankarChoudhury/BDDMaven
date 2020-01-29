package com.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launchbrowser {
	 WebDriver driver;
	 
	 
	 @BeforeSuite
	 public void setUp() {
			ChromeOptions chrOptions = new ChromeOptions();
			chrOptions.addArguments("–-lang= en");
			chrOptions.addArguments("start-maximized");
		
			System.setProperty("webdriver.chrome.driver", "C:\\java-workspace\\applications\\iedriver\\chromedriver.exe");

		   driver = new ChromeDriver(chrOptions);
		 
	 }
	 @Test
	public void launchTest() {
		
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   
		   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		   
		   System.out.println("The browser title is ------ "+driver.getTitle());
	}
	 @Test
		public void launchGoogle() {
			
			   driver.get("https://google.com/");
			   
			   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			   
			   System.out.println("The browser title is ------ "+driver.getTitle());
		}
	 @AfterSuite
	 public void cleanUp() {
			driver.quit();
		 
	 }
}
