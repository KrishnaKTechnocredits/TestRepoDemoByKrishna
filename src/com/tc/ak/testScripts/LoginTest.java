package com.tc.ak.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tc.ak.pages.RegistrationPage;

public class LoginTest extends TestBase {

	@Test
	public final void login() {
		String expected = "Success!";
		start();
		gotoRegistrationPage();
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.login("krishna", "Krishna@123");
		String actual = registrationPage.handleAlertOnRegistrationPage();
		Assert.assertEquals(actual, expected, "Actual is not matching with expected.");
		closeSession();  

		// Initialization init = new Initialization();
		// WebDriver driver = init.start();
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.get("http://automationbykrishna.com/#");
		// TestBase testBase = new TestBase(driver);
		// testBase.gotoRegistrationPage();
		// driver.findElement(By.id("registration2")).click();
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("unameSignin")));
		// driver.findElement(By.id("unameSignin")).sendKeys("krishna");
		// driver.findElement(By.id("pwdSignin")).sendKeys("krishna@123");
		// driver.findElement(By.id("btnsubmitdetails")).click();
		// Alert alert = driver.switchTo().alert();
		// String actual = alert.getText();
		// alert.accept();
		// driver.close();
	}

}
