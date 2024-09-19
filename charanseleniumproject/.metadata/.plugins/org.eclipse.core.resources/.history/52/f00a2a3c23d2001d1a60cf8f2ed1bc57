package com.qa.opecart.base;

import java.com.qa.blaze.factory.Driverfactory;
import java.com.qa.opencart.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	private WebDriver driver;
    protected LoginPage loginpage;
	Driverfactory df;
	@BeforeTest
	public void setup() throws InterruptedException {
		df= new Driverfactory();
		driver=df.crossbrowser("chrome");
		loginpage = new LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("applicaiton getting quit");
		driver.quit();
	}
}
