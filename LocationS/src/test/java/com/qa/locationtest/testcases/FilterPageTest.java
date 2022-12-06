package com.qa.locationtest.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.locationtest.base.TestBase;
import com.qa.locationtest.pages.FilterPage;
import com.qa.locationtest.pages.LiveTrackingPage;
import com.qa.locationtest.pages.LoginPage;

public class FilterPageTest extends TestBase {
	
	LoginPage loginpage;
	FilterPage filterpage;
	LiveTrackingPage livetrackingpage;
	
	public FilterPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		loginpage = new LoginPage();//LoginPage object have been created so that i can access LoginPage class method
		filterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));                           //
	}
	
	@Test(priority=1)
	public void verifyFilterPageTitleTest() {
		String title = filterpage.validateFilterPageTitle();
		Assert.assertEquals(title, "Location Services");
	}
	
	
	/*
	 * public void filterTest() { livetrackingpage =
	 * filterpage.selectFilter(prop.getProperty(""),prop.getProperty(""),
	 * prop.getProperty(""),prop.getProperty("")); }
	 */
}
