import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo1 extends BaseProj{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = setCapabilities("Device");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Dimension size = driver.manage().window().getSize();
	     int x = size.getWidth() / 2;
	     int startY = (int) (size.getHeight() * 0.60);
	     int endY = (int) (size.getHeight() * 0.60); 
	     TouchAction touchAction = new TouchAction(driver);
	     touchAction.press((int)0.1, (int)0.5).moveTo((int)0.9, (int)0.6).release().perform();
	     
	     
		
		
	}

}
