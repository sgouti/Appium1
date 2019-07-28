package pm1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GlobalMethods {
	public static AndroidDriver<AndroidElement> Driver;
	public static AndroidElement GetAndrdEleemnt(String XpathType, String value) {
		AndroidElement driver = null;

		switch (XpathType.toUpperCase()) {
		case "ID":
			driver = Driver.findElementById(value);
			break;
		case "XPATH":
			driver = Driver.findElementByXPath(value);
			break;
		case "CLASSNAME":
			driver = Driver.findElementByClassName(value);
			break;
		default:
			System.out.println("No element found");
			break;
		}
		return driver;

	}

}
