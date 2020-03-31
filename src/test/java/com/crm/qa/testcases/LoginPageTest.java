package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}	
	
	@BeforeMethod
	public void setUp(){		
		initialize();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginTest(){		
		homepage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void validateLoginPageTitleTests(){
		
		String title=loginPage.getLoginPageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	
	@AfterMethod
	public void tearDown(){		
		driver.quit();
	}

}
