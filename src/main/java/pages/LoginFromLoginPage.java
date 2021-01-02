package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFromLoginPage extends PageBase
{

	public LoginFromLoginPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement email ;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	WebElement pass ;
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement loginBtn ;
	
	public void UserLogin(String Email, String Pass) 
	{
		email.sendKeys(Email);
		pass.sendKeys(Pass);
		loginBtn.click();
	}
}
