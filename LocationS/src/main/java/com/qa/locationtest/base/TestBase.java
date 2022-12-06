package com.qa.locationtest.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop = new Properties();
		try {
			
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa"
					+ "\\locationtest"
					+ "\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			 driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
}
