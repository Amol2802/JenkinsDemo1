package com.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class LoginTest {
	
	@Test
	public void logiInTest() throws InterruptedException {	
		WebDriver driver = new ChromeDriver();  // Initialize the browser
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String title=driver.getTitle();  // get the title from page
		System.out.println(title);
		
		String currnetUrl=driver.getCurrentUrl();
		System.out.println(currnetUrl);          // get the current Url
		
		Thread.sleep(1000);
		
		driver.navigate().back();          // navigate to the previous back page
	
		Thread.sleep(1000);
		driver.navigate().forward();    // navigate to next page
		
	//	String pageSource=driver.getPageSource();    // return page source

	//	System.out.println(pageSource); 
		
	    driver.close();
	    
	    

	    // Locaters :-  id, name className , linkText, PartialLinkText, xpath, cssSelector, tagName
	    
	}

	

}
