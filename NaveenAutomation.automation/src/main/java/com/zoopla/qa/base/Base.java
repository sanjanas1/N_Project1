package com.zoopla.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver dr;
	public static Properties prop;
	
	public Base() 
	{
		try {
			prop= new Properties();
			FileInputStream file = new FileInputStream("F:/download/NaveenAutomation.automation/src/main/java/com/zoopla/qa/config/Config.properties");
   prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   
	}
	
	public static void init_driver()
	{
		String BrowserName= prop.getProperty("Browser");
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:/WebAutomation/Scenarios/chromedriver.exe");
			dr= new ChromeDriver();
		}
		dr.get(prop.getProperty("URL"));
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
  
}
