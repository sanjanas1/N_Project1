package com.zoopla.qa.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.Base;

public class PropList extends Base {
	
	@FindBy(how = How.XPATH, using = "//li[contains(@id,'listing_')]//a[contains(@class, 'price')]")
	List<WebElement> listprop;
	
	List<Integer> pricelist = new ArrayList<Integer>();	

public PropList()
{
	PageFactory.initElements(dr, this);
}

public void maxExpensiveList()
{   
	for(WebElement propprice: listprop)
	{
		if(propprice.getText().replaceAll("[^0-9]", "").isEmpty())
		{
			System.out.println(propprice.getText()+"is not a price" );
		}
		else
		{
			pricelist.add(Integer.parseInt(propprice.getText().replaceAll("[^0-9]", "")));
		}	
	}
	
	Collections.sort(pricelist, Collections.reverseOrder());
	System.out.println(pricelist);	
}
public SelectedProp clickPosition(int position)
{
listprop.get(position).click();
return new SelectedProp();
}
}

