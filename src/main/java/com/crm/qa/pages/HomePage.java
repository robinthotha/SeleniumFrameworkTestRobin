package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement logoText;
	
	@FindBy(linkText="Contact us")
	WebElement contactUsLink;
	
	@FindBy(id="search_query_top")
	WebElement searchField;
	
	@FindBy(name="submit_search")
	WebElement clickOnSearch;
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	}	
	
	public boolean getPageImage(){
		boolean flag=logoText.isDisplayed();
		return flag;		
	}
	
	public String getHomePageTitle(){
		
		return driver.getTitle();
		
	}	
	
	public ContactUsPage clickOnContactUs(){		
		
		contactUsLink.click();
		return new ContactUsPage();
	}

	public SearchPage clickOnSearch() {
		searchField.sendKeys(prop.getProperty("searchItem"));
		clickOnSearch.click();
		return new SearchPage();
	}

	

}
