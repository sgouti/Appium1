package pm1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class M1 {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		SetupAndrd();
	}
	
	public static void  SetupAndrd()
	{	try {
		File fln=new File("AddFile");
		File Gtapp=new File(fln,"ApiDemos-debug.apk");
		DesiredCapabilities Cap=new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sid1");
		Cap.setCapability(MobileCapabilityType.APP, Gtapp.getAbsolutePath());
		AndroidDriver<AndroidElement> Driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
	}
	catch(MalformedURLException e)
	{
		System.out.println("eror"+ e);
	}
	}

}
