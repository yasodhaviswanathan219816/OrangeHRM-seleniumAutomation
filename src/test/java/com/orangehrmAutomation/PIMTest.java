package com.orangehrmAutomation;

	import org.testng.annotations.Test;

	import com.orangehrmAutomation.Pages.LoginPage;
	import com.orangehrmAutomation.Pages.PIMPage;

	public class PIMTest extends BaseTest {

	    @Test
	    public void navigateToAddEmployee() {

	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUsername("Admin");
	        loginPage.enterPassword("admin123");
	        loginPage.clickLogin();

	        PIMPage pimPage = new PIMPage(driver);
	        pimPage.clickPIMMenu();
	        pimPage.clickAddEmployee();
	        pimPage.enterFirstName("QA");
	        pimPage.enterMiddleName("Manual");
	        pimPage.enterLastName("Tester");
	        pimPage.enterEmployeeId("EMP004");
	        pimPage.clickSave();
	        
	        pimPage.uploadProfilePicture("C:\\Users\\yasod\\OneDrive\\Pictures\\Yasodhapic.jpg"
	        		);
	    
	}
}
