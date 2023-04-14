package com.qa.blaze.factory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	private WebDriver driver;
	Properties prop;
	/**
	 * 
	 * @param browsername
	 * @return driver
	 */
	public WebDriver crossbrowser(String browsername) {
		switch (browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default: System.out.println("You have entered wrong browser!!!");
		break;
		}
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demoblaze.com/index.html");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return driver;
	}
	/**
	 * 
	 * @return
	 */
	public Properties init_Pop() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("/POMFramwork/src/test/resources/Config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
