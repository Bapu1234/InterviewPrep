package com.test.selenium.SeleniumProject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement button = driver.findElement(By.id("nav-link-accountList"));
		button.click();
		WebElement emailID = driver.findElement(By.id("ap_email"));
		emailID.sendKeys("bapu.s.p@gmail.com");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Apri13!@");
		WebElement signinButton = driver.findElement(By.id("signInSubmit"));
		signinButton.click();

		/**
		 * WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
		 * searchElement.sendKeys("Iphone X");
		 **/
		// driver.close();
	}

}
