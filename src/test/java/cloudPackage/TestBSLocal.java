package cloudPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBSLocal {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.gecko.driver", "C:\\java-workspace\\applications\\geckodriver\\geckodriver.exe");
		
		
		String URL = "https://anind1:7tu5Q1jE1NNxvvDSnnxN@hub-cloud.browserstack.com/wd/hub";
		//WebDriver driver = new FirefoxDriver();
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("os_version", "7.0");
		dcap.setCapability("device", "Samsung Galaxy S8");
		dcap.setCapability("real_mobile", "true"); 
		dcap.setCapability("browserstack.local", "true"); 
		
		URL BSurl = new URL(URL);
		WebDriver driver = new RemoteWebDriver(BSurl,dcap);
		
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		
		driver.get("http://192.168.54.2:8080/DemoWebApp/");
		
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("apuchu");
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("puchupu012");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		System.out.println("The alert text is ---- "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		System.out.println("The browser title for home page is ---- "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='LogMeOut']")).click();
		
		driver.quit();
	}

}
