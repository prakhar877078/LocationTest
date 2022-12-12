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

public class LiveTrackingPageTest extends TestBase {

	LoginPage loginpage;
	FilterPage filterpage;
	LiveTrackingPage livetrackingpage;
	TestUtil testutil;
	
	public LiveTrackingPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();//LoginPage object have been created so that i can access LoginPage class method
		filterpage = new FilterPage();
		livetrackingpage = new LiveTrackingPage();
		//testutil = new TestUtil();
		filterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));  
		livetrackingpage = filterpage.applyFilter("reliance r", "ker", "thr", "tx");

	}
	
	@Test(priority=1)
	public void verifyCountofAllRidersTest() throws InterruptedException {
		int all = livetrackingpage.validateCountOfAllRiders();
		int map = livetrackingpage.validateCountOfAllRidersInMap();
		Assert.assertEquals(all, map);
	}
	
	//@Test(priority=2)
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
