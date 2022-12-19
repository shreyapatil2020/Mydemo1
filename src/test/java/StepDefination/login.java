package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("use on login page")
	public void use_on_login_page() {
	    
		System.out.println("use on login page");
	}

	@When("user valid username and valid password")
	public void user_valid_username_and_valid_password() {
	    System.out.println("user valid username and valid password");
	}

	@Then("user on home page")
	public void user_on_home_page() {
	System.out.println("user on home page");
	
	
	}
	}
