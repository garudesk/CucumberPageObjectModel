package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Pages.ContactsPage;

public class HomePage extends TestBase{
	
	//public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='header item']")
	WebElement homepagelogo;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactbtn;

	public HomePage() {
		
	PageFactory.initElements(driver, this);	
		
	}
	
	
	public String HomePageTitle() {
		
		return driver.getTitle();
		
		
		
	}
	
	public boolean HomePageLogo() {
		
		return homepagelogo.isDisplayed();	
		
	}
	
	public ContactsPage ContactBtn() {
		
	    contactbtn.click();	
		
		return new ContactsPage();
	}
	

}
