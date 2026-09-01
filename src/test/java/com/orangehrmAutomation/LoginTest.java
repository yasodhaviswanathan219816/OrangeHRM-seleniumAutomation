package com.orangehrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	
	public void openOrangeHRM() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/ ");
		
		System.out.println("OrangeHRM application opened");
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	
	public void validLogin() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//Enter Username
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 Thread.sleep(3000);
		 driver.quit();
		}
	 
	

}
