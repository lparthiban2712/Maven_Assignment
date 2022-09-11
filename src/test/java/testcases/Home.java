package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpageobjects;

public class Home extends Baseclass {
	boolean flag=false;
	@Test
	public void Addtocart() throws InterruptedException
	{
		Loginpageobjects lp= new Loginpageobjects(driver);
		lp.LoginTest("standard_user", "secret_sauce");
		String productname="Sauce Labs Bike Light";
		WebElement add=driver.findElement(By.xpath("//div[text()='"+productname+"']/following::button[1]"));
		add.click();
		
		WebElement carticon=driver.findElement(By.cssSelector("a.shopping_cart_link"));
		carticon.click();
		List<WebElement> addedproducts=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for (WebElement product: addedproducts)
		{
			if(product.getText().equals(productname))
					{
				Thread.sleep(5000);
				System.out.println(productname+" is added successfully");
				flag=true;
				Assert.assertTrue(flag);
				break;
					}
		}
		
		if(flag==false)
		{
			System.out.println(productname+" is NOT added successfully");
			Assert.assertTrue(flag);

		}
		
		
		
	}

}
