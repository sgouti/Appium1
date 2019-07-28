package pm1;

import io.appium.java_client.android.AndroidElement;

public class Naukri extends BaseClass{

	public static void NaukriLogin() {
		AndroidElement Signin = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/b_login");
		AndroidElement EmailRdioBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/rd_email");
		AndroidElement EmailTxtfld=GetAndrdEleemnt("id", "naukriApp.appModules.login:id/et_email");
		AndroidElement PassFld = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/et_password");
		AndroidElement PassHideBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/tv_hide");
		AndroidElement LogInBtn = GetAndrdEleemnt("id", "naukriApp.appModules.login:id/bt_login");
		
		Signin.click();	
			if (EmailRdioBtn.isSelected()) {
			System.out.println("email btn is selected and Button Name:- " + EmailRdioBtn.toString());
			}
		EmailTxtfld.sendKeys("siddu@grr.la");
		PassFld.sendKeys("Siddu123");
			if (PassHideBtn.isEnabled() && !PassHideBtn.getText().equalsIgnoreCase("Show")) {
			PassHideBtn.click();
			System.out.println(PassFld.getText());
			if (PassFld.getText().startsWith("••"))// ••
			{
				System.out.println("password is not showing");
			}

		LogInBtn.click();

		}
	}

}
