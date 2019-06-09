package com.edureka.controls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingChildBrowserPopups {

	public static WebDriver driver=null;	
	public static WebDriverWait wait = null;
		
		public static void main(String[] args) throws InterruptedException
		{
				System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 20);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get("http://www.popuptest.com/");
				
				driver.findElement(By.linkText("Multi-PopUp Test")).click();
				
				String parent = driver.getWindowHandle();
				Set<String> allBrowsers = driver.getWindowHandles();
				for(String handle : allBrowsers)
				{
					if(handle.equals(parent))
						continue;
					else
					{
					driver.switchTo().window(handle);
					driver.manage().window().maximize();
					System.out.println(driver.getCurrentUrl());
					driver.close();
					}
				}

	}

}
