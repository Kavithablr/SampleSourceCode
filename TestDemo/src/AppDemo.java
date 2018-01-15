
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AppDemo {

	public static void main(String[] args) throws Exception {

		// AppiumDriver
		IOSDriver<IOSElement> driver;
		IOSDriver<IOSElement> dr1;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app",
				"Users/kavitha/Library/Developer/Xcode/DerivedData/UICatalog-ezehahqkectjqyaniijiiofjscvc/Build/Products/Debug-iphonesimulator/UICatalog.app");
		capabilities.setCapability("automationName", "XCUITest");
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		
		
		
		
		
		
		

		/**
		 * Test Actions here...
		 */

		// Click on Alerts and Enter a text in textbox.
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@value='Text Entry']").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello");
		driver.findElementByName("OK").click();
		/*
		driver.navigate().back();
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
		
	*/
		// driver.findElementByName("Buttons").click();
		// driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		// MobileElement table =
		// (MobileElement)driver.findElementById("XCUIElementTypeTable");
		// int index = 0;
		// System.out.println(table.getSize());
		// System.out.println(table.getClass().getName());
		// WebElement row =
		// table.findElementsByClassName("XCUIElementTypeCell").get(index);
		// row.click();

		// driver.quit();
	}
}
