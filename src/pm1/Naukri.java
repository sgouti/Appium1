package pm1;

import io.appium.java_client.android.AndroidElement;

public class Naukri extends BaseClass{

	public static void NaukriLogin() throws InterruptedException {
		AndroidElement Signin = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/b_login");
		Signin.click();
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
		Thread.sleep(3000);
	
		
	}
			
			public static void NaukriLogout() throws InterruptedException
			{
				AndroidElement Moreoptn = GetAndrdEleemnt("xpath", "//*[@class='android.widget.ImageButton']");	
				Thread.sleep(3000);
					Moreoptn.click();
					// Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Settings\"));");
				 AndroidElement SettingsOptn = GetAndrdEleemnt("xpath", "//android.widget.TextView[@text='Settings']");	
					 SettingsOptn.click();
					 AndroidElement LogoutBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/setting_logout_textview");
					 LogoutBtn.click();
					 AndroidElement ConfrmLgout = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/ssa_save_as_alert_textview");
					 ConfrmLgout.click();
				
			}
			
			
	

}
