package com.orangehrmAutomation;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
	//WebDriverWait wait;
	
	//run this before each test method
	@BeforeMethod
	
	public void setUp() throws InterruptedException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Thread.sleep(50000);
	}
	
	
	//Run this after each test method
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
