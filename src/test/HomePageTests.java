package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.AppleBase;
import pom.HomePageObjects;
import util.ReusableFunctions;


public class HomePageTests extends AppleBase{
	
	AppleBase obj;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		obj = new AppleBase();
		obj.initialize();
	}
	
	@Test
	public void validateHomePageMenuBar()
	{
		ReusableFunctions.waitForElement(HomePageObjects.menu());
		
		boolean macIsDisplayed = HomePageObjects.menuItemMac().isDisplayed();
		boolean iPadIsDisplayed = HomePageObjects.menuItemIPad().isDisplayed();
		boolean iPhoneIsDisplayed = HomePageObjects.menuItemIPhone().isDisplayed();
		
		Assert.assertEquals(macIsDisplayed, true);
		Assert.assertEquals(iPadIsDisplayed, true);
		Assert.assertEquals(iPhoneIsDisplayed, true);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
