package com.qa.locationtest.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.locationtest.base.TestBase;
import com.qa.locationtest.pages.FilterPage;
import com.qa.locationtest.pages.LoginPage;


public class LoginPageTest extends TestBase {
		
		LoginPage loginpage;
		FilterPage filterpage;
		
		public LoginPageTest() {//this will call super class constructor
			super();
		}
		
		@BeforeClass
		public void setUp() {
			initialization();
			loginpage = new LoginPage();
		}

		@Test(priority=1)
		public void verifyLoginPageLogoImageTest() {
			boolean flag = loginpage.validateLogoImage();
			Assert.assertTrue(flag);
		}
		
		@Test(priority=2)
		public void verifyLoginPageTitleTest() {
			String title = loginpage.validateLoginPageTitle();
			Assert.assertEquals(title, "Location Services");
		}
		
		@Test(priority=3)
		public void loginTest() {
			filterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
	
}
