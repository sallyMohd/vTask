package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends PageBase
{

	public AddToCart(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[1]/div[3]/div/ul/li/a/img")
	WebElement clickItem ;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	WebElement addToCartBtn ;
	
	public void addToCart()
	{
	
		clickItem.click();
		addToCartBtn.click();
		 
	}
	
}
