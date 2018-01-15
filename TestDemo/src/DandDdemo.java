import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;

//import org.openqa.selenium.interactions.internal.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DandDdemo extends BaseProj {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = setCapabilities("Device");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// TODO Auto-generated method stub
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driver);
		t.longPress(driver.findElementsByClassName("android.view.View").get(0))
				.moveTo(driver.findElementsByClassName("android.view.View").get(1)).release().perform();		

	}

}
