package com.zoopla.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.Base;

public class HomePage extends Base {


@FindBy(xpath="//*[@id=\"search-input-location\"]")
WebElement Sale;

@FindBy(xpath= "//*[@id='search-submit']")
WebElement Search;

public HomePage() {
	PageFactory.initElements(dr, this);
	}


public PropList searchProperties()
{
	Sale.sendKeys("London");
	Search.click();
	return new PropList();
}

}
