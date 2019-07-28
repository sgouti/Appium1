package pm1;

import java.util.List;

import io.appium.java_client.android.AndroidElement;

public class Naukri extends BaseClass{

	public static void NaukriLogin() throws InterruptedException {
		if(Driver.findElementsByAndroidUIAutomator("text(\"LOGIN\")").size()==0)
		{
			NaukriLogout();
		}
	AndroidElement Signin = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/b_login");
		Signin.click();
		Thread.sleep(2000);
	AndroidElement EmailRdioBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/rd_email");
			if (EmailRdioBtn.isSelected()) {
			System.out.println("email btn is selected and Button Name:- " + EmailRdioBtn.toString());
			}
	AndroidElement EmailTxtfld=GetAndrdEleemnt("id", "naukriApp.appModules.login:id/et_email");		
		EmailTxtfld.sendKeys("siddu@grr.la");
	AndroidElement PassFld = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/et_password");
		PassFld.sendKeys("Siddu123");
	AndroidElement PassHideBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/tv_hide");
			if (PassHideBtn.isEnabled() && !PassHideBtn.getText().equalsIgnoreCase("Show")) {
			PassHideBtn.click();
			System.out.println(PassFld.getText());
			if (PassFld.getText().startsWith("••"))// ••
			{
				System.out.println("password is not showing");
			}
			}
	AndroidElement LogInBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/bt_login");
		LogInBtn.click();
		AndroidElement ProfleStatus = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/tv_profile_per");
		System.out.println("Profile status is :-  "+ProfleStatus.getText());
		List<AndroidElement> ClickableLnks=	Driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)");
System.out.println(	ClickableLnks.size());
for(int a=0;a<ClickableLnks.size();a++)
{
	System.out.println("Vlaues are"+ClickableLnks.get(a).getText());
}
		Thread.sleep(3000);
	
		
	}
			
			public static void NaukriLogout() throws InterruptedException
			{
				AndroidElement Moreoptn = GetAndrdEleemnt("classname", "android.widget.ImageButton");	
				Thread.sleep(3000);
					Moreoptn.click();
					 Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"FAQs\"));");
				 AndroidElement SettingsOptn = GetAndrdEleemnt("xpath", "//android.widget.TextView[@text='Settings']");	
					 SettingsOptn.click();
					 AndroidElement LogoutBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/setting_logout_textview");
					 LogoutBtn.click();
					 AndroidElement ConfrmLgout = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/ssa_save_as_alert_textview");
					 ConfrmLgout.click();
				
			}
			
			
	

}
