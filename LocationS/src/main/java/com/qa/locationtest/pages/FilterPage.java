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
	
	public LiveTrackingPage applyFilter(String bsns,String st,String ct,String htspt) throws InterruptedException {
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		bussiness.sendKeys(bsns);
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		relretsouth2.click();
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		state.sendKeys(st);
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		kerala.click();
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		city.sendKeys(ct);
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		thrissur.click();
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		hotspot.sendKeys(htspt);
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		smartnet.click();
		//TestUtil.waitForElement();
		Thread.sleep(5000);
		filterbtn.click();
		Thread.sleep(5000);
		return new LiveTrackingPage();
	}
	
	/*
	 * public LiveTrackingPage selectFilter(String fbnss, String fstate, String
	 * fcity, String fhotspot) { bussiness.sendKeys(fbnss); state.sendKeys(fstate);
	 * city.sendKeys(fcity); hotspot.sendKeys(fhotspot); filterbtn.click(); return
	 * new LiveTrackingPage(); }
	 */
	
}
