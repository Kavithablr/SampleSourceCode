import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITEST");
		cap.setCapability(MobileCapabilityType.APP, "Users/kavitha/Library/Developer/Xcode/DerivedData/UICatalog-ezehahqkectjqyaniijiiofjscvc/Build/Products/Debug-iphonesimulator/UICatalog.app");
		
		IOSDriver <IOSElement> ios = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	}

}
