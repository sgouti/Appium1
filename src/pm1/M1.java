package pm1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class M1 extends BaseClass {
	public static AndroidDriver<AndroidElement> Driver;
	public static void main(String[] args) throws IOException, InterruptedException    {
		// TODO Auto-generated method stub
		
		Runcmd();
		//Driver=SetupAndrd();
	//	NaukriLogin();
	
	}
	public static void APIDemoTest()
	{
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
	
	public static void NaukriLogin()
	{
		AndroidElement LoginButton=GetAndrdEleemnt("id","naukriApp.appModules.login:id/b_login");
		LoginButton.click();
		
		AndroidElement EmailRdioBtn=GetAndrdEleemnt("id","naukriApp.appModules.login:id/rd_email");
		if(EmailRdioBtn.isSelected())
		{
			System.out.println("email btn is selected and Button Name:- "+ EmailRdioBtn.toString());
		}
		GetAndrdEleemnt("id","naukriApp.appModules.login:id/et_email").sendKeys("sidu@gmail.com");//enter emailid
		AndroidElement PassFld=	GetAndrdEleemnt("id","naukriApp.appModules.login:id/et_password");
		PassFld.sendKeys(".sidsss");
		//enter pass
			AndroidElement PassHideBtn=	GetAndrdEleemnt("id","naukriApp.appModules.login:id/tv_hide");
	if(PassHideBtn.isEnabled()&& !PassHideBtn.getText().equalsIgnoreCase("Show"))
	{
		//PassHideBtn.click();
		String ss="\\android.widget.EditText[@passowrd='true']";
		System.out.println(PassFld.getText());
	if(	PassFld.getText().startsWith("."))//••
	{
		System.out.println("password is not showing");
	}

		
		
	}
	} 
	
	public static AndroidElement GetAndrdEleemnt(String XpathType,String value)
	{
		AndroidElement driver=null;
		
		switch(XpathType.toUpperCase()) {
		case "ID":
			driver=Driver.findElementById(value);
		break;	
		case "XPATH":
			driver=Driver.findElementByXPath(value);
		break;
		case "CLASSNAME":
			driver=Driver.findElementByClassName(value);
		break;
		default:
			System.out.println("No element found");
			break;
		}
		return driver;
		
	}
	public static void Runcmd() throws IOException
	{
		Process p = Runtime
                .getRuntime()
                .exec("cmd /c start cmd.exe /K \"cd C:\\Users\\siddh\\AppData\\Local\\Android\\Sdk\\emulator &&  emulator -avd Sid1");
		Process p1 = Runtime
                .getRuntime()
                .exec("cmd /c start cmd.exe /K  \"cd C:\\Users\\siddh");
		
	}

	
	
}
