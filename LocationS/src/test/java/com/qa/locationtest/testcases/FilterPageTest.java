package com.qa.locationtest.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.locationtest.base.TestBase;
import com.qa.locationtest.pages.FilterPage;
import com.qa.locationtest.pages.LiveTrackingPage;
import com.qa.locationtest.pages.LoginPage;
import com.qa.locationtest.util.TestUtil;

public class FilterPageTest extends TestBase {
	
	LoginPage loginpage;
	FilterPage filterpage;
	LiveTrackingPage livetrackingpage;
	TestUtil testutil;
	
	public FilterPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		loginpage = new LoginPage();//LoginPage object have been created so that i can access LoginPage class method
		//testutil = new TestUtil();
		filterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));                           //
	}
	
	@Test(priority=1)
	public void verifyFilterPageTitleTest() {
		String title = filterpage.validateFilterPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Grab Location Service Login");
	}
	
	@Test(priority=2)
	public void verifyFilterTest() {
		//testutil.waitForElement();
	   try {
		filterpage.applyFilter("reliance r", "ker", "thr", "tx");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   	}
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
