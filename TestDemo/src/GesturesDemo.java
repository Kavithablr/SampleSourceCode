import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class GesturesDemo extends BaseProj{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = setCapabilities("Device");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Syntax - 
		//Views-Expandables
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		TouchAction t = new TouchAction(driver);
		
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		t.longPress(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").getText());
		
		//Tap, press, release, scroll, swipe, drag and drop
		
		
	}

}
