package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkText {

public static WebDriver driver=null;							//Declaration
	
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com");
			
			WebElement forgottenAccnt = driver.findElement(By.linkText("Forgotten account?"));
			forgottenAccnt.click();

	}

}
