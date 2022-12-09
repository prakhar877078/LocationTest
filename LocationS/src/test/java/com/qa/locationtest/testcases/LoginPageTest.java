package com.qa.locationtest.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.locationtest.base.TestBase;
import com.qa.locationtest.pages.FilterPage;
import com.qa.locationtest.pages.LoginPage;
import com.qa.locationtest.util.TestUtil;


public class LoginPageTest extends TestBase {
		
		LoginPage loginpage;
		FilterPage filterpage;
		TestUtil testutil;
		
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
			Assert.assertEquals(title, "Grab Location Service Login");
		}
		
		@Test(priority=3)
		public void loginTest() {
			filterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			//testutil.waitForElement();
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
	
}
