package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserReg extends PageBase
{

	public UserReg(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "id_gender1")
	WebElement gender ;
	
	@FindBy(xpath = "//*[@id=\"customer_firstname\"]")
	WebElement firstName ;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName ;
	
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	WebElement password ;
	
	@FindBy(xpath = "//*[@id=\"address1\"]")
	WebElement Address ;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement city ;
	
	@FindBy(xpath = "//*[@id=\"id_state\"]")
	WebElement state ;
	
	@FindBy(xpath = "//*[@id=\"postcode\"]")
	WebElement postCode ;
	
	@FindBy(xpath = "//*[@id=\"phone_mobile\"]")
	WebElement phone ;
	
	@FindBy(xpath = "//*[@id=\"alias\"]")
	WebElement addaddress ;
	
	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span/i")
	WebElement submitBtn ;
	
	
	public void userRegistration(String FirstName , String LastName , String Password , String address , String City , String PostCode , String Phone ) 
	{
		gender.click();
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		password.sendKeys(Password);
		Address.sendKeys(address);
		city.sendKeys(City);
		 Select select = new Select(state);
		  select.selectByValue("2");
		
		postCode.sendKeys(PostCode);
		phone.sendKeys(Phone);
		addaddress.sendKeys(address);
		submitBtn.click();
	}

}
