package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactUsPage extends TestBase{
	
	
	@FindBy(id="message")
	WebElement messageBox;
	
	@FindBy(id="id_contact")
	WebElement subjectHandling;
	
	@FindBy(id="id_order")
	WebElement orderReference;
	
	@FindBy(id="submitMessage")
	WebElement submitMessageButton;
	
	@FindBy(xpath="//p[contains(text(),'alert alert-success')]")
	WebElement confiramtionText;
	
	Select select;
	Select select1;
	
	public ContactUsPage(){		
		PageFactory.initElements(driver, this);
	}

	
	public String getContactUsPageTitle(){
		
		return driver.getTitle();
	}
	
	public void sendMessage(String value1,String value2,String message){
		
		select = new Select(subjectHandling);
		select.selectByValue(value1);
		
		select1 = new Select(subjectHandling);
		select.selectByValue(value2);		
		messageBox.sendKeys(message);
		
		submitMessageButton.click();
//		return confiramtionText.getText();
		
   }
	
}
