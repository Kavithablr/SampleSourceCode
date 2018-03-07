package com.my.pages;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SetUp {
	public static AndroidDriver<WebElement> Set_Up() throws IOException {

		AndroidDriver<WebElement> driver;

		// Setting desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice");

		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");

		cap.setCapability(MobileCapabilityType.APP, "/Users/kavitha/Documents/Skyscanner_v5.37_apkpure.com.apk");

		cap.setCapability("appWaitPackage", "net.skyscanner.android.main");

		cap.setCapability("appWaitActivity",
				"net.skyscanner.app.presentation.globalnav.activity.FullScreenSmartLockActivity");

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		return driver;
	}

}
