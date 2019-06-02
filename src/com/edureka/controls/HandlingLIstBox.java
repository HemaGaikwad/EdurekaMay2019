package com.edureka.controls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingLIstBox {

	public static WebDriver driver=null;	
	public static WebDriverWait wait = null;
		
		public static void main(String[] args)
		{
				System.setProperty("webdriver.chrome.driver", "C:\\Edureka_May19\\SeleniumProject\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 20);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get("http://demo.automationtesting.in/Register.html");
				
		/*		WebElement skillsListbox = driver.findElement(By.id("Skills"));
				Select skills = new Select(skillsListbox);
				
				//skills.selectByIndex(8);
				
				//	skills.selectByValue("Art Design");
				
				skills.selectByVisibleText("Engineering");
				
				
				//Interview Questions: 
				
				List<WebElement> allOptions = skills.getOptions();
				System.out.println(allOptions.size());*/
			/*	
				for(WebElement option :allOptions )
				{
					String listText = option.getText();
					System.out.println(listText);
				}
				*/
				
		/*	for(int i = 0; i<allOptions.size(); i++)
			{
					WebElement option = allOptions.get(i);
					String listText = option.getText();
					System.out.println(listText);
					
			}*/
				
				ArrayList<String> countryList = new ArrayList<String>();
				WebElement countrydropdown = driver.findElement(By.id("countries"));
				Select country = new Select(countrydropdown);
				List<WebElement> allCountries = country.getOptions();
				for(int i =0; i<allCountries.size();i--)
				{
					WebElement country1 = allCountries.get(i);
					String countryText = country1.getText();
					countryList.add(countryText);			
				}
				Collections.sort(countryList);
				/*for(String text :countryList )
				{
					System.out.println(text);
				}*/
				
				Collections.reverse(countryList);
				for(String text :countryList )
				{
					System.out.println(text);
				}
				
			List<WebElement> selected = country.getAllSelectedOptions();	
			for(WebElement text :selected )
			{
				System.out.println(text.getText());
			}
				
			
			
	}

}
