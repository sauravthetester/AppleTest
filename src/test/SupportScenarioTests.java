package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.AppleBase;
import pom.HomePageObjects;
import pom.SupportPageObjects;
import util.ReusableFunctions;

public class SupportScenarioTests extends AppleBase{
AppleBase obj;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		obj = new AppleBase();
		obj.initialize();
	}
	
	@Test
	public void validateYesAndNoButtonExistOnHelpChargingPage()
	{
		ReusableFunctions.waitForElement(HomePageObjects.menu());
		
		HomePageObjects.menuItemSupport().click();
		
		ReusableFunctions.waitForElement(SupportPageObjects.iPhoneImageLink());
		
		SupportPageObjects.iPhoneImageLink().click();
		
		ReusableFunctions.waitForElement(SupportPageObjects.helpChargingLink());
		
		SupportPageObjects.helpChargingLink().click();
		
		boolean yesButtonFound = ReusableFunctions.scrollTillElementFound(SupportPageObjects.helpFulYesButton());
		
		Assert.assertEquals(yesButtonFound, true);
		
		boolean noButtonFound = SupportPageObjects.helpFulNoButton().isDisplayed();
		
		Assert.assertEquals(noButtonFound, true);
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
