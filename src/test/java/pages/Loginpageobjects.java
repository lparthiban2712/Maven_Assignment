package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {

	WebDriver basedriver;
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement submit;
	

	
	
	public Loginpageobjects(WebDriver driver)
	{
		this.basedriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginTest(String uname, String Password)
	{
		username.sendKeys(uname);
		pwd.sendKeys(Password);
		submit.click();
	}
	
}
