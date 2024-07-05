package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo2 {
@Test
	public void setup() {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		System.out.println("*******************  This is new  statement ********************");

	}
}
