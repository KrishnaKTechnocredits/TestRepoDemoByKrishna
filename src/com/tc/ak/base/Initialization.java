package com.tc.ak.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tc.ak.constant.ConstantPath;

public class Initialization {

	public static WebDriver driver=null;

	public WebDriver start() {
		start("http://automationbykrishna.com/#");
		return driver;
	}
	
	public WebDriver start(String url) {
		System.setProperty("webdriver.driver.chrome", ConstantPath.CHROMEDRIVEREXE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/#");
		return driver;
	}
}

