package com.my.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class Methods extends SetUp{
	
	 
	
	public String log(String message) 
	{
		
		Logger logger = Logger.getLogger("SmokeTests");
		
		PropertyConfigurator.configure("log4j.properties");	
		
		logger.info(message);
		
		return null;
		
	}
	
	
	
	
	

}
