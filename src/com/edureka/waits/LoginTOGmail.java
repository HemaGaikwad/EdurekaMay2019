package com.edureka.waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTOGmail {

public static WebDriver driver=null;							//Declaration
public static WebDriverWait wait = null;
	
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 20);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://www.gmail.com");
			
			WebElement email = driver.findElement(By.id("identifierId"));
			email.sendKeys("seleniumedureka@gmail.com");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			driver.findElement(By.name("password")).sendKeys("Apple12345");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			wait.until(ExpectedConditions.titleContains("seleniumedureka@gmail.com"));
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Inbox"))
			{
				System.out.println("You have successfully logged in");
			}
			else
			{
				System.out.println("Login Failed!!");
			}

		Wait w = new FluentWait(TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}

}
