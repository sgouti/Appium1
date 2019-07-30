package pm1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {
	public static AndroidDriver<AndroidElement> Driver;
	public static AndroidDriver<AndroidElement>  SetupAndrd()
	{	
		
		try {
		File fln=new File("E:\\Automation\\Appium\\Apkfolder");
		File Gtapp=new File(fln,M1.Apk);
		DesiredCapabilities Cap=new DesiredCapabilities();
		
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		Cap.setCapability(MobileCapabilityType.APP,Gtapp.getAbsolutePath());
		
		 Driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		 Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 return Driver;
		 
	}
	catch(MalformedURLException e)
	{
		System.out.println("eror"+ e);
		return null;
	}
	}
	public static void ScrollToview(String Textview) throws InterruptedException
	{				
		String scrolltoview="new UiScrollable(new UiSelector()).scrollIntoView(text("+"\""+ Textview+"\""+"));";
		Driver.findElementByAndroidUIAutomator(scrolltoview);
		Thread.sleep(3000);
	}
}
