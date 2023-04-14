package com.qa.opecart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.blaze.factory.Driverfactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {
	private WebDriver driver;
    public com.qa.opencart.pages.LoginPage loginpage;
	Driverfactory df;
	@BeforeTest
	public void setup() throws InterruptedException {
		df= new Driverfactory();
		driver=df.crossbrowser("chrome");
		loginpage = new com.qa.opencart.pages.LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("applicaiton getting quit");
		driver.quit();
	}
}
