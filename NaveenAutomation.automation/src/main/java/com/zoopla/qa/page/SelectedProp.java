package com.zoopla.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoopla.qa.base.Base;

public class SelectedProp extends Base {

	@FindBy(xpath="//h4[contains(@class, 'name')]")
	WebElement agentName;
	@FindBy(xpath="")
	
}
