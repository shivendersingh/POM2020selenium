package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opecart.base.BaseTest;
import com.qa.opencart.utils.Constant;

/*
 * here in this test file we are validating the login page
 */
public class LoginPageTest extends BaseTest{
	
	@Test(priority = 2)
	public void loginPageTitleTest() {
		String str =loginpage.getloginpagetitle();
		System.out.println("login page title :"+str);
		Assert.assertEquals(str, Constant.LOGIN_PAGE_TITLE);
	}
	@Test (priority = 3)
	public void loginlinktest(){
		Assert.assertTrue(loginpage.isloginlinkexist());
	}
	@Test (priority = 1)
	public void loginTest() throws InterruptedException {	
		loginpage.dologin("shivender339@gmail.com", "Shivender#12");
	}
}
