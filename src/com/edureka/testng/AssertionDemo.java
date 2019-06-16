package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertionDemo 
{
	
	public static WebDriver driver=null;	
	public static WebDriverWait wait = null;
	
			
	@DataProvider
	public String[][] getData()
	{
		String[][] credentials = new String[1][2];
		
		credentials[0][0] = "seleniumedureka@gmail.com";
		credentials[0][1] = "Apple12345";
		
		return credentials;
	}
	
	@BeforeMethod
	public void launchApp()
	{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
	}
	
	
	@Test(dataProvider= "getData")
	public void loginToGmail(String username, String password)
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys(username);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		String exp_title = "Inbox (28) - seleniumedureka@gmail.com - Gmail";
		wait.until(ExpectedConditions.titleContains("seleniumedureka@gmail.com"));
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		Assert.assertEquals(act_title, exp_title);
		
		/*
		if(title.contains("Ibnox"))
		{
			System.out.println("You have successfully logged in");
		}
		else
		{
			System.out.println("Login Failed!!");
		}*/

	}
	
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
