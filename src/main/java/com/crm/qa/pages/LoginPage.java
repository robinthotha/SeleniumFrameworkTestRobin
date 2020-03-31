package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(linkText="Sign in")
	WebElement signInLink;
	
	@FindBy(id="email")
	WebElement emailAddress;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signIn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String un, String pwd){
		
		signInLink.click();
		emailAddress.sendKeys(un);
		password.sendKeys(pwd);
		signIn.click();		
		return new HomePage();
	}

	public String getLoginPageTitle(){
		return driver.getTitle();
	}
}
