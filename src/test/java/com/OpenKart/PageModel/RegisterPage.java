package com.OpenKart.PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	// 1. Create object of WebDriver
    WebDriver ldriver;

    public RegisterPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy (xpath = "//input[@id='input-firstname']")
    WebElement enterFirstName;
    
    @FindBy (xpath = "//input[@id='input-lastname']")
    WebElement enterLastName;
    
    @FindBy (xpath = "//input[@id='input-email']")
    WebElement enterEmail;
    
    @FindBy (xpath = "//input[@id='input-telephone']")
    WebElement enterTelephone;
    
    @FindBy (xpath = "//input[@id='input-password']")
    WebElement enterPassword;
    
    @FindBy (xpath = "//input[@id='input-confirm']")
    WebElement enterConfirmPassword;
    
    @FindBy (xpath = "//input[@value='0']")
    WebElement selectNo;
    
    @FindBy (xpath = "//input[@name='agree']")
    WebElement PrivacyPolicy;
    
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continuebutton;
    
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement ClickOnContinue;
    
    public void enterFirstName(String FS) {
    	enterFirstName.sendKeys(FS);
    }
    
    public void enterLastName(String LS) {
    	enterLastName.sendKeys(LS);
    }
    
    public void enterEmail(String EE) {
    	enterEmail.sendKeys(EE);
    }
    
    public void enterTelephone(String ET) {
    	enterTelephone.sendKeys(ET);
    }
    
    public void enterPassword(String EP) {
    	enterPassword.sendKeys(EP);
    }
    
    public void enterConfirmPassword(String ECP) {
    	enterConfirmPassword.sendKeys(ECP);
    }
    
    public void selectNo() {
    	selectNo.isDisplayed();
    	selectNo.click();
    }
    
    public void PrivacyPolicy() {
    	PrivacyPolicy.click();
    }
    
    public void continuebutton() {
    	continuebutton.click();
    }
    
    public void ClickOnContinue() {
    	ClickOnContinue.click();
    }
    
}
