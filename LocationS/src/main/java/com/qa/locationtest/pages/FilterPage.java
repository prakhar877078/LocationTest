package com.qa.locationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.locationtest.base.TestBase;

public class FilterPage extends TestBase {

	@FindBy(xpath="//ng-select[@placeholder='Start typing the Business']//div[@role='combobox']")
	WebElement bussiness;
	
	@FindBy(xpath="//ng-select[@placeholder='Start typing the State']//input[@type='text']")
	WebElement state;
	
	@FindBy(xpath="//ng-select[@placeholder='Start typing the City']//input[@type='text']")
	WebElement city;
	
	@FindBy(xpath="//ng-select[@placeholder='Start typing the Hotspot']//input[@type='text']")
	WebElement hotspot;
	
	@FindBy(xpath="//span[normalize-space()='Apply Filter']")
	WebElement filterbtn;
	
	public FilterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateFilterPageTitle() {
		return driver.getTitle();
	}
	
	/*
	 * public LiveTrackingPage selectFilter(String fbnss, String fstate, String
	 * fcity, String fhotspot) { bussiness.sendKeys(fbnss); state.sendKeys(fstate);
	 * city.sendKeys(fcity); hotspot.sendKeys(fhotspot); filterbtn.click(); return
	 * new LiveTrackingPage(); }
	 */
	
}
