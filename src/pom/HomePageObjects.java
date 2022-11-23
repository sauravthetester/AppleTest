package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.AppleBase;

public class HomePageObjects {
	public static WebElement menuItemMac()
	{
		return AppleBase.driver.findElement(By.xpath("//nav[@id='ac-globalnav']//span[contains(text(),'Mac')]/.."));
	}
	public static WebElement menuItemIPad()
	{
		return AppleBase.driver.findElement(By.xpath("//nav[@id='ac-globalnav']//span[contains(text(),'iPad')]/.."));
	}
	public static WebElement menuItemIPhone()
	{
		return AppleBase.driver.findElement(By.xpath("//nav[@id='ac-globalnav']//span[contains(text(),'iPhone')]/.."));
	}
	
	public static WebElement menu()
	{
		return AppleBase.driver.findElement(By.xpath("//nav[@id='ac-globalnav']"));
		
	}
	public static WebElement menuItemSupport()
	{
		return AppleBase.driver.findElement(By.xpath("//nav[@id='ac-globalnav']//span[contains(text(),'Support')]/.."));
	}

	
}


