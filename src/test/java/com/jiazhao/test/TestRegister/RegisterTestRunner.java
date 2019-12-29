package com.jiazhao.test.TestRegister;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

/**
 * This is the test runner for testing register feature
 * @author Zhang's laptop
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:RegisterTest/",
		glue = "com.jiazhao.test.TestRegister"
		)
public class RegisterTestRunner {

	

}
