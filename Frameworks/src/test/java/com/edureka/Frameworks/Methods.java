package com.edureka.Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Methods {
	
	static WebDriver driver;
	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
    public static void maximizeBrowser() {
		
		driver.manage().window().maximize();
	}
    
    public static void navigateTo(String url) {
    	driver.get(url);
    	
    }
    public static void enterInvalidUsername(String value, String param) {
    	driver.findElement(By.id(value)).sendKeys(param);
    	
    }
    public static void enterInvalidPassword(String value, String param) {
    	driver.findElement(By.id(value)).sendKeys(param);
    	
    }
    
    public static void clickSubmit(String locator, String value) {
    	if(locator.equals("id")) {
    	    driver.findElement(By.id(value)).click();
    	}
    	else if(locator.equals("cssSelector")) {
    		driver.findElement(By.cssSelector(value)).click();
    		
    	}
    }
    
    public static void verifyMessage(String application, String value, String param) {
    	
    	if(application.equals("Facebook")) 
    	{
    	    String expectedMessage = param;
    	    String actualMessage = driver.findElement(By.cssSelector(value)).getText();
    	    Assert.assertEquals(actualMessage, expectedMessage);
    	}
    	else if(application.equals("BlazeDemo")) {
    		
    		boolean login = driver.findElement(By.linkText(value)).isDisplayed();
    		Assert.assertTrue(login);
    	}
    	
    	else if(application.equals("LinkedIn")) {
    		
    		String expectedMessage = param;
    	    String actualMessage = driver.findElement(By.id(value)).getText();
    	    Assert.assertEquals(actualMessage, expectedMessage);
    	}
    	
    	
    }
    
    public static void closeBrowser() {
    	driver.close();
    	
    	
    }


}
