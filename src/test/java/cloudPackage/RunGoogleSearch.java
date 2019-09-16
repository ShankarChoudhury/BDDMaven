package cloudPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunGoogleSearch {
	WebDriver driver;
	
	@Given("^Launch browser$")
	public void Launch_browser() throws Throwable {
		 // System.setProperty("webdriver.ie.driver",LoadProperty.readProperty("IEdriver"));
		  System.setProperty("webdriver.ie.driver","C:\\java-workspace\\applications\\New folder\\IEDriverServer.exe");
		     driver = new InternetExplorerDriver();
	}
	@When("^browser is launched$")
	public  void browser_is_launched() throws Throwable {
		driver.get("http://www.google.com");
	}
	@Then("^Send a \"([^\"]*)\"$")
	public void Send_a_keyword(String keywordName) throws Throwable {
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(keywordName);
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	//  driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	  Thread.sleep(3000);
	  System.out.print("the Browser title is "+driver.getTitle());
	  
	}
	
	@Then("^close the Browser$")
	public void close_the_Browser() throws Throwable {
		driver.quit();
	//	SendLog.sendEmail();
	}
	
}
