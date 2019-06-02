package com.edureka.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagname {

public static WebDriver driver=null;							//Declaration
	
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com");
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println(allLinks.size());
			
			for(WebElement link : allLinks)
			{
				System.out.println(link.getText());
			}
			
			
			
			

	}

}
