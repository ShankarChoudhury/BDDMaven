package cloudPackage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

//import com.web.login.com.LoadProperty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class LoginKimai {
	static WebDriver driver;
//	@Test(priority=1)
	@Given("^I am on home page of Kimai Application$")
	public static void I_am_on_home_page_of_Kimai_Application() throws Throwable {
		//System.setProperty("webdriver.ie.driver", LoadProperty.readProperty("IEdriver"));
		//ChromeOptions chromeopt = new ChromeOptions();
	//	chromeopt.addArguments("--headless");
		System.setProperty("webdriver.gecko.driver", "C:\\java-workspace\\applications\\geckodriver\\geckodriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(ChromeOptions.CAPABILITY, chromeopt);
		cap.setCapability("browserName", "chrome");
		//driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"),cap);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get("https://demo.kimai.org/");
		//ExtentReport rep = new ExtentReports
	}
	//@Test(priority=2)
	@When("^I login with valid credentials$")
	public void I_login_with_valid_credentials() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("kimaiusername")).sendKeys("admin");
		driver.findElement(By.id("kimaipassword")).sendKeys("changeme");
		driver.findElement(By.id("loginButton")).click();
	}
	//@Test(priority=3)
	@Then("^I should see home page$")
	public void I_should_see_home_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("The Browser title is "+driver.getTitle());
		System.out.println("The logged in user is "+driver.findElement(By.xpath("//a[@id='main_tools_button']/following-sibling::b")).getText());
		// Add customer
		driver.findElement(By.xpath("//div[@id='customers_foot']/a[@class='addLink']")).click();
		
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//span[@id='floater_title' and text()='add customer']")).isDisplayed()){
			
			System.out.println("Add customer window id displayed");
			// General Entry
			
		//	driver.findElement(By.xpath("//div[@id='floater_handle']//a[@class='close']")).click();
			
		}
		}
		
		@Then("^create customer \"([^\"]*)\" in the application$")
		public void create_customer(String name) throws Throwable {
		    // Express the Regexp above with the code you wish you had
			driver.findElement(By.xpath("//label[contains(text(),'Customer')]/following-sibling::input[@id='name']")).sendKeys(name);
			
			//	driver.findElement(By.id("loginButton")).click();
				
				driver.findElement(By.id("vat")).sendKeys("4");
				
				// Address Entry
				driver.findElement(By.xpath("//span[text()='Address']")).click();
				
				driver.findElement(By.id("company")).sendKeys("Automation Solutions");
				driver.findElement(By.id("contactPerson")).sendKeys("Devon Smith");
				driver.findElement(By.id("street")).sendKeys("161 Lexington Street");
				driver.findElement(By.id("city")).sendKeys("Kolkata");
				
				Select countryObj = new Select(driver.findElement(By.id("country")));
				countryObj.selectByVisibleText("India");
				driver.findElement(By.xpath("//input[@class='btn_ok' and @value='OK']")).click();
				//driver.findElement(By.id("zipcode")).sendKeys("90078");
				Thread.sleep(5000);
		}

	
	//@Test(priority=4)
	@Then("^I logout of the application$")
	public void I_logout_of_the_application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("main_logout_button")).click();
		driver.quit();
		
	}
	@When("^i am on create project page$")
	public void i_am_on_create_project_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Add Activity
		
		addActivity();
		//
		
	driver.findElement(By.xpath("//div[@id='projects_foot']/a[@class='addLink']")).click();
		
	
	}

	@When("^i provide all mandatory fields with Project \"([^\"]*)\" and CusName \"([^\"]*)\"$")
	public void i_provide_all_mandatory_fields_with_Project_and_CusName(String projName, String custName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		// General Tab
		driver.findElement(By.xpath("//label[contains(text(),'Project')]/following-sibling::input[@id='name']")).sendKeys(projName);
		
		Select cus = new Select(driver.findElement(By.id("customerID")));
	//	cus.selectByValue(custName);
		cus.selectByVisibleText(custName);
		//  Add Budget 
		driver.findElement(By.xpath("//ul[@role='tablist']//span[text()='Budget']")).click();
		driver.findElement(By.id("defaultRate")).sendKeys("25");
		driver.findElement(By.id("myRate")).sendKeys("45");
		driver.findElement(By.id("fixedRate")).sendKeys("30");
		driver.findElement(By.id("project_budget")).sendKeys("30000");
		driver.findElement(By.id("project_effort")).sendKeys("650");
		driver.findElement(By.id("project_approved")).sendKeys("650");
		//Add Activities
		driver.findElement(By.xpath("//ul[@role='tablist']//span[text()='Activities']")).click();
		Select act = new Select(driver.findElement(By.id("newActivity")));
		act.selectByVisibleText("Testing");
		driver.findElement(By.xpath("//input[@name='budget[]']")).sendKeys("30000");
		driver.findElement(By.xpath("//input[@name='effort[]']")).sendKeys("650");
		driver.findElement(By.xpath("//input[@name='approved[]']")).sendKeys("650");
		// Add Comments
		driver.findElement(By.xpath("//ul[@role='tablist']//span[text()='Comment']")).click();
		driver.findElement(By.id("projectComment")).sendKeys("This is an Automation Project");
		
		driver.findElement(By.xpath("//input[@class='btn_ok' and @value='OK']")).click();
	}

	@Then("^project \"([^\"]*)\" is created$")
	public void project_is_created(String ProName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    if (driver.findElement(By.xpath("//td[@class='projects' and contains(text(),'"+ProName+"')]")).isDisplayed()) {
	    	
	    	System.out.println("The New Project is Created");
	    	
	    }
	    else {
	    	
	    	System.out.println("The New Project is not Created");
	    }
	}
	public static void addActivity() {
		
		driver.findElement(By.xpath("//div[@id='activities_foot']/a[@class='addLink']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Activity')]/following-sibling::input[@id='name']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@class='btn_ok' and @value='OK']")).click();
	}
	@When("^i generate report$")
	public static void genReport() {
		
		/*File reportOutputDirectory = new File("target");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("cucumber.json");
		//jsonFiles.add("cucumber-report-2.json");

		String buildNumber = "1";
		String projectName = "cucumberProject";
		boolean runWithJenkins = false;

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration - check javadoc
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");

		// optionally add metadata presented on main page via properties file
		List<String> classificationFiles = new ArrayList<>();
		classificationFiles.add("properties.properties");
		//classificationFiles.add("properties-2.properties");
		configuration.addClassificationFiles(classificationFiles);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();*/
	}
}
