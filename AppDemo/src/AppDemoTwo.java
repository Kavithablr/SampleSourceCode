import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class AppDemoTwo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app", "/Users/kavitha/Documents/iApps/ScaryBugs.app");
		capabilities.setCapability("automationName", "XCUITest");
		
		//WebElement element;
		
		
		
		AppiumDriver<IOSElement> driver;
		
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
		
	}

}
