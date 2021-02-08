package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="//*[@id=\"email_create\"]")
	WebElement createEmail ;
	
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
	WebElement submitEmail ;
	
	public void openRegForm() {
		createEmail.sendKeys("vtest14@mailinator.com");
		submitEmail.click();
	}
}
