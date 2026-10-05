package com.orangehrmAutomation;



import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrmAutomation.Pages.LoginPage;
import com.orangehrmAutomation.Pages.PIMPage;

public class LoginTest extends BaseTest {

	LoginPage loginPage;
	

 @BeforeMethod
 
  public void createLoginPage() {
	 
	 // your existing browser setup
	 
	 loginPage = new LoginPage(driver);
 }
 
 @Test
 public void validLoginTest() {
     //System.out.println("Step1 - Starting login " );
     loginPage.enterUsername("Admin");
     //System.out.println("Step2 - Username entered");
     loginPage.enterPassword("admin123");
     //System.out.println("Step3 - password entered");
     loginPage.clickLogin();
     //System.out.println("Step 4 - Login clicked");
     Assert.assertTrue(loginPage.isDashboardDisplayed());
     
     
 }
 
}
 


