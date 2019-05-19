package com.zoopla.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.Base;
import com.zoopla.qa.page.HomePage;
import com.zoopla.qa.page.PropList;

public class PropListTest extends Base {
    HomePage homepage;
    PropList proplist;
	public PropListTest()
	{
		super();
	}
	@BeforeMethod
	public void Setup() throws IOException
	{
		init_driver();
		homepage = new HomePage();		
		proplist= homepage.searchProperties();
	}
	
	@Test
		public void listpropTest()
		{
		proplist.maxExpensiveList();	
	    }
	@AfterMethod
	 public void teardown()
	 {
		dr.quit();
	 }
}
