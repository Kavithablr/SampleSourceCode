

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomePage{
	
	
	//FindBy
	//@iOSFindBy
	//@AndroidFindBy
	
	
	public HomePage(AppiumDriver driver){
		//super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preference;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	public WebElement Views;
	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement prefCheckbox;
	
	
	

}
