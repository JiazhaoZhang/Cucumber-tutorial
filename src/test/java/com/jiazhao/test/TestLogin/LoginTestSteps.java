package com.jiazhao.test.TestLogin;

import org.junit.jupiter.api.AfterAll;

import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class LoginTestSteps {

	private int test_count = 0;
	
	@After
	public void endOfScenario() {
		System.out.println("end of scenario ... ");
		System.out.println();
	}
	
	@After
	public void endOfTest() {
		System.out.println("Number of scenarios : "+this.test_count);
		System.out.println();
	}
	
	@Given("^At the page$")
	public void at_the_page() throws Throwable {
	    System.out.println("At the page");
	}

	@When("^Enter ([a-zA-Z0-9]+) and ([a-zA-Z0-9]+)$")
	public void enter_uname_and_passwd(String uname, String passwd) throws Throwable {
	    System.out.println("username is "+uname+" and password is "+passwd);
	}
	
	@When("^Click on log in$")
	public void click_on_log_in() throws Throwable {
		System.out.println("Click on log in");
	}

	@Then("^Redirect me to correct page$")
	public void redirect_me_to_correct_page() throws Throwable {
		System.out.println("Redirect me to correct page");
	}

	

	@When("^Enter invalid username and password$")
	public void enter_invalid_username_and_password() throws Throwable {
		System.out.println("Enter invalid username and password");
	}

	@Then("^Pop up warning$")
	public void pop_up_warning() throws Throwable {
		System.out.println("Pop up warning");
	}


	
}
