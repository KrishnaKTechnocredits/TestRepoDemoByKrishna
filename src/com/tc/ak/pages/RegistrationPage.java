package com.tc.ak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tc.ak.base.PredefinedActions;

public class RegistrationPage extends PredefinedActions{
	//WebDriver driver;

	WebDriverWait wait = new WebDriverWait(driver, 30);

	
	public void login(String userName, String password) {
		enterUsername(userName);
		enterPassword(password);
		loginButtonClick();
	}
	
	private void enterUsername(String userName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("unameSignin")));
		enterText(driver.findElement(By.id("unameSignin")), userName);
	}
	
	private void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pwdSignin")));
		enterText(driver.findElement(By.id("pwdSignin")), password);
	}
	
	private void loginButtonClick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnsubmitdetails")));
		driver.findElement(By.id("btnsubmitdetails")).click();
	}
	public void signUp() {
		
	}
	
	public String handleAlertOnRegistrationPage() {
		return acceptAlert();
	}
}
