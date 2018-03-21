package com.stepdefination;
//implementation
//End to end scenario




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.Login1;
import com.pages.PropertyFile;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.findby.FindBy;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//@DefaultUrl("https://accounts.google.com/")
public class login {
	
	/*@Managed(driver="firefox")*/
	WebDriver driver;
	
	PropertyFile p1;
	Login1 l1;
	String Url;
	
	//propertyFile p1=new ;
	
	
	@Step("^Open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url() throws Exception {
		p1=new PropertyFile();
		System.setProperty(p1.getkey(),p1.getpath());
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rlc0068\\Documents\\Browser_Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(p1.getUrl());
		//driver.get("https://accounts.google.com/");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	   
	}

	@Step("^Users enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_username_and_password(String Un,String Pswd) throws Exception {
		l1.LoginToApp(Un, Pswd);
		 Url=driver.getCurrentUrl();
	    
	    
	}
	
	@Step("^User is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Exception {
		driver.navigate().to(Url);
	    String title=driver.getTitle();
	    

	}

}
