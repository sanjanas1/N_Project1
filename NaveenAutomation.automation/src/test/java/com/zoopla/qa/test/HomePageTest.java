package com.zoopla.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.Base;
import com.zoopla.qa.page.HomePage;
import com.zoopla.qa.page.PropList;

import junit.framework.Assert;

public class HomePageTest extends Base {
	HomePage homepage;
	PropList proplist;
	
	HomePageTest() throws IOException
	{
		super();
	}
@BeforeMethod
public void Setup() throws IOException
{
	init_driver();
	homepage= new HomePage();
	proplist= new PropList();
	
}

@Test
public void homepage()
{
	proplist=homepage.searchProperties();
	String titlepage= dr.getTitle();
	System.out.println(titlepage);
	if(titlepage.equalsIgnoreCase("Property for Sale in London - Buy Properties in London - Zoopla"));
    Assert.assertEquals("Property for Sale in London - Buy Properties in London - Zoopla", titlepage);
}
@AfterMethod
public void teardown()
{
	dr.quit();
}
}
