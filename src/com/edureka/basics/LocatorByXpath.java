package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpath {

public static WebDriver driver=null;							//Declaration
	
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://demo.automationtesting.in/WebTable.html");
			
			/*String absoluteXpath = "/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input";
			
			//Relative Xpath - Attribute and value pairs -//tagname[@attribute='value']
			WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			fname.sendKeys("Hema");
			
			
			//Relative Xpath - text() method - //tagname[text()='value']
			WebElement address = driver.findElement(By.xpath("//label[text()='Address']"));
			System.out.println(address.getText());
			
			//Relative xpath - pattern matching  --> starts-with and contains
			    //tagname[starts-with(@attribute, 'value')] or   //tagname[starts-with(text(), 'value')]     
			    //tagname[contains(@attribute, 'value')] or   //tagname[contains(text(), 'value')]     
			
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'connect and share')]")).getText());    //Facebook element
*/			
			//Xpath Axes
	
			WebElement emailAddress = driver.findElement(By.xpath("//span[text()='Email']//following::input"));
			System.out.println(emailAddress.getText());
			
			
			
			

	}

}
