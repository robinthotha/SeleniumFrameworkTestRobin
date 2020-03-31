//This is my test

package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class HomePageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{		
		initialize();
		loginPage = new LoginPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void validateTitle(){
		String val=homePage.getHomePageTitle();
		Assert.assertEquals(val, "My account - My Store","Title is not matched");
	}
	
	@Test(priority=2)
	public void validateImage(){
		boolean flag=homePage.getPageImage();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void performSearch(){
		homePage.clickOnSearch();
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}

}
