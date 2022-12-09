package com.qa.locationtest.util;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.locationtest.base.TestBase;

public class TestUtil extends TestBase{
	
	
	
	public static void waitForElement() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}

}
