package com.test.selenium.SeleniumProject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AmazonRegister {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement button = driver.findElement(By.id("nav-link-accountList"));
		button.click();
		WebElement createAccButton = driver.findElement(By.id("createAccountSubmit"));
		createAccButton.click();
		WebElement yourName = driver.findElement(By.id("ap_customer_name"));
		yourName.sendKeys("abc");
		WebElement emailID = driver.findElement(By.id("ap_email"));
		emailID.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("abc123");
		WebElement passwordCheck = driver.findElement(By.id("ap_password_check"));
		passwordCheck.sendKeys("abc123");
		WebElement create = driver.findElement(By.id("continue"));
		create.click();
		Assert.assertEquals(driver.getTitle(), "www.amazon.com");

	}

}
