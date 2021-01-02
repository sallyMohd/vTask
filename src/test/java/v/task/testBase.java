package v.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {
	
	public static WebDriver driver ;
	
	@BeforeSuite
	public void startDriver() 
	{
		String chromePath = System.getProperty("user.dir")+"\\resources\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}
}
