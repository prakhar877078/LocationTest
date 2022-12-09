package com.qa.locationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.locationtest.base.TestBase;
import com.qa.locationtest.util.TestUtil;

public class FilterPage extends TestBase {

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement bussiness;
	
	@FindBy(xpath="//span[normalize-space()='Reliance Retail - South 2']")
	WebElement relretsouth2;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement state;
	
	@FindBy(xpath="//span[normalize-space()='Kerala']")
	WebElement kerala;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement city;
	
	@FindBy(xpath="//span[normalize-space()='Thrissur']")
	WebElement thrissur;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement hotspot;
	
	@FindBy(xpath="//div[text()=\" TXVO | Smartnet Kuriachira Txvo \"]")
	WebElement smartnet;
	
	@FindBy(xpath="//span[normalize-space()='Apply Filter']")
	WebElement filterbtn;
	
	public FilterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateFilterPageTitle() {
		return driver.getTitle();
	}
	
	public LiveTrackingPage applyFilter(String bsns,String st,String ct,String htspt) {
		TestUtil.waitForElement();
		bussiness.sendKeys(bsns);
		TestUtil.waitForElement();
		relretsouth2.click();
		TestUtil.waitForElement();
		state.sendKeys(st);
		TestUtil.waitForElement();
		kerala.click();
		TestUtil.waitForElement();
		city.sendKeys(ct);
		TestUtil.waitForElement();
		thrissur.click();
		TestUtil.waitForElement();
		hotspot.sendKeys(htspt);
		TestUtil.waitForElement();
		smartnet.click();
		TestUtil.waitForElement();
		filterbtn.click();
		return new LiveTrackingPage();
	}
	
	/*
	 * public LiveTrackingPage selectFilter(String fbnss, String fstate, String
	 * fcity, String fhotspot) { bussiness.sendKeys(fbnss); state.sendKeys(fstate);
	 * city.sendKeys(fcity); hotspot.sendKeys(fhotspot); filterbtn.click(); return
	 * new LiveTrackingPage(); }
	 */
	
}
