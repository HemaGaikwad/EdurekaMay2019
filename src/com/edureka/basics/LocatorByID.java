package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByID {
	
	public static WebDriver driver=null;							//Declaration
	
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com");
			
			String title = driver.getTitle();
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("your_email_address");
		
			
			/*
			String idValue = email.getAttribute("id");
			System.out.println(idValue);*/


	}

}
