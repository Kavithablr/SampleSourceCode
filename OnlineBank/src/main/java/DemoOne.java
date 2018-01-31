


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


//import PageObs.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DemoOne {


	public void testRun() throws MalformedURLException{
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	
	
	//Below line is used for providing path to .apk file
	//cap.setCapability(MobileCapabilityType.APP, "/Users/kavitha/Documents/ApiDemos-debug.apk");
	
	File appDir = new File("/Users/kavitha/Documents");
	   
    File app = new File(appDir, "ApiDemos-debug.apk");

  cap.setCapability(MobileCapabilityType.APP, app);
    
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device"); //to run on the device
	
	/*if (target=="Device"){
		//Use the below commented line for running scripts on device
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device"); //to run on the device	
	}
	else{
		//Below line is used to run scripts on emulator
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice");
			
	}*/
	//Use the below commented line for automatically launch the emulator
	cap.setCapability("deviceName", "AndroidEmulator");
	cap.setCapability("avd", "MyDevice");
	
	//Appium server location
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	//HomePage hp = new HomePage(driver);
	/*
	hp.Preference.click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
    driver.findElementById("android:id/checkbox").click();
    driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
    hp.editText.sendKeys("Hello");
    hp.OkButton.get(1).click();*/
	
}

	
	
	
}

