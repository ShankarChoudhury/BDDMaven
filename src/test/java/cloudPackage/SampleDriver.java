package cloudPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class SampleDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\java-workspace\\applications\\iedriver\\chromedriver.exe");

		   WebDriver driver = new ChromeDriver();
	
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   
		//   driver.close();
		   
		   driver.get("https://google.com/");
		
		   driver.close();
		   
		   driver.quit();
	}

}
