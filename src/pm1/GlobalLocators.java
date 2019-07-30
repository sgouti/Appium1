package pm1;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class GlobalLocators extends BaseClass {

	public static AndroidElement GetAndrdEleemnt(String LocParam) {
	
		AndroidElement driver = null;
String[] temp=LocParam.split("#");
		switch (temp[0].toUpperCase()) {
		case "EID":
			if(Driver.findElementsById(temp[1]).size()==1)
			{
			driver = Driver.findElementById(temp[1]);
			break;
			}
		case "EXPATH":
			if(Driver.findElementsByXPath(temp[1]).size()==1) {
			driver = Driver.findElementByXPath(temp[1]);
			break;}
		case "ECLASSNAME":
			if(Driver.findElementsByClassName(temp[1]).size()==1)
			{
			driver = Driver.findElementByClassName(temp[1]);
			break;}
		case "EAndiodUi":
			if(Driver.findElementsByAndroidUIAutomator("new UiSelector().text(\"temp[1]\")").size()==1)
			{
			driver = Driver.findElementByClassName(temp[1]);
			break;}
		default:
			System.out.println("No element found or more than elements found");
			break;
		}
		return driver;
}
	public static void ClearTextfield(AndroidElement TextFldEmelnt)
	{	
		int a=TextFldEmelnt.getText().length();
		TextFldEmelnt.click();
		System.out.println(a+"chars");
		for(int i=0;i<a;i++)
		{
			//Driver.getKeyboard();
			Driver.pressKeyCode(67);
		}
		Driver.hideKeyboard();
	
	}
	
}