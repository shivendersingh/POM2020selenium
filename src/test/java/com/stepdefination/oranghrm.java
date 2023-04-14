package com.stepdefination;

import com.qa.blaze.factory.Driverfactory;

import io.cucumber.java.en.Given;

public class oranghrm extends Driverfactory{

	@Given("User able to login to blaze")

	public void launchurl(){
		System.out.println("url is launched succeffu");

	}

//	@Then("Test the URL Test")
//	public void loginlinktest(){
//		Assert.assertTrue(new BaseTest().loginpage.isloginlinkexist());
//	}
}
