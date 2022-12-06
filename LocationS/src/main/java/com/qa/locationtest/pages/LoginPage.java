package com.qa.locationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.locationtest.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@id='firstname1']")
	WebElement uname;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement login;
	
	@FindBy(xpath="//img[@src='assets/image/logo.png']")
	WebElement logo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogoImage() {
		return logo.isDisplayed();
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public FilterPage login(String un, String pw) {
		uname.sendKeys(un);
		pwd.sendKeys(pw);
		login.click();
		return new FilterPage();
	}

}
