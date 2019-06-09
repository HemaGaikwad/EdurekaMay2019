package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

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
				driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
				
				WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
				WebElement column3 = driver.findElement(By.id("column-3"));
				
				Actions action = new Actions(driver);
				action.dragAndDrop(block1, column3).perform();
	}

}
