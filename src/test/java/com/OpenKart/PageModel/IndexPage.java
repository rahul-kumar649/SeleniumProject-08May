package com.OpenKart.PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	// 1. Create object of WebDriver
    WebDriver ldriver;

    public IndexPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy (xpath = "//span[normalize-space()='My Account']")
    WebElement myAccount;
    
    @FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
    WebElement register;
    
    public void MyAccount () {
    	myAccount.click();
    }
    
    public void Register() {
    	register.click();
    }

}
