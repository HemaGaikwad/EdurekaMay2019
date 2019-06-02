package com.edureka.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
		public static WebDriver driver;							//Declaration
		
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			String browserId = driver.getWindowHandle();
			System.out.println(browserId);   
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
		//	driver.get("https://www.facebook.com");
			
			driver.navigate().to("https://www.facebook.com");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			driver.close();
			
			//driver.quit();
			
			
	}

}
