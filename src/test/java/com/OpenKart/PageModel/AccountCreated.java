package com.OpenKart.PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreated {

	// 1. Create object of WebDriver
			WebDriver ldriver;

			public AccountCreated(WebDriver rdriver) {
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);
			}
			
			@FindBy (xpath = "//a[normalize-space()='Account']")
			WebElement accountCreated;
			
			public String accountCreated() {
				String text = accountCreated.getText();
				return text;
			}
			
}
