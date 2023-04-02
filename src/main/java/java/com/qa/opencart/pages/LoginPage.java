package com.qa.opencart.pages;

import java.com.qa.opencart.utils.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

public class LoginPage {
	//private WebDriver driver;
	ElementUtils elementutil;
	private By loginlink = By.xpath("//a[@id='login2']");
	private By username = By. xpath("//*[@id=\"loginusername\"]");
	private By loginpassword = By.xpath("//*[@id=\"loginpassword\"]");
	private By loginbutton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	private final static Logger logger = com.logger.ColorLogFactory.getLogger(LoginPage.class);
	//Constructor
	public LoginPage(WebDriver driver) {
		//this.driver = driver;
		elementutil = new ElementUtils(driver);
	}
	//page action
	public String getloginpagetitle() {
		return elementutil.gettitle();
	}
	@SuppressWarnings("static-access")
	public boolean isloginlinkexist() {
		return elementutil.elementisdipalyeornot(loginlink);
	}
	@SuppressWarnings("static-access")
	public void dologin(String UN, String Pass) throws InterruptedException {
		logger.info("*****blaze site is loged in successfully************");
		elementutil.clickandwait(loginlink, 1000);
		elementutil.sendkeysvalueandwait(username, UN, 1000);
		elementutil.sendkeysvalueandwait(loginpassword, Pass, 1000);
		elementutil.clickandwait(loginbutton, 1000);

	}
}

