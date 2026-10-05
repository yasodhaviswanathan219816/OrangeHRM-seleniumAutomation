package com.orangehrmAutomation.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	  WebDriver driver;
	  WebDriverWait wait;
	  
	  //constructor
	  public LoginPage(WebDriver driver) {
		  this.driver = driver;
		  this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  //find and connect these@findBy elements to the current page object
		  PageFactory.initElements(driver, this);
	  }
	  
	  //username
	 @FindBy(name = "username")
	  WebElement username;
	  
	  //password
	  @FindBy(name = "password")
	 WebElement password;
	  
	  //login button
	 @FindBy(xpath = "//button[@type= 'submit']")
	  WebElement loginButton;  
	 
	 //dashboard
	 @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")
	 WebElement dashboard;
  

   public void enterUsername(String user) {
	   wait.until(ExpectedConditions.visibilityOf(username));
	   username.click();
	   username.clear();
	username.sendKeys(user);
	
	
   }
   
   public void enterPassword(String pass) {
	   wait.until(ExpectedConditions.visibilityOf(password));
	   password.click();
	   password.clear();
		password.sendKeys(pass);
	   }
   public void clickLogin() {
	  wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	  wait.until(ExpectedConditions.visibilityOf(loginButton));
	  System.out.println("Login button is ready");
	  loginButton.click();
	  System.out.println("login Button clicked");
		
	   }
   
   public boolean isDashboardDisplayed() {
	   wait.until(ExpectedConditions.visibilityOf(dashboard));
	   return dashboard.isDisplayed();
   }
   
}

