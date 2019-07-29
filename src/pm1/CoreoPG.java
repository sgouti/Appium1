package pm1;

import java.util.List;

import io.appium.java_client.android.AndroidElement;

public class CoreoPG extends GlobalLocators {
	
	
	 
	public static boolean CameraAndroidPermission()
	{
		String PsrmsnId="Eid#com.android.packageinstaller:id/permission_allow_button";
		String[] temp=PsrmsnId.split("#");
		System.out.println(temp[0]+" and "+temp[1]);
		try {
			
			if((Driver.findElementsById(temp[1]).size()==0))
			{
				System.out.println("Already Permission is given");
				return true;
			}
			
			GetAndrdEleemnt(PsrmsnId).click();
			return true;		
			}
		catch(Exception e)
		{
			return false;
				
		}
		
	}
	public static boolean AudioAndroidPermission()
	{
		String PsrmsnId="Eid#com.android.packageinstaller:id/permission_allow_button";
		String[] temp=PsrmsnId.split("#");
		System.out.println(temp[0]+temp[1]);
		try {
			
			if((Driver.findElementsById(temp[1]).size()==0))
			{
				System.out.println("Already Permission is given");
				return true;
			}
			
			GetAndrdEleemnt(PsrmsnId).click();
			return true;		
			}
		catch(Exception e)
		{
			return false;
				
		}
		
	}
	public static boolean PasscodeVrfn()
	{	String PsrmsnId="Expath#//android.widget.TextView[@text='OK']";
		String[] temp=PsrmsnId.split("#");
		System.out.println(temp[0]+temp[1]);
		try {
			
			if((Driver.findElementsById(temp[1]).size()==0))
			{
				System.out.println("Already Passcode is given");
				return true;
			}
			
			GetAndrdEleemnt(PsrmsnId).click();
			System.out.println("Please add a Passcode befored opening the App,Thanks");
			return true;	
			}
		catch(Exception e)
		{
			return false;
				
		}
		
	}

	public static void LogIn(String UserName,String Password)
	{	//AndroidElement driver;
	String SignInBtn="Expath#//android.widget.TextView[@text='Login']";
		GetAndrdEleemnt(SignInBtn).click();
	String EmailIDTxtFld="Expath#//android.widget.EditText[@text='Enter Email Address']";	//EAndiodUi#Enter Email Address
		GetAndrdEleemnt(EmailIDTxtFld).sendKeys(UserName);
	String PassTxtFld="Expath#//android.widget.EditText[@text='Enter Password']";			//EAndiodUi#Enter Password
		GetAndrdEleemnt(PassTxtFld).sendKeys(Password);
	String LoginBtn="Expath#//android.widget.TextView[@text='Login']";
		GetAndrdEleemnt(LoginBtn).click();
	}
	public static void Logout()
{
	String MenuOptn="Expath#(//android.widget.TextView[@text='Menu'])[last()]";
		GetAndrdEleemnt(MenuOptn).click();
		String UserName="Expath#(//android.widget.ImageView)[1]/following-sibling::android.widget.TextView[1]";
		String Nnme=GetAndrdEleemnt(UserName).getText();
		System.out.println(Nnme); 
		String LogoutIcon="Expath#(//android.widget.TextView[@text='Menu'])[1]//ancestor::android.view.ViewGroup[1]//android.view.ViewGroup[2]";
	
		GetAndrdEleemnt(LogoutIcon).click();
		
}
	public static void ViewProfile()
	{String MenuOptn="Expath#(//android.widget.TextView[@text='Menu'])[last()]";
	GetAndrdEleemnt(MenuOptn).click();
	String UserName="Expath#(//android.widget.ImageView)[1]/following-sibling::android.widget.TextView[1]";
	AndroidElement Name=GetAndrdEleemnt(UserName);
	String Nnme=Name.getText();
		Name.click();
		String PatientName="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.widget.TextView[1]";
		System.out.println(GetAndrdEleemnt(PatientName).getText());
		String PatientGndr="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.widget.TextView[2]";
		System.out.println(GetAndrdEleemnt(PatientGndr).getText());
		String PatientAge="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.widget.TextView[3]";
		System.out.println(GetAndrdEleemnt(PatientAge).getText());
		String Backicon= "Expath#//android.widget.TextView[@text='Profile']/preceding-sibling::android.view.ViewGroup[1]";
		GetAndrdEleemnt(Backicon).click();
	}

}

