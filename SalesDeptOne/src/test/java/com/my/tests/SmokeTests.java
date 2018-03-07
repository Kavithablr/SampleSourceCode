package com.my.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.my.pages.LandingPageOne;
import com.my.pages.LoginOne;
import com.my.pages.Methods;
import com.my.pages.SetUp;


import io.appium.java_client.AppiumDriver;

public class SmokeTests extends SetUp{

private static AppiumDriver driver;
	
	private LandingPageOne lp;
	private LoginOne login;
	private Methods logs;
	 
	@BeforeMethod
	public void beforetest() throws IOException{
		driver = Set_Up();
		  
		  
		  login = new LoginOne(driver);
		  
		  
		  
		  lp = new LandingPageOne(driver);
		  
		  logs = new Methods();
	}
	
	@Test
	  public void Firstpage() throws Exception
	  {
	
		Thread.sleep(2000);
		  lp.Next.click();
		  logs.log("Clicking on next button");
		  Thread.sleep(2000);  
		  lp.Next.click();
		  logs.log("Clicking on next button again"); 
		  System.out.println("End of tests");
		  logs.log("Login test completed");
		 }
	
	
	//resid -- net.skyscanner.android.main:id/fab
	//class - android.widget.ImageButton
	
}
