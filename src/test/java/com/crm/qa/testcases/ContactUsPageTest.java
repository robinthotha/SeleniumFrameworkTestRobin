package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactUsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactUsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactUsPage contactUsPage;
	
	public ContactUsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialize();
		loginPage = new LoginPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		contactUsPage=homePage.clickOnContactUs();
		
	}
	
	@org.testng.annotations.Test
	public void validateSuccessMessageTest(){
		
		String title = contactUsPage.getContactUsPageTitle();
		Assert.assertEquals(title, "Contact us - My Store");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
