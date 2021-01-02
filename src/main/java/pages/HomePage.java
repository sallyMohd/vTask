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
	
		public void openRegPage() {
			
			signIn.click();
		}
		
		public void openWomenTab() {
			tab.click();
			
		}

}
