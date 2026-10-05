package com.orangehrmAutomation.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIMPage {
	
	private static final ExpectedConditions ExpectedConitions = null;
	WebDriver driver;
	WebDriverWait wait;
	
	public PIMPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver,this);
			
	}
	
	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	WebElement pimMenu;

	public void clickPIMMenu() {
	    pimMenu.click();
	}
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	WebElement addEmployee;

	public void clickAddEmployee() {
	    addEmployee.click();
	}
	
	@FindBy(css = "div.oxd-form-loader")
	WebElement formLoader;
	
	public void waitForFromLoad() {
		wait.until(ExpectedConditions.invisibilityOf(formLoader));
	}
	
	@FindBy(name = "firstName")
	WebElement firstName;
	
	public void enterFirstName(String name) {
		waitForFromLoad();
		wait.until(ExpectedConditions.visibilityOf(firstName));
		wait.until(ExpectedConitions.elementToBeClickable(firstName));
		firstName.click();
		firstName.clear();
		firstName.sendKeys(name);
	}
	
	@FindBy(name = "middleName")
	WebElement middleName;
	
	public void enterMiddleName(String name) {
		middleName.click();
		middleName.clear();
		middleName.sendKeys(name);
	}
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	public void enterLastName(String name) {
		lastName.click();
		lastName.clear();
		lastName.sendKeys(name);
	}
	
	@FindBy(xpath = "//label[text()='Employee Id']/ancestor::div[contains(@class,'oxd-input-group')]//input")
	WebElement employeeId;
	
	public void enterEmployeeId(String id) {
		employeeId.click();
		employeeId.clear();
		employeeId.sendKeys(id);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;
	
	public void clickSave() {
		saveButton.click();
	}
	
	@FindBy(css = "img[alt='profile picture']")
	WebElement profilePicture;
	@FindBy(css = "button.employee-image-action")
	WebElement profilePictureButton;
	public void clickProfilePictureButton() {
	    profilePictureButton.click();
	}
	
	@FindBy(css = "input[type='file']")
	WebElement profilePictureInput;
	public void uploadProfilePicture(String filePath) {
	    profilePictureInput.sendKeys(filePath);
	}
	
}
