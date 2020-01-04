package com.jiazhao.test.TestLogin;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before
	public void beforeTest() {
		System.out.println("Before the scenario ...");
	}
	
	@After
	public void afterTest() {
		System.out.println("After the scenario ...");
		System.out.println();
	}
	
	
}
