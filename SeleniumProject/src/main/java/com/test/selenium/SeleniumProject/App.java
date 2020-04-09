package com.test.selenium.SeleniumProject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args)

	{
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		WebDriver driver = new ChromeDriver();
		driver.get("http://ecommerce.saipratap.net/index.php");
		WebElement EmailID = driver.findElement(By.id("email"));
		EmailID.sendKeys("test@gmail.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("pwd");
		WebElement LoginBtn = driver.findElement(By.linkText("Login"));
		LoginBtn.click();
		
		driver.close();
	}
}
