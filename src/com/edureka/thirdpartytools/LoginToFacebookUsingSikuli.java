package com.edureka.thirdpartytools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class LoginToFacebookUsingSikuli 
{
	
	public static WebDriver driver=null;	
	public static WebDriverWait wait = null;
	
	@Test
	public void loginToFacebook() throws FindFailed
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		Screen screen = new Screen();
		Pattern email = new Pattern(".\\ImagesForTesting\\Email.PNG");
		Pattern password = new Pattern(".\\ImagesForTesting\\Password.PNG");
		Pattern login = new Pattern(".\\ImagesForTesting\\Login.PNG");
		
		screen.wait(email,5);
		screen.type(email, "your_email_address");
		screen.type(password,"your_password");
		screen.click(login);
	}

}
