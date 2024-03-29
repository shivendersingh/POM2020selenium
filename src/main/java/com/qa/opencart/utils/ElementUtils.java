package com.qa.opencart.utils;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementUtils {
	private static WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver =driver;
	}
	/**
	 * this methods is used to verify the page title
	 * @param Passthepagetitile
	 * @author shive
	 */
	public static void verifiytitle(String Passthepagetitile){
		String Pagetile=Passthepagetitile;
		if (Pagetile.equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Page title get verified");
		}else {
			System.out.println("Wrong page tile is there!!");
		}
	}

	/**
	 * This method is used for locating the single element on particular page
	 * @param element
	 * @return
	 */
	public static WebElement findelement(By element){
		return driver.findElement(element);
	}
	/**
	 * sendkeysvalue
	 * @param element
	 * @param Passyourvalueforthesendkeymethods
	 */
	public static void sendkeysvalue(By element ,String Passyourvalueforthesendkeymethods) {
		findelement(element).sendKeys(Passyourvalueforthesendkeymethods);
	}


	public static void sendkeysvalueandwait(By element ,String Passyourvalueforthesendkeymethods,int wait) throws InterruptedException {
		ElementUtils.hardcorewait(wait);
		findelement(element).sendKeys(Passyourvalueforthesendkeymethods);
	}
	/**
	 * clearthevalue
	 * @param element
	 * 
	 */
	public static void clearthevalue(By element) {
		findelement(element).clear();
	}
	/**
	 * click
	 * @param element
	 */
	public static void click(By element) {
		findelement(element).click();
	}
	/**
	 * clickandwait
	 * @param element
	 */
	public static void clickandwait(By element,int wait) {
		try {
			ElementUtils.hardcorewait(wait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		findelement(element).click();
	}
	/**
	 * hardcorewait
	 * @param passthetimetowait
	 * @throws InterruptedException
	 */
	public static void hardcorewait(int passthetimetowait) throws InterruptedException{
		Thread.sleep(passthetimetowait);
	}
	/**
	 * findelements
	 * @param element
	 * @return
	 */
	public static List<WebElement> findelements(By element){
		System.err.println(driver.findElements(element).size());
		return driver.findElements(element);
	}
	/**
	 * printthenumberofvaues
	 * @param elemetn
	 */
	public static void printthenumberofvaues(By elemetn){
		System.out.println(ElementUtils.findelements(elemetn).size());
		for (WebElement webElement : ElementUtils.findelements(elemetn)) {
			System.out.println(webElement.getText());
		}
	}
	/**
	 * prinallthelinkofthepage
	 * @param findthealllinks
	 */
	public static void prinallthelinkofthepage(String passthetagvalue) {
		for (WebElement wb : ElementUtils.findelements(ElementUtils.tagname(passthetagvalue))) {
			if(!wb.getText().isEmpty()) {
				System.out.println(wb.getText());
			}

		}
	}
	/**
	 * element is dipalye or not
	 * @param element
	 * @return
	 */
	public static boolean elementisdipalyeornot(By element) {
		return findelement(element).isDisplayed();
	}
	/**
	 * element is enabled or not
	 * @param element
	 * @return
	 */
	public static boolean elementisenabledornot(By element) {
		return findelement(element).isEnabled();
	}
	/**
	 * element is selected or not
	 * @param element
	 * @return
	 */
	public static boolean elementisselectedornot(By element) {
		return findelement(element).isSelected();
	}
	/**
	 * verify the logo of the page
	 * @param logo
	 */
	public static void verifythelogoofthepage(By logo){
		if (!ElementUtils.elementisdipalyeornot(logo)) {System.out.println("logo is not displayed");
		}else {	System.out.println("logo is displayed");}
	}
	/**
	 * verify the radio button of the page
	 * @param radiobutton
	 */
	public static void verifytheradiobuttonofthepage(By radiobutton){
		if(ElementUtils.elementisenabledornot(radiobutton)) {
			System.out.println("radiobuttonisenabled");
		}else {
			System.out.println("radiobuttonisnotenabled");
		}
	}
	/**
	 * verify the checkbox button of the page
	 * @param radiobutton
	 */
	public static void verifythecheckboxbuttonofthepage(By checkbox){
		if(ElementUtils.elementisenabledornot(checkbox)) {
			System.out.println("checkboxisenabled");
		}else {
			System.out.println("checkboxisnotenabled");
		}
	}

	public static void verirytheselectelementinthepage(By button){
		if (ElementUtils.elementisselectedornot(button)) {
			System.out.println("given element is been selected!!");
		}else {
			System.out.println("given element is not been selected!!");
		}
	}

	/**
	 * verify the radio button of the page
	 * @param radiobutton
	 */
	public static void verifythefieldofthepage(By field){
		if(ElementUtils.elementisenabledornot(field)) {
			System.out.println("fieldisenabled");
		}else {
			System.out.println("field is not enabled");
		}
	}

	/**
	 * 
	 * @return title
	 */
	public String gettitle() {
		return driver.getTitle();
	}
	/******************************locators*************************/
	/**
	 * id locators use to locate an element through id
	 * @param idvalue
	 * @return
	 */
	public static By id(String idvalue) {
		return By.id(idvalue);
	}
	/**
	 * name locators use to locate an element through name
	 * @param namevalue
	 * @return
	 */
	public static By name(String namevalue) {
		return By.name(namevalue);
	}
	/**
	 * linktextvalue locators use to locate an element through linktextvalue
	 * @param linktextvalue
	 * @return
	 */
	public static By linktext(String linktextvalue, int waittoloadthelink) {
		try {
			ElementUtils.hardcorewait(waittoloadthelink);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return By.linkText(linktextvalue);
	}
	/**
	 * partialinktextvalue locators use to locate an element through partialinktextvalue
	 * @param partiallinktextvalue
	 * @return
	 */
	public static By partiallinktext(String partiallinktextvalue) {
		return By.partialLinkText(partiallinktextvalue);
	}

	public static By tagname(String passthetagvalue) {
		return By.tagName(passthetagvalue);
	}
	/**
	 * xpath by contains method
	 * @param tag
	 * @param attribute
	 * @param input
	 * @return
	 */
	public static By xpathbycontainsmethod(String tag,String attribute,String input) {
		return By.xpath("//"+tag+"[contains(@"+attribute+",'"+input+"')]");
	}
	/**
	 * Xpath is used for or
	 * @param tag
	 * @param attribute
	 * @param secondattribute
	 * @param attributevalue
	 * @param secondattributevalue
	 * @return
	 */
	public static By xpathbyor(String tag,String attribute,String secondattribute,String attributevalue,String secondattributevalue) {
		return By.xpath("//"+tag+"[@"+attribute+"='"+attributevalue+"'or@"+secondattribute+"='"+secondattributevalue+"']");
	}
	/**
	 * Xpath is used for and
	 * @param tag
	 * @param attribute
	 * @param secondattribute
	 * @param attributevalue
	 * @param secondattributevalue
	 * @return
	 * @throws InterruptedException 
	 */
	public static By xpathbyand(String tag,String attribute,String secondattribute,String attributevalue,String secondattributevalue, int wait) throws InterruptedException {
		ElementUtils.hardcorewait(wait);
		return By.xpath("//"+tag+"[@"+attribute+"='"+attributevalue+"'and@"+secondattribute+"='"+secondattributevalue+"']");
		
	}
}
