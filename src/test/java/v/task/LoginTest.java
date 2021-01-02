package v.task;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginFromLoginPage;

public class LoginTest extends testBase
{
	HomePage homeObject;
	LoginFromLoginPage loginobject;
	
	@Test
	public void userCanLogin() 
	{
		homeObject = new HomePage(driver);
		homeObject.openRegPage();
		loginobject = new LoginFromLoginPage(driver);
		loginobject.UserLogin("test12345@mailinator.com", "test123");
	}
	
}
