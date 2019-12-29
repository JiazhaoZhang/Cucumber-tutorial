package com.jiazhao.test.TestRegister;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This is the step definition class for running a 
 * test for registration
 * @author Zhang's laptop
 *
 */
public class RegisterSteps {
	
	@Given("^in the regiser page$")
	public void in_the_regiser_page() throws Throwable {
	   System.out.println("in the regiser page");
	}

	@When("^enter username and password$")
	public void enter_username_and_password(DataTable table) throws Throwable {
	    List<List<String>> data = table.raw();	
		System.out.println("enter "+data.get(0).get(0)+" and "+data.get(0).get(1));
		System.out.println("enter "+data.get(1).get(0)+" and "+data.get(1).get(1));
		System.out.println("enter "+data.get(2).get(0)+" and "+data.get(2).get(1));
	}

	@When("^click on register button$")
	public void click_on_register_button() throws Throwable {
		 System.out.println("click on register button");
	}

	@Then("^show register window$")
	public void show_register_window() throws Throwable {
		 System.out.println("show register window");
	}
	
}
