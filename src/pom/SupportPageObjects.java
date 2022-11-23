package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.AppleBase;

public class SupportPageObjects {
	
	public static WebElement iPhoneImageLink()
	{
		return AppleBase.driver.findElement(By.xpath("//div[@class='as-imagegrid']//span[contains(text(),'iPhone')]"));
	}
	
	public static WebElement helpChargingLink()
	{
		return AppleBase.driver.findElement(By.xpath("//div[contains(@class,'as-promo')]//span[text()='Help charging']"));
	}
	
	public static WebElement helpFulYesButton()
	{
		return AppleBase.driver.findElement(By.xpath("//div[@class='helpful-btn-grp']/button[normalize-space()='Yes']"));
	}
	
	public static WebElement helpFulNoButton()
	{
		return AppleBase.driver.findElement(By.xpath("//div[@class='helpful-btn-grp']/button[normalize-space()='No']"));
	}
	
	
	
	
	
}
