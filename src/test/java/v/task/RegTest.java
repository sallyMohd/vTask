package v.task;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserReg;

public class RegTest extends testBase 
{
	HomePage homeObject;
	UserReg regObject;
	LoginPage loginobject;
	

	@Test
	public void userCanRegistersuccessfully() 
	{
		homeObject = new HomePage(driver);
		homeObject.openRegPage();
		loginobject = new LoginPage(driver);
		loginobject.openRegForm();
		regObject = new UserReg(driver);
		regObject.userRegistration("Test", "user", "test123", "test,address", "city", "12345", "123456789");
		
		//verify that the user is redirected to home page and my account exists
		homeObject.userRegSuccess();
		

	}
}
