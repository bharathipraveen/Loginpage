package com.stepdefinition;

import com.login.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	LoginPage log;
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		getDriver();
		loadurl("https://www.facebook.com");
		screenshot();
	}

	@When("user Enters {string} and {string}")
	public void user_Enters_and(String string, String string2) {
		log=new LoginPage();
		fill(log.getUsername(),string);
		fill(log.getPassword(),string2);
		screenshot();
	}
		
	   
	

	@When("user should click the Login button")
	public void user_should_click_the_Login_button() {
		click(log.btnogin());
		screenshot();
	}

	@Then("user should verify the message")
	public void user_should_verify_the_message() {
	    
	}


}
