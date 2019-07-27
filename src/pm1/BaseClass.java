package pm1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AndroidDriver<AndroidElement>  SetupAndrd()
	{	
		AndroidDriver<AndroidElement> Driver;
		try {
		File fln=new File("src");
		File Gtapp=new File(fln,"ApiDemos-debug.apk");
		DesiredCapabilities Cap=new DesiredCapabilities();
		
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sid1");
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		Cap.setCapability(MobileCapabilityType.APP,Gtapp.getAbsolutePath());
		
		 Driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		 return Driver;
	}
	catch(MalformedURLException e)
	{
		System.out.println("eror"+ e);
		return null;
	}
	}
	
}
