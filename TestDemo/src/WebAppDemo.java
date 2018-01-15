import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class WebAppDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.get("http://yopmail.com");
		System.out.println(driver.getCurrentUrl());
	
		driver.findElementById("login").sendKeys("fistest650@yopmail.com");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wd=new WebDriverWait(driver,5);

		wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='ifinbox']")));
		
	
		
		//int a=driver.findElements(By.tagName("iframe")).size();
		//System.out.println(a);
		
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(i);
		
		
		//int m=gotoframe(driver,By.xpath("//*[@id='ifinbox']"));
		//driver.switchTo().frame(m);
		driver.findElement(By.xpath("//*[@id='m2']/div/a/span[2]")).click(); ////*[@id="m2"]/div/a/span[2]
		//driver.switchTo().defaultContent();


	}
	
		public static int gotoframe(AndroidDriver driver1, By by)
		{
		driver1.switchTo().defaultContent();
		int i;
		int num = -1;
		int a=driver1.findElements(By.tagName("iframe")).size();
		for(i=0;i<a;i++)
		{
		driver1.switchTo().defaultContent();
		//driver1.switchTo().frame(i);
		int b=driver1.findElements(by).size();
		
		if(b>0)
		{
		num=i;
		break;
		}
		}
		driver1.switchTo().defaultContent();
		return num;
		}}

		/*
		driver.switchTo().frame("ifinbox");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='m1']/div/a/span[2]").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='mailmillieu']/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a").click();*/	
		
		


