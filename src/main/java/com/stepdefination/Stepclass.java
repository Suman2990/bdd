package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.Login1;
import com.pages.PropertyFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Stepclass {
	
	@Steps
	login l;
	
	@Given("^Open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url() throws Exception {
		l.open_the_browser_and_enter_the_url();
		
	   
	}

	@When("^Users enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_username_and_password(String Un,String Pswd) throws Exception {
		l.user_enters_the_username_and_password("jhasimmi55@gmail.com","surbhi29");
	    
	}

	@Then("^User is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Exception {
		l.user_is_able_to_login_successfully();
	    

	}
	
	

}
