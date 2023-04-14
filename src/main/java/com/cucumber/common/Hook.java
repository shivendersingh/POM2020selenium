package com.cucumber.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BasePage{
	@Before
	public static void setupDrver() {
		SeleniumManager.getInstance();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@After
	public static void teardown() {
		driver.quit();
	}
}
