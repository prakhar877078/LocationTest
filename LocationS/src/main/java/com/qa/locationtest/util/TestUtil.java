package com.qa.locationtest.util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.locationtest.base.TestBase;

public class TestUtil extends TestBase{
	
	
	
	public static void waitForElement() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	/*
	 * public static void getCountofElements(WebElement allfilter) {
	 * 
	 * List<WebElement> list = driver.findElements(By.xpath(allfilter));
	 * System.out.println(list.size()); }
	 */
	
	public static void doSendKeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}
	 
	public static void doClick(WebElement element) {
		element.click();
	}
	
	/*
	 * public static void getCountOfElements(WebElement element) {
	 * List<WebElement>list = }
	 */
	
}
