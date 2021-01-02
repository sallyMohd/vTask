package v.task;

import org.testng.annotations.Test;

import pages.AddToCart;
import pages.HomePage;
import pages.LoginFromLoginPage;

public class AddCartTest extends testBase
{
	HomePage homeObject;
	LoginFromLoginPage loginobject;
	AddToCart addcartobject;
	
	@Test
	public void userCanAddItemToCart() 
	{
		homeObject = new HomePage(driver);
		homeObject.openRegPage();
		loginobject = new LoginFromLoginPage(driver);
		loginobject.UserLogin("test12345@mailinator.com", "test123");
		homeObject = new HomePage(driver);
		homeObject.openWomenTab();
		addcartobject = new AddToCart(driver);
		addcartobject.addToCart();
	
		
	}

}
