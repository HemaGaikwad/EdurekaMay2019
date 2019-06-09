package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingControls {

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
				driver.get("http://demo.automationtesting.in/Register.html");
				
				//Radio buttons and the checkboxes
	/*			WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
				maleRadioButton.click();
				
				driver.findElement(By.id("checkbox1")).click();
				
				WebElement switchTo = driver.findElement(By.xpath("//a[@href='SwitchTo.html']"));
				Actions action = new Actions(driver);
				action.moveToElement(switchTo).perform();
				driver.findElement(By.linkText("Alerts")).click();*/
				
				WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				
				Actions action = new Actions(driver);
				Action enterKeysInUppercase = action.keyDown(firstName, Keys.SHIFT).sendKeys("this is a demo text").keyUp(firstName, Keys.SHIFT).build();;
				enterKeysInUppercase.perform();
				
				

	}

}
