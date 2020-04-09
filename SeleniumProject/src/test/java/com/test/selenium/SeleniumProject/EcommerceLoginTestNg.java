package com.test.selenium.SeleniumProject;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.test.selenium.Core.BaseClass;

public class EcommerceLoginTestNg extends BaseClass implements EcommerceLoginTestConstant {
	@Test
	public void testLoginWithScuccessScenrio() {

		WebElement emailID = driver.findElement(By.id(EMAIL_ID_LOCATOR));
		emailID.sendKeys(TEST_EMAIL_ID);
		WebElement continueButton = driver.findElement(By.id(CONTINUE_LOCATOR));
		continueButton.click();
		WebElement pwd = driver.findElement(By.id(PASSWORD_LOCATOR));
		pwd.sendKeys(PASSWORD);
		WebElement signinButton = driver.findElement(By.id(SIGNIN_BUTTON_LOCATOR));
		signinButton.click();

	}
}
