import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends BaseProj {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = setCapabilities("Device");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction t = new TouchAction(driver);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		t.longPress(driver.findElementByXPath("//*[@content-desc='15']"))
				.moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();

	}

}
