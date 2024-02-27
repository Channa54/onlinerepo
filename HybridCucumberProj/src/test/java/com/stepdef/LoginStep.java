package com.stepdef;

import org.junit.Assert;

import com.pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	     Loginpage login;

		@Given("user is on login page")
		public void user_is_on_login_page() {
		   
			login= new Loginpage();
			login.ClickEmail();
			
		}


		

		@When("user enters {string} and {string}")
		public void user_enters_and(String un, String pw) {
		   login.enterusername(un);
		   login.enterpassword(pw);
			
			
			
			
		}
		@When("user clicks on submit button")
		public void user_clicks_on_submit_button() {
		   login.clicksubmit();
			
			
		}
		@Then("user is on home page")
		public void user_is_on_home_page() {
		   Assert.assertTrue(login.getTitle().contains("Online Shopping India"));
		}



	
	
	
}
