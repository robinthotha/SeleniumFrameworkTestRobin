package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class SearchPage extends TestBase{

	
	@FindBy(id="selectProductSort")
	WebElement sort;
	Select sel;
	
	public void sortBy(){
		
		sel = new Select(sort);
		sel.selectByIndex(2);
	}
	
	public String SearchPageTitle(){
		
		return driver.getTitle();
	}
	
	
}
