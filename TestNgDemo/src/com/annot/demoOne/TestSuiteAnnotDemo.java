package com.annot.demoOne;

import org.testng.annotations.BeforeSuite;

public class TestSuiteAnnotDemo {

	
	@BeforeSuite
	public void DemoBeforeSuite(){
		System.out.println("The top most tests - Installation");
	}
	
	
}
