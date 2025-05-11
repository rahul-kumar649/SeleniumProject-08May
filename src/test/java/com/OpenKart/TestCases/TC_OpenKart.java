package com.OpenKart.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenKart.PageModel.AccountCreated;
import com.OpenKart.PageModel.IndexPage;
import com.OpenKart.PageModel.RegisterPage;

public class TC_OpenKart extends BaseClass {
	@Test
	public void DoRegister() {
		IndexPage IP = new IndexPage(driver);
		IP.MyAccount();
		IP.Register();
		
		RegisterPage rp = new RegisterPage(driver);
	    rp.enterFirstName("Rahul");
	    rp.enterLastName("Kumar");
	    rp.enterEmail("rahul990@gmail.com");
	    rp.enterTelephone("9977886655");
	    rp.enterPassword("Rahul@123");
	    rp.enterConfirmPassword("Rahul@123");
	    rp.selectNo();
		rp.PrivacyPolicy();
		rp.continuebutton();
		rp.ClickOnContinue();
		
		AccountCreated ac = new AccountCreated(driver);
		String Account = ac.accountCreated();
		Assert.assertEquals("Account",Account );
	}
}
