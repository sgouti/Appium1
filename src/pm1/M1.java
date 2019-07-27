package pm1;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class M1 extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException    {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> Driver;
		Driver=SetupAndrd();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String AppXpath="//android.widget.TextView[@text='Preference']";
		//Driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Driver.findElementByXPath(AppXpath).click();
		Driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//Driver.findElementById("android:id/checkbox").click();//android.widget.CheckBox
		Driver.findElementByXPath("//android.widget.TextView[@text='WiFi']//ancestor::android.widget.LinearLayout//*[@resource-id='android:id/checkbox']").click();
	
	if(Driver.findElementByXPath("//android.widget.LinearLayout//*[@text='WiFi settings']").isEnabled())//WiFi settings
		{
			System.out.println("Setting option is pass");
			Driver.findElementByXPath("//android.widget.LinearLayout//*[@text='WiFi settings']").click();
			Driver.findElementById("android:id/edit").sendKeys("Siddu");
			Driver.hideKeyboard();
			Driver.findElementByXPath("//android.widget.Button[@text='OK']").click();;
			
		}
		 if(!Driver.findElementByXPath("//android.widget.LinearLayout//*[@text='WiFi settings']").isEnabled())
		{
			System.out.println("Setting option is failed");
		}
	
	}
	
	
	public static void Runcmd() throws IOException
	{
		Process p = Runtime
                .getRuntime()
                .exec("cmd /c start cmd.exe /K \"cd C:\\Users\\siddh\\AppData\\Local\\Android\\Sdk\\emulator &&  emulator -avd Sid1");
		 SetupAndrd();
	}

	
	
}
