package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SearchPage;

public class SearchPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homePage;
	SearchPage searchPage;
	
	public SearchPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialize();
		loginpage = new LoginPage();
		homePage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		searchPage=homePage.clickOnSearch();
	}
	
	@org.testng.annotations.Test
	public void validateTitle(){
		
		String title=searchPage.SearchPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Search - My Store");
	
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
}
