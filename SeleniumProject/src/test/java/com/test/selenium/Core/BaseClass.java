package com.test.selenium.Core;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected WebDriver driver = null;

	@BeforeMethod
	protected void setUp() {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement button = driver.findElement(By.id("nav-link-accountList"));
		button.click();
	}

	@AfterMethod
	protected void cleanUp() {
		driver.close();
	}

}
