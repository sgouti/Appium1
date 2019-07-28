package pm1;

import java.util.concurrent.TimeUnit;

public class Api_Demo extends BaseClass{
	public static void APIDemoTest() {
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String AppXpath = "//android.widget.TextView[@text='Preference']";
		// Driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Driver.findElementByXPath(AppXpath).click();
		Driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		// Driver.findElementById("android:id/checkbox").click();//android.widget.CheckBox
		Driver.findElementByXPath(
				"//android.widget.TextView[@text='WiFi']//ancestor::android.widget.LinearLayout//*[@resource-id='android:id/checkbox']")
				.click();

		if (Driver.findElementByXPath("//android.widget.LinearLayout//*[@text='WiFi settings']").isEnabled())// WiFi
																												// settings
		{
			System.out.println("Setting option is pass");
			Driver.findElementByXPath("//android.widget.LinearLayout//*[@text='WiFi settings']").click();
			Driver.findElementById("android:id/edit").sendKeys("Siddu");
			Driver.hideKeyboard();
			Driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
			;

		}
		if (!Driver.findElementByXPath("//android.widget.LinearLayout//*[@text='WiFi settings']").isEnabled()) {
			System.out.println("Setting option is failed");
		}
	}

	
}
