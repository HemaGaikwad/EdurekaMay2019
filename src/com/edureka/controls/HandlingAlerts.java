package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

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
				driver.get("http://demo.automationtesting.in/Alerts.html");
			
				//information popup
				/*WebElement button = driver.findElement(By.xpath("//button[contains(text(),'display an  alert box')]"));
				button.click();
				
				Alert alert = driver.switchTo().alert();
				Thread.sleep(3000);
				alert.accept();*/
				
				//Confirmation popup
				/*driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
				WebElement button = driver.findElement(By.xpath("//button[contains(text(),'display a confirm box')]"));
				button.click();
				
				Alert alert = driver.switchTo().alert();
				Thread.sleep(3000);
				//alert.accept();
				System.out.println(alert.getText());
				alert.dismiss();
				System.out.println(driver.findElement(By.id("demo")).getText());
				*/
				//Modal Popup
				
				driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
				WebElement button = driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt box')]"));
				button.click();
				
				Alert alert = driver.switchTo().alert();
				Thread.sleep(3000);
				System.out.println(alert.getText());
				alert.sendKeys("Edureka");
				alert.accept();
				System.out.println(driver.findElement(By.id("demo1")).getText());
				
				
	}

}
