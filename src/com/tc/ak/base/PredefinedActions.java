package com.tc.ak.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tc.ak.constant.ConstantPath;

public abstract class PredefinedActions {
	
	public static WebDriver driver=null;

	public static WebDriver start() {
		start("http://automationbykrishna.com/#");
		return driver;
	}
	
	public static WebDriver start(String url) {
		System.setProperty("webdriver.driver.chrome", ConstantPath.CHROMEDRIVEREXE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/#");
		return driver;
	}
	
	protected void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	protected void click(WebElement element) {
		element.click();
	}
	
	protected String acceptAlert() {
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		alert.accept();
		return actual;
	}

}
