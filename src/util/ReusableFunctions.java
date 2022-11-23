package util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.AppleBase;



public class ReusableFunctions {
	public static void waitForElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(AppleBase.driver, Duration.ofSeconds(20));
		String xpath = ReusableFunctions.generateXPATH(element, "");
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	private static String generateXPATH(WebElement childElement, String current) {
	    String childTag = childElement.getTagName();
	    if(childTag.equals("html")) {
	        return "/html[1]"+current;
	    }
	    WebElement parentElement = childElement.findElement(By.xpath("..")); 
	    List<WebElement> childrenElements = parentElement.findElements(By.xpath("*"));
	    int count = 0;
	    for(int i=0;i<childrenElements.size(); i++) {
	        WebElement childrenElement = childrenElements.get(i);
	        String childrenElementTag = childrenElement.getTagName();
	        if(childTag.equals(childrenElementTag)) {
	            count++;
	        }
	        if(childElement.equals(childrenElement)) {
	            return generateXPATH(parentElement, "/" + childTag + "[" + count + "]"+current);
	        }
	    }
	    return null;
	}
	
	public static boolean scrollTillElementFound(WebElement element)
	{
		for(int i=0; i<20; i++)
    	{
    		((JavascriptExecutor) AppleBase.driver).executeScript("window.scrollBy(0,100)", "");
    		
    		try
    		{
    			element.isDisplayed();
    			return true;
				
			} 
    		catch (Exception e)
    		{
				
			}
    		
    	}
		
		return false;
	}
}
