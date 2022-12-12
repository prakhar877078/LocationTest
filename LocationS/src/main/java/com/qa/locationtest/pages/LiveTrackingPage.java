package com.qa.locationtest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.locationtest.base.TestBase;
import com.qa.locationtest.util.TestUtil;

public class LiveTrackingPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Smartnet Kuriachira Txvo']")
	WebElement smartnet;
	
	@FindBy(xpath="//input[@placeholder='Store ID / Hub ID / Store Name']")
	WebElement storeid;
	
	@FindBy(xpath="//div[contains(text(),'Nimesh')]")
	WebElement rider;
	
	@FindBy(xpath="//input[@placeholder='Grab Id']")
	WebElement grabid;
	
	@FindBy(xpath="//input[@placeholder='POS Order ID']")
	WebElement posorderid;
	
	@FindBy(xpath="//div[@title='Nimesh  Mg']//img")
	WebElement nimesh;
	
	//@FindBy(xpath="//div[@aria-describedby='74A58D0B-523A-49D2-A6D9-777DE58506F8']//img")
	@FindBy(xpath="//div[@role='button']//img")
	WebElement mapriders;
	
	@FindBy(xpath="//div[@class='rider-list-container ng-star-inserted']")
	WebElement riderlist;
	
	@FindBy(xpath="(//span[@class='p-button-label'])[6]")
	WebElement allfilter;
	
	@FindBy(xpath="(//span[@class='p-button-label'])[7]")
	WebElement ontripfilter;
	
	@FindBy(xpath="(//span[@class='p-button-label'])[8]")
	WebElement idlefilter;
	
	@FindBy(xpath="(//span[@class='p-button-label'])[4]")
	WebElement yesterday;
	
	public LiveTrackingPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public void validateCountOfAllRiders() throws InterruptedException {
	 * yesterday.click(); Thread.sleep(5000); List<WebElement> list =
	 * driver.findElements(By.
	 * xpath("//div[@class='info name font-18 font-medium profile_name']"));
	 * //List<WebElement>list = (List<WebElement>) allfilter;
	 * System.out.println(list.size()); for(WebElement clink : list) { String str =
	 * clink.getText(); System.out.println(str); } }
	 */
	public int validateCountOfAllRiders() throws InterruptedException {
		yesterday.click();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='info name font-18 font-medium profile_name']"));
		//List<WebElement>list = (List<WebElement>) allfilter;
		System.out.println(list.size());
		return(list.size());
	}

	/*
	 * public void validateCountOfAllRidersInMap() throws InterruptedException {
	 * yesterday.click(); Thread.sleep(5000); List<WebElement> list =
	 * driver.findElements(By.xpath("//div[@role='button']//img"));
	 * //List<WebElement>list = (List<WebElement>) allfilter;
	 * System.out.println(list.size()); for(WebElement clink : list) { String str =
	 * clink.getText(); System.out.println(str); } }
	 */
	
	public int validateCountOfAllRidersInMap() throws InterruptedException {
		yesterday.click();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='button']//img"));
		//List<WebElement>list = (List<WebElement>) allfilter;
		System.out.println(list.size());
		return(list.size());
	}
}
