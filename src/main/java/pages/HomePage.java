package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
	}	
		@FindBy(xpath ="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
		WebElement signIn ;
		
		@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		WebElement tab ;
		
		@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")
		WebElement userName ;
		
		@FindBy(xpath = "/html/body/div/div[2]/div/div[1]/span[2]")
		WebElement myAccount ;
	
		public void openRegPage() {
			
			signIn.click();
		}
		
		public void openWomenTab() {
			tab.click();
			
		}
		public void userLoginSuccess() {
			userName.isDisplayed();
		}
		
		public void userRegSuccess() {
			myAccount.isDisplayed();
		}

}
