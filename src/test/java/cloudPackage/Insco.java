package cloudPackage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javafx.application.Application;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Insco {
WebDriver driver;
	@Given("^I am on home page of InsCo Application$")
	public void i_am_on_home_page_of_InsCo_Application() throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		driver = new RemoteWebDriver(new URL("http://192.168.54.2:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.borland.com/InsuranceWebExtJS/index.jsf");
	}

	@When("^I login with credentials$")
	public void i_login_with_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-form:email")).sendKeys("john.smith@gmail.com");
		driver.findElement(By.id("login-form:password")).sendKeys("john");
		driver.findElement(By.id("login-form:login")).click();
	}

	@Then("^I should successfully view the Home Page$")
	public void i_should_successfully_view_the_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click Button");
		//JOptionPane.showMessageDialog(null, "information", "information", JOptionPane.OK_OPTION); 
		System.out.println("Button Clicked");
		
	//	JOptionPane.showInternalMessageDialog(JOptionPane.getRootFrame(), "information", "information", JOptionPane.OK_OPTION);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('Hi')");
	//	js.executeAsyncScript("window.confirm(\"Hi\");");
		//js.executeScript("alert('Hi Shankar!this is a test alert')");
		if (driver.findElement(By.xpath("//p[text()='Logged in as']//following-sibling::label")).getText().equals("John Smith")){
			
			System.out.println("User 'John Smith' is successfully logged in to Insurance Co");
		}
	}
	@Then("^I signout of the application$")
	public void i_signout_of_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("logout-form:logout")).click();
		driver.quit();
	}
}
