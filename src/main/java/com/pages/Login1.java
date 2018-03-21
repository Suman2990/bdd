package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login1 extends PageObject {
	
	@FindBy(xpath="//input[@name='identifier']")
	WebElementFacade Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElementFacade Password;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElementFacade Button;
	
	public Login1(WebDriver driver)
	{
		super(driver);
	}
	
	
	@Step("User is entering Un and Password")
	public void LoginToApp(String Un,String Pswd)
	{
		Username.sendKeys(Un);
		Button.click();
		Password.sendKeys(Pswd);
		Button.click();
		
	}
	
	
	
	
	
	
	
	
	

}
