package com.jiazhao.test.TestLogin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This is a cucumber runner class for testing
 * the log in feature
 * @author Zhang's laptop
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:FirstTest/",
		glue = "com.jiazhao.test.TestLogin"
		)
public class LoginTestRunner {

}
