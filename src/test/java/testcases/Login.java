package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpageobjects;

public class Login extends Baseclass{
	
	
@Test
public void Test1()
{
	Loginpageobjects lp= new Loginpageobjects(driver);
	lp.LoginTest("standard_user", "secret_sauce");
	WebElement homepage=driver.findElement(By.cssSelector("span.title"));
	String Actual=homepage.getText();
	System.out.println(Actual);
	Assert.assertTrue(homepage.isDisplayed());
	
}

@Test
public void Test2()
{
	Loginpageobjects lp= new Loginpageobjects(driver);
	lp.LoginTest("dummyusername", "dummypwd");
	WebElement error=driver.findElement(By.cssSelector("[data-test='error']"));
	String Actualerror=error.getText();
	System.out.println(Actualerror);
	Assert.assertTrue(error.isDisplayed());
	
}
}
